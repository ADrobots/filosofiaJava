/**
 * Измените пример CADSystem и покажите, что при возврате управления из середины
 * try-finally все равно выполняеются необходимые завершающие действия
 */

package exceptions.question16;
//Обеспечение необходимого завершения

class Shape{
    Shape(int i){
        System.out.println("Конструктор Shape() вызван");
    }
    void dispose(){
        System.out.println("Завершение Shape()");
    }
}

class Circle extends Shape {
    Circle(int i){
        super(i);
        System.out.println("Рисуем окружность Circle()"+"\n");
    }
   void dispose(){
       System.out.println("Стираем окружность Circle()");
        super.dispose();
    }
}

class Triangle extends Shape {
    Triangle(int i){
        super(i);
        System.out.println("Рисуем треугольник Triangle()"+"\n");
    }
    void dispose(){
        System.out.println("Стираем треугольник Triandle()");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;
    Line(int start, int end){
        super(start);
        this.start=start;
        this.end=end;
        System.out.println("Рисуем линию Line "+start+", "+end+"\n");
    }
    void dispose(){
        System.out.println("Стираем линию LIne "+start+", "+end);
        super.dispose();
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

public class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] line=new Line[3];
    //Комбинированный конструктор
    public CADSystem(int i){
        super(i+1);
        for(int j=0; j<line.length; j++){
            line[j]=new Line(j,j*j);
            c=new Circle(1);
            t=new Triangle(1);
            System.out.println("Комбинированный конструктор \n\n");
        }
    }
    void dispose(){
        System.out.println("CADSystem.dispose()");
        //Завершение осуществляется в порядке, обратном порядку инициализации
        t.dispose();
        c.dispose();
        for(int i=line.length-1; i>=0; i--){
            line[i].dispose();
            super.dispose();
        }
    }

    public static void main(String[] args) {
        CADSystem cad=new CADSystem(3);
        try {
            if(cad.line[2]!=null){
                System.out.println("Такая линия есть \n");
                return;}

        } finally {
            cad.dispose();
        }
    }
}
