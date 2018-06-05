package com.victor.newfeatures.lambda;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiejunhua on 2018/4/11.
 */
public class ForEachTest {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList();
    Aoo aoo = new ForEachTest().new Aoo();
    arrayList.add("a");
    arrayList.add("b");
    Random random = new Random();
    arrayList.forEach(x -> {
      String str = x;

      try {
        TimeUnit.SECONDS.sleep(random.nextInt(4));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      if (aoo.getStr() != null) {
        aoo.setStr(aoo.getStr().concat(str));
      } else {
        aoo.setStr(str);
      }


    });
    System.out.println(aoo);



  }

  class Aoo {
    private String str;

    public String getStr() {
      return str;
    }

    public void setStr(String str) {
      this.str = str;
    }

    @Override
    public String toString() {
      return "Aoo{" +
              "str='" + str + '\'' +
              '}';
    }
  }
}
