package interfaces.question9;
enum Note1{
    MIDDLE_C,
    MIDDLE_D
}
abstract class GeneralMethods{
    abstract void play(Note1 n);
    public String toString(){return "GeneralMethods";}
    abstract void adjust();
}

interface Instrument1{
    int value=5;
    void play(Note1 n);
    String toString();
    void adjust();
}

class Wind1 extends GeneralMethods implements Instrument1{
    public void play(Note1 n) {
        System.out.println(this+".play"+n);
    }
    public void adjust() {
        System.out.println(this+".adjust()");
    }
    public String toString(){
        return "Wind";
    }
}

class Percussion1 extends GeneralMethods implements Instrument1 {
    public void play(Note1 n){
        System.out.println(this+".play"+n);
    }
    public void adjust(){
        System.out.println(this+".adjust()");
    }
    public String toString(){
        return "Percussion";
    }
}

class Stringed1 extends GeneralMethods implements Instrument1 {
    public void play(Note1 n){
        System.out.println(this+".play"+n);
    }
    public void adjust(){
        System.out.println(this+".adjust()");
    }
    public String toString(){
        return "Stringed";
    }
}

class Brass1 extends Wind1 {
   public String toString(){
        return "Brass";
    }
}

class WoodWind1 extends Wind1 {
    public String toString(){
        return "WoodWind";
    }
}

public class Music5 {
    static void tune(Instrument1 i){
        i.play(Note1.MIDDLE_C);
    }

    static void tuneAll(Instrument1[] e){
        for (Instrument1 i:e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument1[] orchester={
                new Wind1(),
                new Percussion1(),
                new Stringed1(),
                new Brass1(),
                new WoodWind1()

        };

        tuneAll(orchester);
    }
}
