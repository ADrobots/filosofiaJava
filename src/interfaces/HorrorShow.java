package interfaces;
interface Monster{
    void menace();
}

interface DangerousMonster extends Monster{
    void destroy();
}

interface Lethal{
    void kill();
}

class DragonZilla implements DangerousMonster{
    public void menace() {};
    public void destroy(){};
}

interface Vampire extends DangerousMonster, Lethal{
    void drinkBlood();
}

class VeryBadVampire implements Vampire{
    public void destroy(){};
    public void kill(){};
    public void drinkBlood(){};
    public void menace(){};
}

public class HorrorShow {
    public static void m(Monster m){m.menace();}
    public static void dm(DangerousMonster dm){
        dm.menace();
        dm.destroy();
    }
    public static void l(Lethal l){l.kill();}

    public static void main(String[] args) {
        DangerousMonster barney=new DragonZilla();
        m(barney);
        dm(barney);
        Vampire vlad=new VeryBadVampire();
        m(vlad);
        dm(vlad);
        l(vlad);
    }

}
