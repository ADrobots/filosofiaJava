//Генерирование последовательности Фибоначчи
package generics;

import generics.coffee.Generator;

public class Fibonacci implements Generator<Integer> {
    private int count=0;

    private int fib(int n){
        if (n<2){return 1;}
        return fib(n-2)+fib(n-1);
    }

    @Override
    public Integer next() {
        return fib(count++);
    }

    public static void main(String[] args) {
        Fibonacci gen=new Fibonacci();
        for(int i=0; i<10; i++){
            System.out.print(gen.next()+" ");
        }
    }
}

/**
 * Примитивы не могут использоваться в качестве параметров-типов. Хотя в JavaSE5
 * появились удобные средства автоматической упаковки и распаковки для перехода
 * от примитивного типа к объектным "оберткам" и обратно. Эффект проявляется в этом примере
 * так как значение int прозрачно используется и производится классом.
 */
