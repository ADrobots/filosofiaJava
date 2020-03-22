package typeInformations.question11;

import typeInformations.pets.Pet;

import java.util.ArrayList;

public class Pets1 {
    public static final PetCreator1 creator=new LiteralPetCreator1();

    public static Pet randomPet(){
        return creator.randomPet();
    }

    public static Pet[] createArray(int size){
        return creator.createArray(size);
    }

    public static ArrayList<Pet> arrayList(int size){
        return  creator.arrayList(size);
    }
}

/**
 * Фасад так-же обеспечивает доступ к randomPet(), createArray()и arrayList()
 * {@link typeInformations.PetCount2}
 */
