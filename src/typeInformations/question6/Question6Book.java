/**
 * Измените пример Shape.java так, чтобы он мог "выделять"(установкой внутреннего
 * флага) все фигуры некоторого типа. Метод toString() каждого класса, производного
 * от Shape, должен указывать, находится ли данная фигура в "выделенном" состоянии
 */

//вариант из книги
package typeInformations.question6;

import java.util.Arrays;
import java.util.List;

abstract class Shape1{
    //мой вариант
    Boolean myFlag=false;
    void draw(){
        System.out.println(this+".draw()");
    }
    abstract public String toString();
    //мой вариант
     Boolean setHighlighted(){
         return this.myFlag=true;
     }

}

class Circle1 extends Shape1 {
//    Boolean flag=false;
    @Override
//    public String toString(){
//        return (flag ? "H":"Unh")+"ighlighted "+"Circle";
//    }
    public String toString(){
        return (myFlag ? "H":"Unh")+"ighlighted "+"Circle";
    }
}

class Triangle1 extends Shape1 {
    Boolean flag=false;
    @Override
    public String toString(){
        return (flag ? "H":"Unh")+"ighlighted "+"Triangle";
        }
}

class Square1 extends Shape1 {
    Boolean flag=false;
    @Override
    public String toString() {
        return (flag ? "H":"Unh")+"ighlighted "+"Square";
    }
}

class Rhomboid1 extends Shape1 {
    Boolean flag=false;
    @Override
    public String toString() {
        return (flag ? "H":"Unh")+"ighlighted "+"Rhomboid";
    }
}


public class Question6Book {

   public static void setFlag(Shape1 s){
        if (s instanceof Triangle1){
            ((Triangle1)s).flag=true;
        }

    }

    public static void main(String[] args){
       //вариант из книги
//    List<Shape1> shapes=Arrays.asList(new Circle1(), new Triangle1(), new Square1());
//        for (Shape1 sh:shapes) {
//            setFlag(sh);
//            sh.draw();
//        }

        //мой вариант
        Circle1 circle1=new Circle1();
        circle1.setHighlighted();
        List<Shape1> shapes=Arrays.asList(circle1, new Triangle1(), new Square1());
        for (Shape1 sh:shapes) {
            sh.draw();
        }
    }


}
