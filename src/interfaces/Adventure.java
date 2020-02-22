package interfaces;

interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}

class ActionCharacter{
    public void fight(){};
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly{
    public void swim(){};
    public void fly(){};

}

public class Adventure {
    public static void x1(CanFight x){x.fight();}
    public static void x2(CanSwim x){x.swim();}
    public static void x3(CanFly x){x.fly();}
    public static void x4(ActionCharacter x){x.fight();}

    public static void main(String[] args) {
        Hero hero=new Hero();
        x1(hero);
        x2(hero);
        x3(hero);
        x4(hero);

    }
}
