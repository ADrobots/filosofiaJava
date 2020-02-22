package chapter11.question11;

import chapter11.typeinfo.pets.Mouse;

import java.util.*;

public class Question11 {
    private static int count=0;
    private int id=count++;

    public Question11() {}

    public static void views(Iterator it){
        while(it.hasNext()){
            Object o=it.next();
            System.out.println(o.toString());
        }
    }

    @Override
    public String toString() {
        return "Question11{" +
                "count=" + id +
                '}';
    }

    public static void main(String[] args) {
        Collection data=new ArrayList();
        Collections.addAll(data,1,2,3,4,5, new Question11(), new String("Petya"), new String("Markiz"), new Question11());

        views(data.iterator());

        HashSet<Character> characters=new HashSet<Character>(Arrays.asList('a','b','c'));
        views(characters.iterator());

        TreeSet<Float> floats=new TreeSet<Float>(Arrays.asList(1.2f,1.3f,1.4f));
        views(floats.iterator());

        LinkedHashSet<Double> doubles=new LinkedHashSet<>(Arrays.asList(2.3,2.5,4.8,8.9));
        views(doubles.iterator());


    }

}
