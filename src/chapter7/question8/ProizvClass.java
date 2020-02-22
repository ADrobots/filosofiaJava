package chapter7.question8;

class Base{
    Base(String b){
        System.out.println(""+b);
    }
}

public class ProizvClass extends Base{
    ProizvClass() {
        super("Базовый класс");
    }
    ProizvClass(String p) {
        super("Базовый класс 2");
        System.out.println("+");
        System.out.println(""+p);
    }

    public static void main(String[] args) {
        ProizvClass proizvClass=new ProizvClass();
        ProizvClass proizvClass1=new ProizvClass("Производный класс");
    }



}

