//Адаптация класса Fibonacci для поддержки Iterable
package generics;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int n;
    public IterableFibonacci(int count){
        this.n=count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n>0;
            }

            @Override
            public Integer next() {
                n--;
                return IterableFibonacci.this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (Integer i:new IterableFibonacci(6)) {
            System.out.print(i+" ");
        }
    }
}

/**
 * Чтобы использовать IterableFibonacci в foreach передаем в конструктор границу
 * , чтобы метод hasNext знал, когда вернуть false.
 */
