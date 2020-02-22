package chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
    public static void printQ(Queue queue){
        while(queue.peek()!=null){
            System.out.print(queue.remove()+" ");}

           System.out.println();

    }

    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<Integer>();
        Random random=new Random(47);
        for (int i=0; i<10; i++){
            queue.offer(random.nextInt(i+10));
            printQ(queue);
        }

        System.out.println();
        Queue<Character> qc=new LinkedList<Character>();
        for (Character ch:"Hello".toCharArray()) {
            qc.offer(ch);
            printQ(qc);
        }
    }
}
/**
 * offer - метод, вставляет элемент в конец очереди или возвращает null
 * peek() и element() - методы, возвращают элемент в начале очереди,
 * peek() возвращает null для пустой очереди, element() выдает исключение NoSuchElementExeption
 *
 * poll() и remove() - методы, извлекают и возвращают элемент в начале очереди,
 * poll() возвращает null для пустой очереди, remove() выдает мсключение NoSuchElementExeption
 *
 * Автоматическая упаковка преобразует значение int, полученное в результате  вызова
 * nextInt в объект Integer, char - в объект Character для qc.
 */