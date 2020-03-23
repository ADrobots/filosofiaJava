package typeInformations.question12;

import net.mindview.util.TypeCounter;

public class Question12 {
    public static void main(String[] args) {
        TypeCounter typeCounter=new TypeCounter(Coffee.class);
        for (Coffee coffe:new CoffeeGenerator(20)) {
            System.out.print(coffe.getClass().getSimpleName()+" ");
            typeCounter.count(coffe);
        }
        System.out.println();
        System.out.println(typeCounter);
    }
}
