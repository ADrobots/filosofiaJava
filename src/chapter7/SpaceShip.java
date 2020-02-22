package chapter7;

class SpeceShipControls{
    void up(int velocity){}
    void down(int velocity){}
    void left(int velocity){}
    void right(int velocity){}
    void forvard(int velosity){}
    void back(int velocity){}
    void turboBust(){}
}

public class SpaceShip extends SpeceShipControls{
    private String name;
    public SpaceShip(String name){this.name=name;}
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector=new SpaceShip("NSEA Protector");
        protector.forvard(100);
    }
}
