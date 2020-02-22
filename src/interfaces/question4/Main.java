package interfaces.question4;
abstract class MainAbstract{}

class NaslednicMainAbstract extends MainAbstract{
    void firtMethod(){
        System.out.println("First Method");
    }
    static void link(MainAbstract ma){
        ma=new NaslednicMainAbstract();
        ((NaslednicMainAbstract) ma).firtMethod();
    }
}

public class Main {
    private static MainAbstract mainAbstract;
    public static void main(String[] args) {
        NaslednicMainAbstract naslednicMainAbstract=new NaslednicMainAbstract();
        naslednicMainAbstract.link(mainAbstract);
    }
}
