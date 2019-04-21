package com.junhua.netty.javanio;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.CharsetUtil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.concurrent.TimeUnit;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/23 7:26 AM
 */
public class NioTest {
  public static void main(String[] args) throws IOException {
//    FileChannel fileChannel = new RandomAccessFile("./README.md", "rw").getChannel();
//    ByteBuffer buffer = ByteBuffer.allocate(48);
//    int byteRead = fileChannel.read(buffer);
//    while (byteRead != -1) {
//      buffer.flip();
//      while (buffer.hasRemaining()) {
//        System.out.println((char) buffer.get());
//      }
//      buffer.clear();
//      byteRead = fileChannel.read(buffer);
//    }
//    fileChannel.close();
//
//    Selector selector = Selector.open();
//    Channel channel = SocketChannel.open();
//    ((SocketChannel) channel).register(selector, SelectionKey.OP_ACCEPT);
    ByteBuf byteBuf = Unpooled.copiedBuffer("netty in action", CharsetUtil.UTF_8);
    System.out.println(byteBuf.toString());
//    new Thread(() -> {
////      try {
////        TimeUnit.SECONDS.sleep(5L);
////      } catch (InterruptedException e) {
////        e.printStackTrace();
////      }
//      System.out.println("ddd");
//    }).start();
//    System.out.println("hh");
    System.out.println(((String) null).valueOf(1));


  }

}
