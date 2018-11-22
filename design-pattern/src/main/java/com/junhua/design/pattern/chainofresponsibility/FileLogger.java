package com.junhua.design.pattern.chainofresponsibility;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 8:46 PM
 */
public class FileLogger extends AbstractLogger {

  @Override
  protected void preocessMessage(String message) {
    System.out.println("file output " + message);
  }

  public FileLogger(int level) {
    super(level);
  }
}
