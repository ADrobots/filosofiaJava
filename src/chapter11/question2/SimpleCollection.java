package chapter11.question2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c2=new HashSet<Integer>();

        for (int i=0; i<=10; i++){
            c2.add(i);
        }
        c2.add(10); //будет игнорироваться добавление объекта, так как
        //мнежество set исключает повторение объектов

        for (Integer i:c2) {
            System.out.print(i+", ");
        }
    }
}

