package chapter11;

import chapter11.typeinfo.pets.Pet;
import chapter11.typeinfo.pets.Pets;

import java.util.*;

public class InterfaceVsIterator {
    public static void display(Iterator<Pet> it){
        while(it.hasNext()){
            Pet p=it.next();
            System.out.print(p.id()+": "+p+" ");
        }
        System.out.println();
    }
    public static void display(Collection<Pet> pets){
        for (Pet p:pets) {
            System.out.print(p.id()+": "+p+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> petList= Pets.arrayList(8);
        Set<Pet> petSet=new HashSet<Pet>(petList);
        Map<String, Pet> petMap=new LinkedHashMap<String, Pet>();
        String[] names=("Ralf Eric Robin Esli Britney Sam Spot Flussi").split(" ");

        for (int i=0; i<names.length; i++){
            petMap.put(names[i], petList.get(i));
            display(petList);
            display(petSet);
            display(petList.iterator());
            display(petSet.iterator());
            display(petMap.values());
            display(petMap.values().iterator());
        }
    }
}
/**
 * Обе версии display() работают с объектами Map, а так же подтипами Collection?
 * причем как интерфейс Collection, так и Iterator отделяют методы display() от
 * информции о конекретной реализации используемого контейнера.
 * В данном случае эти два метода равноценны. Collection является предпочтительней,
 * так как display(Collection) можно использовать конструкцию foreach, с которым код
 * выглядит аккуратнее
 * Решение с Iterator выглядит привлекательней при написании клсса, в котором реализация
 * Collection затруднена или непрактична.
 * next {@link chapter11.CollectionSequence}
 */
