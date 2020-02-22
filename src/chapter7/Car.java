package chapter7;

class Engine{
    public void start(){};//запустить
    public void rev(){};//переключить
    public void stop(){};//остановить
    public void service(){}
}
class Wheel{
    public void inflate(int psi){}
}
class Window{
    public void rollup(){}//поднять
    public void rolldown(){}//опустить
}
class Door{
    public Window window=new Window();//окно двери
    public void open(){}
    public void close(){}
}

public class Car {
    public Engine engine=new Engine();
    public Wheel[] wheels=new Wheel[4];
    public Door left=new Door(), right=new Door();

    public Car(){
        for (int i=0; i<4; i++){
            wheels[i]=new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car=new Car();
        car.left.window.rollup();
        car.wheels[0].inflate(47);
        car.engine.service();
    }
}
