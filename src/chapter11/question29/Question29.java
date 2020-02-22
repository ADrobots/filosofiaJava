package chapter11.question29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class SimpleClass extends Object{
    int id=0;
    SimpleClass(Integer id){
        this.id=id;
    }

}

public class Question29{
    public static void main(String[] args) {
        List<SimpleClass> simpleClasses= Arrays.asList(new SimpleClass(1), new SimpleClass(2), new SimpleClass(3));

        PriorityQueue<SimpleClass> simpleClassPriorityQueue=new PriorityQueue<SimpleClass>();


        for (SimpleClass sc:simpleClasses) {
            simpleClassPriorityQueue.offer(sc);
        }

        while(simpleClassPriorityQueue!=null){
            System.out.println(simpleClassPriorityQueue.poll()+" ");
        }
    }

}
