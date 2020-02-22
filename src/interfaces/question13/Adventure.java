package interfaces.question13;

interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb extends CanOther1,CanOther2{
    void climb();
}

interface CanOther1 extends CanFly{
    void canOther1();
}

interface  CanOther2 extends CanFly{
    void canOther2();
}

class ActionCharacter{
    public void fight(){};
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
    public void swim(){};
    public void fly(){};
    public void climb(){};
    public void canOther1(){};
    public void canOther2(){};
}

public class Adventure {
    public static void x1(CanFight x){x.fight();}
    public static void x2(CanSwim x){x.swim();}
    public static void x3(CanFly x){x.fly();}
    public static void x4(ActionCharacter x){x.fight();}
    public static void x5(CanClimb x){x.climb();
                                x.fly();
                                x.canOther1();
                                x.canOther2();}
    public static void x6(CanOther1 x){x.canOther1();}
    public static void x7(CanOther2 x){x.canOther2();}
    public static void main(String[] args) {
        Hero hero=new Hero();
        x1(hero);
        x2(hero);
        x3(hero);
        x4(hero);
        x5(hero);
        x6(hero);
        x7(hero);

    }
}
