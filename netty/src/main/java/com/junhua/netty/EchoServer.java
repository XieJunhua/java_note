package com.junhua.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/21 7:16 AM
 * 引导服务器:
 * 1. 绑定服务器监听端口
 * 2. 配置Channel，将所有的入站消息通知到EchoSeverHandler
 */
public class EchoServer {

  private final int port;

  public EchoServer(int port) {
    this.port = port;
  }

  public static void main(String[] args) throws InterruptedException {
    new EchoServer(8888).start();
  }

  public void start() throws InterruptedException {
    final EchoServerHandler echoServerHandler = new EchoServerHandler();
    EventLoopGroup group = new NioEventLoopGroup();
    try {

      ServerBootstrap b = new ServerBootstrap();
      b.group(group)
              .channel(NioServerSocketChannel.class)  // 指定所有NIO传输的channel
              .localAddress(new InetSocketAddress(port)) // 使用指定的端口设置套接字地址
              .childHandler(new ChannelInitializer<SocketChannel>() { // 新的连接被接受时，一个新的子Channel将会被创建
                @Override
                public void initChannel(SocketChannel ch) throws Exception {
                  ch.pipeline().addLast(echoServerHandler); // 添加我们自己的EchoServerHandler到ChannelPipeline中
                }
              });
      ChannelFuture f = b.bind().sync(); // 调用sync阻塞等待，直到绑定完成
      f.channel().closeFuture().sync(); // 调用sync阻塞等待，直到服务器的Channel关闭
    } finally {
      group.shutdownGracefully().sync();

    }

  }

}
