package chapter10.question8;

public class Outer {
    class Inner{
        private int i=1;
        private String one="One";
        private void getHi(){
            System.out.println("hi");
        }

    }

    void getMembersInner(){
        System.out.println(new Inner().i);
        System.out.println(new Inner().one);
        new Inner().getHi();

    }

    public static void main(String[] args) {
        new Outer().getMembersInner();
    }
}
