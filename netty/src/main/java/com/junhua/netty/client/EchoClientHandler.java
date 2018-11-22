package com.junhua.netty.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/21 7:53 AM
 */
@ChannelHandler.Sharable
public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {


  /**
   * 连接到服务器的连接建立之后调用
   * @param ctx
   * @throws Exception
   */
  @Override
  public void channelActive(ChannelHandlerContext ctx) throws Exception {
    ctx.writeAndFlush(Unpooled.copiedBuffer("中国人", CharsetUtil.UTF_8));
  }

  /**
   * 从服务器接受第一条消息时被调用
   * 从服务器发过来的消息可能会被分块接受，即使是少量数据，channelRead0也可能被调用多次
   * @param channelHandlerContext
   * @param byteBuf
   * @throws Exception
   */
  @Override
  protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
    System.out.println(channelHandlerContext.pipeline().toMap());
    System.out.println("client received: " + byteBuf.toString(CharsetUtil.UTF_8));
  }

  /**
   * 处理过程中发生异常时被调用
   * @param ctx
   * @param cause
   * @throws Exception
   */
  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    cause.printStackTrace();
    ctx.close();
  }
}
