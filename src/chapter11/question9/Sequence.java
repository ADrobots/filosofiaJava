package chapter11.question9;

import java.util.ArrayList;
import java.util.Iterator;

public class Sequence {
    private ArrayList<Object> items=new ArrayList<Object>();

    void add(Object object){
        items.add(object);
    }

    public Iterator iterator(){
        return items.iterator();
    }

    public static void main(String[] args) {
        Sequence sequence=new Sequence();

        for (int i=0; i<10; i++){sequence.add(i);}
        Iterator it=sequence.iterator();
        while (it.hasNext()){
                System.out.print(it.next()+" ");
        }
    }
}


