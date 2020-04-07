//Используте композицию вместо наследования при адаптации Fibonacci,
//обеспечивая поддержку Iterable
package generics.question7;

import generics.coffee.Generator;

import java.util.Iterator;

public class IterableFibonacci implements Iterable<Integer>, Generator<Integer> {
    private int count = 0;
    private int m;
    public Integer next() { return fib(count++); }
    private int fib(int n) {
        if(n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }
    public IterableFibonacci() {}
    public IterableFibonacci(int m) { this.m = m; }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() { return m > 0; }
            public Integer next() {
                m--;
                return IterableFibonacci.this.next();
            }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        IterableFibonacci gen = new IterableFibonacci();
        for(int i = 0; i < 18; i++)
            System.out.print(gen.next() + " ");
        System.out.println();
        Iterator it = new IterableFibonacci(20).iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");
    }
}
