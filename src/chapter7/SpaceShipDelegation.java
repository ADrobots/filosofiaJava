package chapter7;



public class SpaceShipDelegation {
    private String name;
    private SpeceShipControls controls=new SpeceShipControls();
    public SpaceShipDelegation(String name){
        this.name=name;
    }
    //Делегированные методы
    public void back(int velocity){
        controls.back(velocity);
    }
    public void down(int velocity){
        controls.down(velocity);
    }
    public void forvard(int velocity){
        controls.forvard(velocity);
    }
    public void left(int velocity){
        controls.left(velocity);
    }
    public void right(int velocity){
        controls.right(velocity);
    }
    public void turboBust(){
        controls.turboBust();
    }
    public void up(int velocity){
        controls.up(velocity);
    }
}
