package chapter11.question12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIterationPractice {

    public static void main(String[] args) {
        /*1й способо*/
        List<Integer> arr1= Arrays.asList(1,2,3,4,5);
        List<Integer> arr2=Arrays.asList(11,12,13,14,15);

        ListIterator<Integer> it1=arr1.listIterator();
        ListIterator<Integer> it2=arr2.listIterator();

        while(it1.hasNext()){
            it1.next();
        }

        while(it2.hasNext()){
            it2.next();
            it2.set(it1.previous());
        }

        System.out.println(arr1);
        System.out.println(arr2);

        System.out.println();

        /*2й способ */
        ListIterator<Integer> it3=arr1.listIterator(5);
        ListIterator<Integer> it4=arr2.listIterator();

        while(it4.hasNext()){
            it4.next();
            it4.set(it3.previous());
        }

        System.out.println(arr1);
        System.out.println(arr2);



    }
}
