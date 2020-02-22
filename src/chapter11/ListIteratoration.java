package chapter11;

import chapter11.typeinfo.pets.Pet;
import chapter11.typeinfo.pets.Pets;

import java.util.List;
import java.util.ListIterator;

/**
 *  Интерфейс ListIterator, более мощноя разновидность
 *  Iterator, работает с классами List. ListIteratir двухсторонний,
 *  может выдать индексы следующего и предыдущего элемента. Так же может
 *  заменить последний элемент методом set()
 *  Метод listIterator() возвращает объеки ListIterator, указывающий на начало
 *  List, а вызов метода listIterator(n) создаст объект ListIterator, изначально
 *  установленный в позицию списка и индексом n
 *
 */


public class ListIteratoration {

    public static void main(String[] args) {

        List<Pet> pets= Pets.arrayList(8);
        ListIterator<Pet> it=pets.listIterator();

        while(it.hasNext()){
            System.out.print(it.next()+", "+it.nextIndex()+", "+it.previousIndex()+"; ");

        }

        System.out.println();
        //обход в обратном направлении
        while(it.hasPrevious()){
            System.out.print(it.previous().id()+" ");
        }

        System.out.println();

        System.out.println(pets);

        it=pets.listIterator(3);
        while(it.hasNext()){
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }

}
