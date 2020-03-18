//Контейнер Map используется для хранения количества объектов типа Pet.
//Ключами контейнера Map являются имена типов Pet, а значениями - количество Pet.
//Оператор instanceof используется для подсчета объектов Pet

package typeInformations;

import typeInformations.pets.PetCreator;
import typeInformations.pets.Pet;

import java.util.HashMap;

public class PetCount {
    static class PetCounter extends HashMap<String, Integer>{
        public void count(String type){
            Integer quantitute=get(type);
            if(quantitute==null){
                put(type, 1);
            }else {
                put(type, quantitute+1);
            }

        }

        public static void countPets(PetCrea){
            PetCounter counter=new PetCounter();
            for (Pet pet:creator.createArray(20)) {

            }

        }
    }

}
