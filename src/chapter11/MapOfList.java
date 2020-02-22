package chapter11;

import chapter11.typeinfo.pets.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Map, как массивы и Collection легко расширяются до нескольких измерений.
 * Достаточно создать Map, значения которого могут быть другие контейнеры,
 * в том числе и другие контейнеры Map. Контейнеры легко объединяются для
 * быстрого получения нетривиальных(неочевидных, сложных) структур данных
 */

public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPeople=new HashMap<Person, List<? extends Pet>>();

    static {
        petPeople.put(new Person("Anton"), Arrays.asList(new Cat("Marciz"), new Dog("Deila")));
        petPeople.put(new Person("Denis"), Arrays.asList(new Hamster("Nastya")));
        petPeople.put(new Person("Valera"), Arrays.asList(new Cat("Tema"), new Dog("Kyssi")));
    }

    public static void main(String[] args) {
        System.out.println("People: "+petPeople.keySet());//вывод ключей коллекции, то есть людей
        System.out.println("Pets: "+petPeople.values());//вывод значений коллекций, то есть животных

        for (Person person:petPeople.keySet()) {
            System.out.println(person+" has: ");
            for (Pet pet:petPeople.get(person)) {
                System.out.println(pet+" ");
            }
            System.out.println();
        }

    }

}

/**
 * Map - контейнер, может вернуть:
 * -  множество(Set) своих ключей
 * - коллекцию(Collection) своих значений или множество (Set) их пар
 * keySet() - возвращает контейнер Set(содержит все ключи их petPeople,
 * который используется в команде foreach для перебора эхлементов Map
 */
