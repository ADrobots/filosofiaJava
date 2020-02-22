package chapter7;
//Обеспечение необходимого завершения

class Shape{
    Shape(int i){
        System.out.println("Конструктор Shape()");
    }
    void dispose(){
        System.out.println("Завершение Shape()");
    }
}

class Circle extends Shape{
    Circle(int i){
        super(i);
        System.out.println("Рисуем окружность Shape()");
    }
   void dispose(){
       System.out.println("Стираем окружность Shape()");
        super.dispose();
    }
}

class Triangle extends Shape{
    Triangle(int i){
        super(i);
        System.out.println("Рисуем треугольник Triangle()");
    }
    void dispose(){
        System.out.println("Стираем треугольник Triandle()");
        super.dispose();
    }
}

class Line extends Shape{
    private int start, end;
    Line(int start, int end){
        super(start);
        this.start=start;
        this.end=end;
        System.out.println("Рисуем линию Line "+start+", "+end);
    }
    void dispose(){
        System.out.println("Стираем линию LIne "+start+", "+end);
        super.dispose();
    }
}

public class CADSystem extends Shape{
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
            System.out.println("Комбинированный конструктор");
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
        CADSystem cad=new CADSystem(47);
        try {

        }finally {
            cad.dispose();
        }
    }
}
