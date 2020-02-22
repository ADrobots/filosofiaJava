package interfaces.question17;
interface StaticFinalItemInterface{
    String transport="car";
    int numberOfWheels=4;
}

public class StaticIFinaltem implements StaticFinalItemInterface {


    public static void main(String[] args) {
        System.out.println(StaticFinalItemInterface.numberOfWheels);

        StaticIFinaltem sfi=new StaticIFinaltem();

        //sfi.transport="motocycle";
        //transport="motocycle";
        //numberOfWheels++;

        //все поля в интерфейсах являются static и final, то есть не изменяемые

    }
}
