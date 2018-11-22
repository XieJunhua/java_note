package com.junhua.design.pattern.command;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 8:12 PM
 * 具体的命令，购买股票
 */
public class BuyCommand extends Command {

  public BuyCommand(Stock stock) {
    super(stock);
  }

  @Override
  void execute() {
    super.stock.buy();
  }
}
