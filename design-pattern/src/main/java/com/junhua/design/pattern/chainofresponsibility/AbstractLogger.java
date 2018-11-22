package com.junhua.design.pattern.chainofresponsibility;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 8:33 PM
 */
public abstract class AbstractLogger {
  public static int INFO = 1;
  public static int DEBUG = 2;
  public static int ERROR = 3;

  protected int level;

  public AbstractLogger(int level) {
    this.level = level;
  }

  protected AbstractLogger nextLogger;

  public void handMessage(int level, String message) {
    if (this.level <= level) {
      this.preocessMessage(message);
    }
    // 判断链条上是否有下一节，如果有，执行下一节上面的命令，让责任链往下进行
    if (nextLogger != null) {
      nextLogger.handMessage(level, message);
    }
  }


  public void setNextLogger(AbstractLogger nextLogger) {
    this.nextLogger = nextLogger;
  }

  abstract protected void preocessMessage(String message);

}
