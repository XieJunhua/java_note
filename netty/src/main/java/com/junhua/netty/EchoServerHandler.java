package com.junhua.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/21 7:10 AM
 *
 * 业务逻辑的具体实现类, 实现的几个方法都是来自ChannelInboundHandler中,
 * ChannelInboundHandlerAdapter实现了ChannelInboundHandler中的很多方法
 * 这里需求简单，我们直接继承ChannelInboundHandlerAdapter实现我们自己的方法就行了
 */
@ChannelHandler.Sharable
public class EchoServerHandler extends ChannelInboundHandlerAdapter  {

  /**
   * 每次有消息传入都会调用
   * @param ctx 上下文
   * @param msg 传入的消息
   * @throws Exception
   */
  @Override
  public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

    ByteBuf in = (ByteBuf)msg;
    System.out.println("receive: " + in.toString(CharsetUtil.UTF_8));
    if (in.hasArray()) {

    }
//    ctx.channel().write(in);
    ctx.write(in); // 将接受到的内容写给发送者
  }

  /**
   * 通知ChannelInboundHandler最后一次对channelRead的调用时当前批量读取中的最后一条消息
   * 通知他buffer中没有数据了
   * @param ctx
   * @throws Exception
   */
  @Override
  public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
    System.out.println(ctx.pipeline().toMap());
    ctx.writeAndFlush(Unpooled.EMPTY_BUFFER)
            .addListener(ChannelFutureListener.CLOSE);
  }

  /**
   * 读取期间的异常处理
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
