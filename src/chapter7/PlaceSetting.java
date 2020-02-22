package chapter7;
class Plate{
    Plate(int i){
        System.out.println("Конструктор Plate()");
    }
}
class DinnerPlate extends Plate{
    DinnerPlate(int i){
        super(i);
        System.out.println("Конструктор DinnerPlate()");
    }
}

class Utensil{
    Utensil(int i){
        System.out.println("Конструктор Utensil()");
    }
}
class Spoon extends Utensil{
    Spoon(int i){
        super(i);
        System.out.println("Конструктор Spoon()");
    }
}
class Fork extends Utensil{
    Fork(int i){
        super(i);
        System.out.println("Конструктор Fork()");
    }
}
class Knife extends Utensil{
    Knife(int i){
        super(i);
        System.out.println("Конструктор Knife()");
        }
}

class Custom{
    Custom(int i){
        System.out.println("Конструктор Custom()");
    }
}

public class PlaceSetting extends Custom{
    private Spoon sp;
    private Fork fk;
    private Knife kn;
    private DinnerPlate dp;


    PlaceSetting(int i){
        super(i+1);
        sp=new Spoon(i+2);
        fk=new Fork(i+3);
        kn=new Knife(i+4);
        dp=new DinnerPlate(i+5);

        System.out.println("Конструктор PlaceSetting()");
    }

    public static void main(String[] args) {
        PlaceSetting placeSetting=new PlaceSetting(1);
    }
}
