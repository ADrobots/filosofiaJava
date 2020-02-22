package chapter10.question3;

public class Outer {
    private String text;

    Outer(String text){
        System.out.println("Outer()");
        this.text=text;
    }

    class Inner{
        Inner(){
            System.out.println("Inner()");
        }
        @Override
        public String toString() {
            return text;
        }
    }


    Inner getInner(){
        System.out.println(new Inner());
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer=new Outer("text");
        Inner inner=outer.getInner();
        System.out.println(inner.toString());

    }
}
