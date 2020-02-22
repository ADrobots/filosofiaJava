package chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
    public static void main(String[] args) {
        Random random=new Random(47);
        Map<Integer, Integer> m=new HashMap<Integer, Integer>();

        for (int i=0; i<10000; i++){
            int r=random.nextInt(20);
            Integer freq=m.get(r);
            m.put(r, freq==null? 1 : freq+1);
        }
        System.out.println(m);
    }
}

/**
 * В качестве ключа используется сгенерированное число(r),
 * в качестве значения - количество сгенерированных экземпляров этого числа
 *
 * В контейнере нельзя хранить примитивы, только ссылки на объект. Поэтому в методе main
 * автоматическая упаковка преобразует сгенерированное число в класс - "обертку" Integer,
 * чтобы его можно было использовать в HashMap
 *
 * Метод get() возвращает null если ключ отсутствует в контейнере,
 * иначе возвращает для этого ключа ассоциированное значение Integer. которое увеличивается на 1
 *
 * next {@link chapter11.PetMap}
 */
