package chapter11;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {
    protected String[] words=("A'm glad to see you").split(" ");




    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                //не реализован
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s:new IterableClass()) {
            System.out.print(s+" ");
        }
    }
}

/**
 * Метод iterator() возвращает анонимный класс(внутреннюю реализацию) Iterator<String>
 * которое выдает каждое слово в массиве.
 * Iterable Class работает в синтаксисе foreach
 * next {@link chapter11.EnvironmentVariable}
 */
