package chapter7.question7;

class A{
    A(int a){
        System.out.println("Constructor A() "+a);
    }
}

class B{
    B(int b){
        System.out.println("Constructor B() "+b);
    }
}

public class C extends A{
    C(String c){
        super(11);
        B b=new B(12);
        System.out.println("Constructor C() "+ c);
    }

    public static void main(String[] args) {
        C c=new C("Hello");
    }
}
