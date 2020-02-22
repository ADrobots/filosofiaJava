package chapter7.question5;

class A{
    public A() {
        System.out.println("Constructor A()");
    }
}

class B{
    public B() {
        System.out.println("Constructor B()");
    }
}

public class C extends A{
    public B b=new B();

    public static void main(String[] args) {
        C c=new C();
    }
}
