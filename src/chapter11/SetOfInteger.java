package chapter11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Set - контейнер. Сохраняет не более одног экземпляра каждого
 * объекта-значения.
 * Поиск по ключу - самая важная операция для Set
 * Set обладает таким же интерфейсом как Collection
 */

public class SetOfInteger {
    public static void main(String[] args) {
        Random random=new Random(47);
        Set<Integer> inset=new HashSet<Integer>();
        for (int i=0; i<10000; i++){
            inset.add(random.nextInt(30));
        }
        System.out.println(inset);
    }
}

/**
 * HashSet использует для скорости хэширование, поэтому порядок
 * в TreeSet и LinkedHashSet отличаются. Так как каждая реализация
 * использует свой механизм хранения элементов
 * LinkedHashSet использует хэширование для повышения скорости поиска
 * по ключу.
 *
 * next {@link chapter11.SortedSetOfInteger}
 */
