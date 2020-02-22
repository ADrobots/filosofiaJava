package chapter11;

import chapter11.typeinfo.pets.Cat;
import chapter11.typeinfo.pets.Dog;
import chapter11.typeinfo.pets.Hamster;
import chapter11.typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap=new HashMap<String, Pet>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Deil"));
        petMap.put("My Hamster", new Hamster("Ratatui"));
        System.out.println(petMap);

        Pet dog=petMap.get("My Dog");
        System.out.println(dog);

        /**
         *
         * containsKey()-метод, проверяет присутствие ключа
         * containsValue()-метод, проверяет присутствие значения
         *
         */

        System.out.println(petMap.containsKey("My Dog"));
        System.out.println(petMap.containsValue(dog));
    }
}

/**
 * next {@link chapter11.MapOfList}
 */

