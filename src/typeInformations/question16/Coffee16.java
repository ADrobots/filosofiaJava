//: generics/coffee/Coffee16.java
package typeInformations.question16;

import typeInformations.factory.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Coffee16 {
  private static long counter = 0;
  private final long id = counter++;
  public String toString() {
    return getClass().getSimpleName() + " " + id;
  }

  static List<Factory<? extends Coffee16>> coffeFactory=new ArrayList<Factory<? extends Coffee16>>();

  static{
    coffeFactory.add(new Latte16.Factory());
    coffeFactory.add(new Mocha16.Factory());
    coffeFactory.add(new Cappuccino16.Factory());
    coffeFactory.add(new Americano16.Factory());
    coffeFactory.add(new Breve16.Factory());
  }

  private static Random random=new Random();

  public static Coffee16 createRandom(){
    int n=random.nextInt(coffeFactory.size());
    return coffeFactory.get(n).create();
  }
} ///:~
