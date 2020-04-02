package typeInformations.question16;//: generics/coffee/CoffeeGenerator.java
// Generate different types of Coffee:

import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator
implements Generator<Coffee16>, Iterable<Coffee16> {
  private Class[] types = { Latte16.class, Mocha16.class,
    Cappuccino16.class, Americano16.class, Breve16.class, };
  private static Random rand = new Random(47);
  public CoffeeGenerator() {}
  // For iteration:
  private int size = 0;
  public CoffeeGenerator(int sz) { size = sz; }	
  public Coffee16 next() {
    try {
      return (Coffee16)
        types[rand.nextInt(types.length)].newInstance();
      // Report programmer errors at run time:
    } catch(Exception e) {
      throw new RuntimeException(e);
    }
  }
  class CoffeeIterator implements Iterator<Coffee16> {
    int count = size;
    public boolean hasNext() { return count > 0; }
    public Coffee16 next() {
      count--;
      return CoffeeGenerator.this.next();
    }
    public void remove() { // Not implemented
      throw new UnsupportedOperationException();
    }
  };	
  public Iterator<Coffee16> iterator() {
    return new CoffeeIterator();
  }
  public static void main(String[] args) {
    CoffeeGenerator gen = new CoffeeGenerator();
    for(int i = 0; i < 5; i++)
      System.out.println(gen.next());
    for(Coffee16 c : new CoffeeGenerator(5))
      System.out.println(c);
  }
} /* Output:
Americano 0
Latte 1
Americano 2
Mocha 3
Mocha 4
Breve 5
Americano 6
Latte 7
Cappuccino 8
Cappuccino 9
*///:~
