package interfaces;

import java.util.Random;

public class RandomDouble {
    private static Random random=new Random(47);
    public double next(){return random.nextDouble();}

    public static void main(String[] args) {
        RandomDouble randomDouble=new RandomDouble();
        for (int i=0;i<7; i++){
            System.out.println(randomDouble.next()+" ");
        }
    }
}
