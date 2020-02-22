package interfaces.question5_6;

import interfaces.question5_6.one.OneInterface;

public class Main implements OneInterface {
    @Override
    public void one() {
        System.out.println("one");
    }

    @Override
    public void two() {
        System.out.println("two");
    }

    @Override
    public void three() {
        System.out.println("three");
    }

    public static void main(String[] args) {
        Main main=new Main();
        main.one();
        main.two();
        main.three();
    }
}
