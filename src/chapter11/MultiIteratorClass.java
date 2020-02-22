package chapter11;

import java.util.*;

public class MultiIteratorClass extends IterableClass {
    public Iterable<String> reversed(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current=words.length-1;
                    @Override
                    public boolean hasNext() {
                        return current>-1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<String> randomized(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffle=new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shuffle, new Random(47));
                return shuffle.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIteratorClass mic=new MultiIteratorClass();

        //В обратном порядке
        for (String s1:mic.reversed()) {
            System.out.print(s1+" ");
        }

        System.out.println();

        //В случайном порядке
        for (String s2:mic.randomized()) {
            System.out.print(s2+" ");
        }

        System.out.println();

        //Вывод с помощью прямого iterator(по умолчанию)
        for (String s3:mic) {
            System.out.print(s3+" ");
        }
    }

}

/**
 * Второй метод, random(), не создает свой объект Iterator, а возвращает объект
 * из перемешанного контейнера List
 *
 * next {@link chapter11.ModifyingArraysAsList}
 */
