package typeInformations;

import java.util.Arrays;
import java.util.List;

abstract class Shape{
    //метод draw() использует метод toString() для вывода идентификатора класса,
    //передавая методу SOUT ссылку this
    void draw(){
        System.out.println(this+".draw()");
    }
    //метод toString() объявлен как абстрактный чтобы производные объекты были обязаны
    //переопределить его а так же во избежании создания экземпляра Shape
    abstract public String toString();

}

class Circle extends Shape{
    //каждый производный клсаа переопределяет метод toString()
    //чтобы меод draw() полиморфно выводил в каждом случае различную информацию
    @Override
    public String toString(){
        return "Circle";
    }
}

class Triangle extends Shape{
    @Override
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
    //Во время помещения в контейнер List<Shape> объектов произвоходит восходящее преобразование
    //При восходящем преобразовании объекты теряют конкретную разновидность Shape
    List<Shape> shapes=Arrays.asList(new Circle(), new Triangle(), new Square());
    //Это основная форма RTTI, все подобные преобразования проверяются во время исполнения на корректность
    //RTTI служит для проверки типа истинного объекта во время выполнения программы.
    //Во время компиляции, при помещении объектов в контейнер, требуется явное преобразование типов
        for (Shape sh:shapes) {
            //далее вступает полиморфизм - для каждой фигуры Shape вызывается метод.
            sh.draw();
        }
    }

}
//Основная часть кода не должна знать о фактическом типе объекта, она оперирует с целым семейством объектов(
//в нашем случае это фигура Shape

/**
 * {@link typeInformations.intro.introduction.txt}
 */
