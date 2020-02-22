package chapter7.question15;

import chapter7.question15.pack.PackOne;

public class PackThree extends PackOne {

    void packThreeone(String t){
        super.pechat(t);
    }

    public static void main(String[] args) {
        PackThree packThree=new PackThree();
        packThree.pechat1();
        packThree.packThreeone("!");
        packThree.pechat1();
        PackTwo.main(args);

    }
}
