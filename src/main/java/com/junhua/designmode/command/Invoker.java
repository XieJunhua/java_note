package com.junhua.designmode.command;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 8:13 PM
 * 调用者类，接收命令，执行命令
 */
public class Invoker {

  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void action() {
    this.command.execute();
  }
}
