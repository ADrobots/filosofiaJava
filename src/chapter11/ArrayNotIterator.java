/**
 * Команда foreach работает с массивом и любой другой реализацией Iterable,
 * но не реализует Iterable, и не подразумевает автоматической упаковки
 */

package chapter11;

import java.util.Arrays;

public class ArrayNotIterator {
    static <T> void test(Iterable<T> it){
        for (T t:it) {
            System.out.print(t+" ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(4,5,6));

        String[] string={"A", "B", "C"};
        //Массив работает в foreach, но не является Iterable
        //test(string);

        //Необходимо явно преобразовать в Iterable(посредством передачи массива в List)
        test(Arrays.asList(string));
    }
}
