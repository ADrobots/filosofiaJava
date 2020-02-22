package chapter7.question18;

import java.util.Random;

class TwoObject{
    TwoObject(){};
    public String toString(){

        return "TwoObject";
    }
}

public class OneObject {
    private String name;
    public OneObject(String s){name=s;}

    static final TwoObject twoObject1=new TwoObject();
    private final TwoObject twoObject2=new TwoObject();

    static  final String sfs="static final";
    private final String pfs="private final";

    private static Random random=new Random();

    static final int sfi=random.nextInt();
    private final int pfi=random.nextInt();

    public String toString(){
        return (name+": "+twoObject1+", "+twoObject2+", "+sfs+", "+", "+pfs+", "+sfi+", "+pfi);
    }

    public static void main(String[] args) {
        OneObject o1=new OneObject("oneObject1");
        OneObject o2=new OneObject("oneObject2");
        OneObject o3=new OneObject("oneObject3");

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
    }
}
