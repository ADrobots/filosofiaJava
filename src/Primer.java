class Primer1{

    private static Primer1 primer1=new Primer1();

    private Primer1(){};


    public static Primer1 getPrimer1(){
        return primer1;
    }

    public String toString(){
        return "Hello of Primer1 ";
    }
}

class Primer2{}

public class Primer {
    public static void main(String[] args) {
        //Primer1 pr=new Primer1();
        Primer1 pr1=Primer1.getPrimer1();
        System.out.println(pr1);
        Primer1 pr2=Primer1.getPrimer1();
        System.out.println(pr2);

        Primer2 primer2=new Primer2();
        System.out.println(primer2);
        Primer2 primer21=new Primer2();
        System.out.println(primer21);
    }

}
