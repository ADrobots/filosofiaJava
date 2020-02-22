package chapter10.question2;
//Паттерн проектирования стратегия
interface Selector{
    Boolean end();
    Object current();
    void next();
}

class Text{

    private String s;

    Text(String text){
        s=text;
    }

    @Override
    public String toString() {
        return s;
    }
}

public class Sequence {
    private Object[] items;
    private int next=0;

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
    }

    public Selector selector(){
        return new SequinceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence=new Sequence(4);

        for (int i=0; i<10; i++){
            sequence.add(i);}

        Selector selector=sequence.selector();
        while (!selector.end()){
                System.out.print(selector.current()+" ");
                selector.next();
        }

        Sequence message=new Sequence(2);
        Text text=new Text("text");
        Text text1=new Text("text1");
        message.add(text);
        message.add(text1);

        Selector messageSelector=message.selector();
        while(!messageSelector.end()){
            System.out.println(messageSelector.current());
            messageSelector.next();
        }


    }
}


