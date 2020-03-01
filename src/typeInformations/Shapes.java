package typeInformations;

import java.util.Arrays;
import java.util.List;

abstract class Shape{
    void draw(){
        System.out.println(this+".draw()");
    }
    abstract public String toString();
}

class Circle extends Shape{
    public String toString(){
        return "Circle";
    }
}

class Triangle extends Shape{
    public String toString(){
        return "Triangle";
        }
}

class Square extends Shape{
    @Override
    public String toString() {
        return "Square";
    }
}


public class Shapes {

    public static void main(String[] args) {

    List<Shape> shapes=Arrays.asList(new Circle(), new Triangle(), new Square());

        for (Shape sh:shapes) {
            sh.draw();
        }
    }

}
