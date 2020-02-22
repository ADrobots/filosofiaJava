package chapter11.question31;//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.

import java.util.*;

public class RandomShapeGenerator implements Iterable<Shape>{

  private Random rand = new Random(47);
  public Shape create() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
    }
   }

   private Shape[] shapes;

  RandomShapeGenerator(int s){
    shapes=new Shape[s];
    for (int i=0; i<shapes.length; i++){
      shapes[i]=create();
    }
  }

  @Override
  public Iterator<Shape> iterator() {
    return new Iterator<Shape>() {
      private int index=0;
      @Override
      public boolean hasNext() {
        return index<shapes.length;
      }

      @Override
      public Shape next() {
        return shapes[index++];
      }

      @Override
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
  }
} ///:~
