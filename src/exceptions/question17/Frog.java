package exceptions.question17;

class Characteristic{
    private String s;
    Characteristic(String s){
        this.s=s;
        System.out.println("Создаем Characteristic "+s);
    }

    protected void dispose(){
        System.out.println("Завершение Characteristic "+s);
    }
}

class Description{
    private String s;
    Description(String s){
        this.s=s;
        System.out.println("Создаем Description "+s);
    }

    protected void dispose(){
        System.out.println("Завершение Description "+s);
    }
}

class LivingCreature{
    private Characteristic p=new Characteristic("живое существо");
    private Description t=new Description("обычное живое существо");

    LivingCreature(){
        System.out.println("Вызывается конструктор LivingCreature");
    }

    protected void dispose(){
        System.out.println("dispose in LivingCreature");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature{
    private Characteristic p=new Characteristic("имеет серде");
    private Description t=new Description("животное, не растение");
    Animal(){
        System.out.println("Вызывается конструктор Animal");
    }
    protected void dispose(){
        System.out.println("dispose in Animal");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal{
    private Characteristic p=new Characteristic("может жить в воде");
    private Description t=new Description("и в воде, и на земле");
    Amphibian(){
        System.out.println("Вызывается конструктор из Amphibian");
    }
    protected void dispose(){
        System.out.println("Dispose in  Amphibian");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

public class Frog extends Amphibian{
    private Characteristic p=new Characteristic("квакает");
    private Description t=new Description("есть жуков");

    public Frog(){
        System.out.println("Вызывается конструктор из Frog");
    }

    void jump(){
        System.out.println("Прыгает");
    }

    protected void dispose(){
        System.out.println("Завершение Frog()");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog f=new Frog();
        try {
            f.jump();
            return;
        }finally {
            f.dispose();
        }
    }
}
