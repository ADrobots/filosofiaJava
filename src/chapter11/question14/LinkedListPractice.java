package chapter11.question14;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListPractice {

    public static void inputMiddle(LinkedList<Integer> l, Integer [] integers){
        for (Integer i:integers) {
            ListIterator<Integer> it=l.listIterator(l.size()/2);
            it.add(i);


            System.out.println(l);
        }


    }

    public static void main(String[] args) {
        LinkedList<Integer>  llp=new LinkedList<Integer>();
        Integer[] integers={1,2,3,4,5,6,7};

        inputMiddle(llp, integers);



    }










}
