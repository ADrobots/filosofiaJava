package chapter7.question16;
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
        a.lapi();
        a.glaza();
        a.sliz();
    }
}

public class Frog extends Amphidian{
    public static void main(String[] args) {
        Frog frog=new Frog();
        Amphidian.lyaguha(frog);
    }
}
