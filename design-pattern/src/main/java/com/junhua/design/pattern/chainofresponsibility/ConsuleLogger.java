package com.junhua.design.pattern.chainofresponsibility;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 8:42 PM
 */
public class ConsuleLogger extends AbstractLogger {


  public ConsuleLogger(int level) {
    super(level);
  }

  @Override
  protected void preocessMessage(String message) {
    System.out.println("console output message: " + message);

  }
}
