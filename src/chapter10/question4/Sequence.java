package chapter10.question4;
//Паттерн проектирования стратегия
interface Selector{
    Boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] items;
    private int next=0;

    public void test(){
        System.out.println("test");
    }


    Sequence(int size){
        items=new Object[size];

    }
    void add(Object object){
        if(next<items.length){items[next++]=object;}
    }

    private class SequinceSelector implements Selector {
        private int i=0;
        public Boolean end(){ return i==items.length;}
        public Object current(){return items[i];}
        public void next(){if(i<items.length)i++;}
        public Sequence sequence123(){
            return Sequence.this;
        }
    }

    public SequinceSelector sequinceSelector(){
        return new SequinceSelector();
    }

    public Selector selector(){
        return new SequinceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence=new Sequence(4);

        for (int i=0; i<10; i++){sequence.add(i);}

        Selector selector=sequence.selector();
        while (!selector.end()){
                System.out.print(selector.current()+" ");
                selector.next();
        }

        Sequence s=new Sequence(1);
        Sequence.SequinceSelector ss=s.sequinceSelector();
        ss.sequence123().test();

        //Пример из книги
        ((SequinceSelector)selector).sequence123().test();

    }
}


