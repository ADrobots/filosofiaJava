package chapter11.question10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

abstract class Rodent{
    private String name="Rodent;";
    protected  void eat(){
        System.out.println("Rodent.eat()");
    }
    protected void run(){
        System.out.println("Rodent.run()");
    }
    protected void sleep(){
        System.out.println("Rodent.sleep()");
    }
    abstract void expirience();
    public String toString(){
        return name;
    }
}

class Mouse extends Rodent {
    private static int counter=0;
    private final int id=counter++;

    private String name="Mouse";
    protected void eat(){
        System.out.println("Mouse.eat()");
    }
    protected void run(){
        System.out.println("Mouse.run()");
    }
    protected void sleep(){
        System.out.println("Mouse.sleep()");
    }

    void expirience() {
        System.out.println("Mouse "+id);
    }

    public String toString(){
        return name;
    }
}

class Rat extends Rodent {
    private static int counter=0;
    private final int id=counter++;

    private String name="Rat";
    protected void eat(){
        System.out.println("Rat.eat()");
    }
    protected void run(){
        System.out.println("Rat.run()");
    }
    protected void sleep(){
        System.out.println("Rat.sleep()");
    }
    void expirience() {
        System.out.println("Rat "+id);
    }
    public String toString(){
        return name;
    }
}

class Squirrel extends Rodent {
    private static int counter=0;
    private final int id=counter++;

    private String name="Squirrel";
    protected void eat(){
        System.out.println("Squirrel.eat()");
    }
    protected void run(){
        System.out.println("Squirrel.run()");
    }
    protected void sleep(){
        System.out.println("Squirrel.sleep()");
    }
    void expirience(){
        System.out.println("Squirrel "+id);
    }
    public String toString(){
        return name;
    }
}


class RandomGenerator{
    Random random=new Random(47);
    public Rodent gen(){
        switch (random.nextInt(3)){
            default:
            case 0: return new Mouse();
            case 1: return new Rat();
            case 2: return new Squirrel();
        }
    }
}

public class MainRodent {
    public static RandomGenerator randomGenerator=new RandomGenerator();

    public static void main(String[] args) {
        Rodent[] rodents=new Rodent[10];
        ArrayList<Rodent> rodents1=new ArrayList<Rodent>();

        for (int i=0; i<10; i++){
            rodents1.add(randomGenerator.gen());
        }

        Iterator<Rodent> it=rodents1.iterator();
        while(it.hasNext()){
            Rodent r=it.next();
            r.eat();
            r.run();
            r.sleep();
            r.expirience();
        }
    }


}
