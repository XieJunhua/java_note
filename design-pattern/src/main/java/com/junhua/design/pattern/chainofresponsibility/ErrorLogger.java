package com.junhua.design.pattern.chainofresponsibility;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 8:44 PM
 */
public class ErrorLogger extends AbstractLogger {

  @Override
  protected void preocessMessage(String message) {
    System.out.println("error logger message: " + message);
  }

  public ErrorLogger(int level) {
    super(level);
  }
}
