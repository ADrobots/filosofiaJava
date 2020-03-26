//Инструмент для случайного создания разных объектов, производных от Pet
//Так же для создания массивов и контейнеров List с элементами Pet
package typeInformations.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class PetCreator {
    private Random rand=new Random(47);
    //Контейнер List с разными видами создаваемых объектов Pet
    public abstract List<Class<? extends Pet>> types();

    //метод взят из конспекта
//    //создание одного случайного объекта Pet
//    public Pet randomPet(){
//        int n=rand.nextInt(types().size());
//        try{
//            return types().get(n).newInstance();
//        }catch (InstantiationException e){
//            throw new RuntimeException(e);
//        }catch (IllegalAccessException e){
//            throw new RuntimeException(e);
//        }
//    }

    //Метод взят из задания номер 15
    public Pet randomPet(){
        return PetFactory.createRandom();
    }

    public Pet[] createArray(int size){
        Pet[] result=new Pet[size];
        for (int i=0; i<size; i++){
            result[i]=randomPet();
        }
        return result;
    }

    public ArrayList<Pet> arrayList(int size){
        ArrayList<Pet> result=new ArrayList<Pet>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}

//Абстрактный метод types() обращается к производному классу для получения контейнера List объект Class
//Тип класса указан как любой тип, производный от Pet.

//Метод randomPet() осуществляет случайное индексирование List и использует выбранный Class для создания
//нового экземпляра методом Class.newInstance()

//Метод createArray() используется для заполнения массива метод randomPet()

//Метод arrayList() последовательно использует createArray()

/**
 * {@link typeInformations.pets.ForNameCreator}
 */
