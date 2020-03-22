package typeInformations.question11;

import net.mindview.util.TypeCounter;
import typeInformations.pets.*;

public class PetCount41 {
    public static void main(String[] args) {
        TypeCounter counter=new TypeCounter(Pet.class);
        for (Pet pet: Pets1.createArray(20)) {
            System.out.print(pet.getClass().getSimpleName()+" ");
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }
}
