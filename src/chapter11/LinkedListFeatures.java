package chapter11;

import chapter11.typeinfo.pets.Hamster;
import chapter11.typeinfo.pets.Pet;
import chapter11.typeinfo.pets.Pets;
import chapter11.typeinfo.pets.Rat;

import java.util.LinkedList;


/**
 * LinkedList реализует базовый интерфейс List
 * Выполняет операции вставки и удаления в середние списка
 * более эффективно чем ArrayList. С операциями произвольного
 * доступа работает менее эффективно
 *
 * Методы
 * - getFirst(), element() идентичны, возвращают первый элемент
 * списка без удаления и выдают исключение NoSuchElementExeprtion
 * если список пуст
 * - peek() метод, возвращает null для пустого списка
 * - addFirst() метод, возвращает элемент начала списка
 * - offer(), add(), addLast() методы, добавляют элемент
 * в конец списка
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets=new LinkedList<Pet>(Pets.arrayList(5));
        System.out.println(pets);

        //Идентичные методы
        System.out.println("pets.getFirst(): "+pets.getFirst());
        System.out.println("pets.element(): "+pets.element());
            //Отличное поведение при выводе пустого списка
            System.out.println("pets.peek(): "+pets.peek());

        //Идентичные методы, удаление и возвращение первого элемента
        System.out.println("pets.remove(): "+pets.remove());
        System.out.println("pets.removeFirst(): "+pets.removeFirst());
            //Отличное поведение для пустого списка
            System.out.println("pets.poll(): "+pets.poll());
            System.out.println(pets);

        pets.addFirst(new Rat());
        System.out.println("После addFirst(): "+pets);
        pets.offer(Pets.randomPet());
        System.out.println("После add(): "+pets);
        pets.addLast(new Hamster());
        System.out.println("После addLas(): "+pets);
        System.out.println("pets.removeLast(): "+pets.removeLast());


    }
}
