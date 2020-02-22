package chapter10.question7;

public class Car {
    private int wheels=4;
    private void startTheEngine(){
        System.out.println("Вруммм ...");
    }

    class InnerClass{
        int wheelsReplace(int i){
            System.out.println("Замена на "+i);
            Car.this.startTheEngine();
            return Car.this.wheels=i;
        }

    }

    int getCar(int i){
        return new InnerClass().wheelsReplace(i);
    }

    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(car.wheels);
        car.getCar(2);
        System.out.println(car.wheels);
    }
}
