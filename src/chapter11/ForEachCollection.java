package chapter11;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForEachCollection {
    public static void main(String[] args) {
        //Создаем контейнер
        Collection<String> cs=new LinkedList<String>();
        //Заполняем контейнер строковыми переменными
        Collections.addAll(cs, "Один два три четыре пять".split(" "));

        for (String s:cs) {
            System.out.print("'"+s+"' ");
        }
    }
}

/**
 * Конструкция foreach может использоваться для всех объектов Collection
 * Это работает, благодаря интерфейса Iterable, которвый содержит метод iterator() для получения
 * объекта Iterator.
 * Интрефейс Iterable использует foreach для перемещения по последовательности
 *
 * т.е. любой класс, реализующий интерфейс Iterable, может использоваться в компанде foreach()
 * next {@link chapter11.IterableClass}
 */
