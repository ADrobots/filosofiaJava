/**
 * Измените пример Shape.java так, чтобы он мог "выделять"(установкой внутреннего
 * флага) все фигуры некоторого типа. Метод toString() каждого класса, производного
 * от Shape, должен указывать, находится ли данная фигура в "выделенном" состоянии
 */
package typeInformations.question6;

import java.util.Arrays;
import java.util.List;

abstract class Shape{
    //мой вариант
    Boolean isHighlighted=false;
    void draw(){
        System.out.println(this+".draw()");
    }
    abstract public String toString();

}

class Circle extends Shape {
    @Override
    public String toString(){
        return "Circle is "+this.isHighlighted;
    }
}

class Triangle extends Shape {
    @Override
    public String toString(){
        return "Triangle is "+this.isHighlighted;
        }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square is "+this.isHighlighted;
    }
}

class Rhomboid extends Shape {

    @Override
    public String toString() {
        return "Rhomboid is "+this.isHighlighted;
    }
}


public class Question6 {

    public static void main(String[] args){
        Circle circle=new Circle();
        circle.isHighlighted=true;
    List<Shape> shapes=Arrays.asList(circle, new Triangle(), new Square());
        for (Shape sh:shapes) {
            sh.draw();
        }
    }

}
