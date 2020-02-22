package chapter11;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Для сортировки результатов спользовать TreeSet вместо HashSet
 */

public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random rand=new Random(47);
        SortedSet<Integer> inset=new TreeSet<Integer>();
        for (int i=0; i<10000; i++){
            inset.add(rand.nextInt(30));
        }
        System.out.println(inset);
    }
}

/**
 * next {@link chapter11.SetOperations}
 */
