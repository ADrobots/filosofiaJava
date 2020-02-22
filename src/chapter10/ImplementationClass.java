package chapter10;

class WithInnerClass{
    class InnerClass{
        public InnerClass(String s){
            System.out.println("In inner class: "+s);
        }
    }
}

public class ImplementationClass {
    class InnerClassInIC extends WithInnerClass.InnerClass{
        InnerClassInIC(WithInnerClass wic){
            wic.super("Hello");

        }
    }

    public static void main(String[] args) {
        WithInnerClass wic=new WithInnerClass();
        ImplementationClass ic=new ImplementationClass();
        InnerClassInIC icinic=ic.new InnerClassInIC(wic);
    }
}
