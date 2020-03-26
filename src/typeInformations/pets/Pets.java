package typeInformations.pets;

        import java.util.ArrayList;

public class Pets {
    public static final PetCreator creator=new LiteralPetCreator();

    public static Pet randomPet(){
        return creator.randomPet();
    }

//Данный метод был взят и конспекта
//    public static Pet[] createArray(int size){
//        return creator.createArray(size);
//    }

    //Данный метод был взят из задания номер 15
    public static Pet[] createArray(int size){
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size){
        return  creator.arrayList(size);
    }
}
