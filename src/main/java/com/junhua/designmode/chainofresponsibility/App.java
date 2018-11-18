package com.junhua.designmode.chainofresponsibility;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 8:49 PM
 */
public class App {

  private static AbstractLogger getLogger() {
    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    AbstractLogger consoleLogger = new ConsuleLogger(AbstractLogger.INFO);

    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);

    return errorLogger;
  }


  public static void main(String[] args) {

    AbstractLogger loggerChain = getLogger();

    loggerChain.handMessage(AbstractLogger.INFO,
            "This is an information.");

    loggerChain.handMessage(AbstractLogger.DEBUG,
            "This is an debug level information.");

    loggerChain.handMessage(AbstractLogger.ERROR,
            "This is an error information.");

  }

}
