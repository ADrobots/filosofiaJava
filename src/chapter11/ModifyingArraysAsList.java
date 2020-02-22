/**
 * Метод Collections.shuffle не влияет на исходный массив
 * т.к. перемешивает только ссылки в shuffled
 * Это истинно только потому, что метод randimized() "заворачивает"
 * результат Arrays.asList() в ArrayList.
 * Если контейнер List полученный вызовом Arrays.asList() будет перемешиваться
 * напрямую, это повлияет на базовый массив.
 */

package chapter11;

import java.util.*;

public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random random=new Random(47);
        Integer[] integers={1,2,3,4,5,6,7,8,9};

        //Способ пермешивания, без исзменения исходного массива
        List<Integer> list1=new ArrayList<Integer>(Arrays.asList(integers));
        System.out.println("До перемешивания: "+list1);
        Collections.shuffle(list1, random);
        System.out.println("После перемешивания: "+list1);
        System.out.println("Массив после манипуляций: "+Arrays.toString(integers));

        //Способ пермешивания, с дальнейшим ищзменение первоначального массива
        List<Integer> list2=Arrays.asList(integers);
        System.out.println("До перемешивания: "+list2);
        Collections.shuffle(list2, random);
        System.out.println("После перемешивания: "+list2);
        System.out.println("Массив после манипуляций: "+Arrays.toString(integers));

    }
}

/**
 * В первом случае вывод Arrays.asList() передается конструктору ArraList, который создает объект
 * ArrayList, ссылающийся на элемент integers
 * Во втором случае, если использовать Arrays.asList напрямую, перемешивание изменит
 * порядок integers
 */
