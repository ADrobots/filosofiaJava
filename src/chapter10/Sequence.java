package chapter10;
//Паттерн проектирования стратегия
interface Selector{
    Boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] items;
    private int next=0;

    Sequence(int size){
        items=new Object[size];
    }
    void add(Object object){
        if(next<items.length){items[next++]=object;}
    }                                                       // если 0<4 items[1]=0
                                                            // если 1<4 items[2]=1
                                                            // если 2<4 items[3]=2
                                                            // если 3<4 items[4]=3
                                                            // если 4<4 ...

    private class SequinceSelector implements Selector{
        private int i=items.length;
        public Boolean end(){ return i==0;}
        public Object current(){return items[i-1];}
        public void next(){if(i>=0)i--;}
    }

    public Selector selector(){
        return new SequinceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence=new Sequence(4);

        for (int i=0; i<10; i++){sequence.add(i);} //0
                                                    //1
                                                    //2
                                                    //3
        Selector selector=sequence.selector();
        while (!selector.end()){                            // if(0==4) false
                System.out.print(selector.current()+" ");       //print items[0]( znach 0)
                selector.next();                                    //if(0<4) i=0+1
        }                                                   //if(1==4) false
                                                                //print items[1]( znach 1)
                                                                    //if(1<4) i=1+1
                                                            //if(2==4) false
                                                                //print items[2]( znach 2)
                                                                    //if(2<4) i=2+1
                                                            //if(3==4) false
                                                                //print items[3]{ znach 3 )
                                                                    //if(3<4) i=3+1
                                                            //if(4==4) true
    }
}


