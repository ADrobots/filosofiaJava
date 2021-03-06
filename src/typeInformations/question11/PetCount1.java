//Контейнер Map используется для хранения количества объектов типа Pet.
//Ключами контейнера Map являются имена типов Pet, а значениями - количество Pet.
//Оператор instanceof используется для подсчета объектов Pet

package typeInformations.question11;


import typeInformations.pets.*;

import java.util.HashMap;

public class PetCount1 {
    static class PetCounter extends HashMap<String, Integer>{
        public void count(String type){
            Integer quantitute=get(type);
            if(quantitute==null){
                put(type, 1);
            }else {
                put(type, quantitute+1);
            }

        }
    }

        public static void countPets(PetCreator1 creator){
            PetCounter counter=new PetCounter();
            for (Pet pet:creator.createArray(20)) {
                //подсчет объектов Pet
                System.out.print(pet.getClass().getSimpleName()+" ");
                if (pet instanceof Gerbil) counter.count("Gerbil");
                if (pet instanceof Pet) counter.count("Pet");
                if (pet instanceof Dog) counter.count("Dog");
                if (pet instanceof Mutt) counter.count("Mutt");
                if (pet instanceof Pug) counter.count("Pug");
                if (pet instanceof Cat) counter.count("Cat");
                if (pet instanceof Manx) counter.count("EgyptiaMau");

            }
            System.out.println();
            System.out.println(counter);

        }


    public static void main(String[] args) {
        countPets(new ForNameCreator11());
    }


}

/**
 * В методе countPets() массив Pet[] создается методом createArray() из класса PetCreator1
 *
 * Каждый объект Pet проверяется и подсчитывается с использованием inctanceof
 * Недостатком оператора inctanceof является только вомзожность сравнить с именованным типом а не с объектом Class.
 *
 */
