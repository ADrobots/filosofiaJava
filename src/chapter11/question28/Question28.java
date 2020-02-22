package chapter11.question28;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Question28 {
    public static void printPQ(Queue queue){
        while (queue.peek()!=null){
            System.out.print(queue.poll()+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue<Double> doublePriorityQueue=new PriorityQueue<Double>();
        Random random=new Random(47);

        //Первый вариант
        for (int i=0; i<10; i++){
            doublePriorityQueue.offer((double)random.nextInt(i+10));
        }
        printPQ(doublePriorityQueue);

        //Второй вариант
        for (double j=0; j<10; j++){
            doublePriorityQueue.offer(random.nextDouble());
        }
        printPQ(doublePriorityQueue);

        //Вариант из книги
        Random random1=new Random();
        for (int i=0; i<10; i++){
            doublePriorityQueue.offer(random1.nextDouble()*i);
        }
        printPQ(doublePriorityQueue);
    }
}
