package com.junhua.refactoring.chap01;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by xiejunhua on 2018/6/2.
 */
public class Customer {
  private String name;
  private Vector<Rental> rentals = new Vector<>();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental rental) {
    rentals.addElement(rental);
  }

  public String getName() {
    return name;
  }

  public String statement() {
    double totalAmount = 0;
    // 会员积分
    int frequentRenterPoints = 0;
    Enumeration<Rental> _rentals = rentals.elements();
    String result = "Rental Record for " + getName() + "\n";
    while (_rentals.hasMoreElements()) {
      double thisAmount = 0;
      Rental each = _rentals.nextElement();

      switch (each.getMovie().getPriceCode()) {
        case Movie.REGULAR:
          thisAmount += 2;
          if (each.getDaysRented() > 2) {
            thisAmount += (each.getDaysRented() - 2) * 1.5;
          }
          break;
        case Movie.CHILDREN:
          thisAmount += 1.5;
          if (each.getDaysRented() > 3) {
            thisAmount += (each.getDaysRented() - 3) * 1.5;
          }
          break;
        case Movie.NEW_RELEASE:
          thisAmount += each.getDaysRented() * 3;
          break;
      }

      frequentRenterPoints ++;
      if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) {
        frequentRenterPoints ++;
      }

      result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
      totalAmount += totalAmount;


    }
    result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
    result += "you earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
    return result;
  }
}
