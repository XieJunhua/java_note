package com.junhua.design.pattern.command;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 8:09 PM
 * 具体的命令，售出股票
 */
public class SellCommand extends Command {

  public SellCommand(Stock stock) {
    super(stock);
  }

  @Override
  public void execute() {
    super.stock.sell();

  }
}
