package interfaces;
enum Note{
    MIDDLE_C,
    MIDDlE_D
}

abstract class Instrument{
    private int i;
    public abstract void play(Note n);
    public String what(){return "Instrument";};
    public abstract void adjust();
}

class Wind extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Wind.play "+n);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println("Adjust");
    }
}
class Percussion extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Percussion.play "+n);
    }

    @Override
    public String what() {
        return "What";
    }

    @Override
    public void adjust() {
        System.out.println("Adjast");
    }
}
class Stringer extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Stringer,play "+n);
    }

    @Override
    public String what() {
        return "String";
    }

    @Override
    public void adjust() {
        System.out.println("Adjust");
    }
}

class Brass extends Wind{
    @Override
    public void play(Note n) {
        System.out.println("Brass.play "+n);
    }

    @Override
    public String what() {
        return "Brass";
    }

    @Override
    public void adjust() {
        System.out.println("Adjust");
    }
}
class WoodWind extends Wind{
    @Override
    public void play(Note n) {
        System.out.println("WoodWind.play "+n);
    }

    @Override
    public String what() {
        return "WoodWind";
    }

    @Override
    public void adjust() {
        System.out.println("Adjust");;
    }
}

public class Music4 {
   static void tune(Instrument i){
        i.play(Note.MIDDlE_D);
    }

    static void tunnAll(Instrument[] e){
        for (Instrument i:e){
            tune(i);
        }
    }
    public static void main(String[] args) {
       Instrument[] orchestr={
               new Wind(),
               new Percussion(),
               new Stringer(),
               new Brass(),
               new WoodWind()
       };
       tunnAll(orchestr);
    }
}
