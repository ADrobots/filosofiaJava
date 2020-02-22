package interfaces.question10;
enum Note1{
    MIDDLE_C,
    MIDDLE_D
}
interface Playable{
    void play(Note1 n);
}

interface Instrument1{
    int value=5;
    void adjust();
}

class Wind1 implements Instrument1, Playable {
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

class Percussion1 implements Instrument1, Playable {
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

class Stringed1 implements Instrument1, Playable {
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
    static void tune(Playable i){
        i.play(Note1.MIDDLE_C);
    }

    static void tuneAll(Playable[] e){
        for (Playable i:e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Playable[] orchester={
                new Wind1(),
                new Percussion1(),
                new Stringed1(),
                new Brass1(),
                new WoodWind1()

        };

        tuneAll(orchester);
    }
}
