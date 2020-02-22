package chapter10.question5;

class Outer{
    Outer(){
        System.out.println("Outer()");
    }

    class Inner{
        Inner(){
            System.out.println("Inner");
        }
    }

    Inner inner(){
        return new Inner();
    }
}

public class Completed {

    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner i=o.inner();
        Outer.Inner i2=o.new Inner();
    }


}
