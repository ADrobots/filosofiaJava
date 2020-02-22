package chapter11.question3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//Паттерн проектирования стратегия
interface Selector{
    Boolean end();
    Object current();
    void next();
}

public class Sequence {
    private List items;
    private int next=0;

    Sequence(){
        items=new ArrayList<>();
    }
    void add(Object object){
        items.add(object);
    }


    private class SequinceSelector implements Selector {
        private int i=0;
        public Boolean end(){ return i==items.size();}
        public Object current(){return items.get(i);}
        public void next(){i++;}
    }

    public Selector selector(){
        return new SequinceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence=new Sequence();

        for (int i=0; i<10; i++){sequence.add(i);}



        Selector selector=sequence.selector();
        while (!selector.end()){
                System.out.print(selector.current()+" ");
                selector.next();
        }

        sequence.add(12);
        sequence.add("hello");

        while (!selector.end()){
            System.out.print(selector.current()+" ");
            selector.next();
        }

    }

}


