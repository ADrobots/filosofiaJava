package interfaces.question18;
interface Cycle{boolean startTheEngine();}
interface CycleFactory{Cycle getCycle();}

class Unicycle implements Cycle{
    public boolean startTheEngine(){
        System.out.println("Unicycle: The engine is running");
        return true;
    }
}
class UnicycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Unicycle();
    }
}

class Tricycle implements Cycle{
    public boolean startTheEngine(){
        System.out.println("Tricycle: The engine is running");
        return true;
    }
}
class TrycycleFacoty implements CycleFactory{
    public Cycle getCycle(){
        return new Tricycle();
    }
}

class Motocycle implements Cycle{
    public boolean startTheEngine(){
        System.out.println("MOtocycle: The engine is running");
        return true;
    }
}
class MotocycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return
                new Motocycle();
    }
}

public class WheeledTransport {
    public static void go(CycleFactory cycleFactory){
        Cycle cycle=cycleFactory.getCycle();
        cycle.startTheEngine();
    }

    public static void main(String[] args) {
        go(new UnicycleFactory());
    }
}
