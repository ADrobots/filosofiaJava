package typeInformations.question11;

import net.mindview.util.MapData;
import typeInformations.pets.LiteralPetCreator;
import typeInformations.pets.Pet;
import typeInformations.pets.Pets;

import java.util.LinkedHashMap;
import java.util.Map;


public class PetCount31 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>,Integer>{
        public PetCounter(){
            super(MapData.map(LiteralPetCreator1.allTypes,0));

        }

        public void count(Pet pet){
            for (Map.Entry<Class<? extends Pet>, Integer> pair: entrySet()){
                if (pair.getKey().isInstance(pet)){
                    put(pair.getKey(), pair.getValue()+1);
                }
            }

        }

        public String toString(){
            StringBuilder result=new StringBuilder("{");
            for(Map.Entry<Class<? extends Pet>, Integer> pair: entrySet()){
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            };
            result.delete(result.length()-2, result.length());
            result.append("}");
            return result.toString();
        }
    }

    public static void main(String[] args) {
        PetCounter petCounter=new PetCounter();
        for (Pet pet: Pets1.createArray(20)) {
            System.out.print(pet.getClass().getSimpleName()+" ");
            petCounter.count(pet);
        }
        System.out.println();
        System.out.println(petCounter);
    }


}

/**
 * Карта PetCounter заполняется разновидностями Pet из LiteralPetCreator1.allTypes.
 * Класс MapData используется для получения Iterable(в данном случае allTypes) и константы(в данном случае 0)
 * и заполняется ключами из allTypes, ассоциированные со значением 0.
 * Метод isInstance() избавляет от необхоимости многократно использовать inctanceof. Теперь
 * легко в программу добавить новый тип - для этого достаточно просто изменить массив
 * LiteralPetCreatr.types. Остальная часть программы не требует правки(в отличии от реализации
 * inctanceof)
 * Методо toString() перегружен для удобочитаемого результата.
 *
 */
