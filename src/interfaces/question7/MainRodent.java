package interfaces.question7;

import java.util.Random;
interface Rodent{
    String name="Rodent;";
    void eat();
    void run();
    void sleep();
    void expirience();
    }

class Mouse implements Rodent {
    private static int counter=0;
    private final int id=counter++;

    private String name="Mouse";
    public void eat(){
        System.out.println("Mouse.eat()");
    }
    public void run(){
        System.out.println("Mouse.run()");
    }
    public void sleep(){
        System.out.println("Mouse.sleep()");
    }

    public void expirience() {
        System.out.println("Mouse "+id);
    }

    public String toString(){
        return name;
    }
}

class Rat implements Rodent {
    private static int counter=0;
    private final int id=counter++;

    private String name="Rat";
    public void eat(){
        System.out.println("Rat.eat()");
    }
    public void run(){
        System.out.println("Rat.run()");
    }
    public void sleep(){
        System.out.println("Rat.sleep()");
    }
    public void expirience() {
        System.out.println("Rat "+id);
    }
    public String toString(){
        return name;
    }
}

class Squirrel implements Rodent {
    private static int counter=0;
    private final int id=counter++;

    private String name="Squirrel";
    public void eat(){
        System.out.println("Squirrel.eat()");
    }
    public void run(){
        System.out.println("Squirrel.run()");
    }
    public void sleep(){
        System.out.println("Squirrel.sleep()");
    }
    public void expirience(){
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

        for (Rodent r:rodents) {
            r=randomGenerator.gen();
            r.eat();
            r.run();
            r.sleep();
            r.expirience();
            System.out.println();
        }
    }


}
