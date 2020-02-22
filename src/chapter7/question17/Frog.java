package chapter7.question17;
class Amphidian{
    protected void lapi(){
        System.out.println("paws");
    }
    protected void glaza(){
        System.out.println("eyes");
    }
    protected void sliz(){
        System.out.println("slime");
    }
    static void lyaguha(Amphidian a){
        System.out.println("Amphidian lyaguha");
    }
}

public class Frog extends Amphidian {
    @Override
    protected void lapi() {
        System.out.println("Frog paws");
    }

    @Override
    protected void glaza() {
        System.out.println("Frog eyes");
    }

    @Override
    protected void sliz() {
        System.out.println("Frog slime");
    }

    static void lyaguha(Amphidian a){
        System.out.println("Frog lyaguha");
    }



    public static void main(String[] args) {
        Frog frog=new Frog();
        frog.lapi();
        frog.glaza();
        frog.sliz();

        frog.lyaguha(frog);
        Amphidian.lyaguha(frog);
    }
}
