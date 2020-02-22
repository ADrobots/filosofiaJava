package interfaces.question3;
abstract class MainAbstract{
    abstract void print();

    public MainAbstract(){
        System.out.println("MainAbstract");
        print();
    }
}

class Main1 extends MainAbstract{
    private int i=1;
    @Override
    void print() {
        System.out.println("Main "+i);
    }
}

public class Main{
    public static void main(String[] args) {
        Main1 main1=new Main1();
        main1.print();
    }
}
