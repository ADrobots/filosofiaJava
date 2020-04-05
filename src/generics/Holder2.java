package generics;

public class Holder2 {
    private Object a;
    public Holder2(Object o){
        this.a=o;
    }
    public Object get(){
        return a;
    }
    public void set(Object o){
        this.a=o;
    }

    public static void main(String[] args) {
        Holder2 h2=new Holder2(new Automobile());
        Automobile automobile=(Automobile)h2.get();

        h2.set("Not  an Automobile");
        String s=(String)h2.get();

        h2.set(1);//автоупаковка в Integer

        Integer i=(Integer)h2.get();


    }
}

/**
 * теперь в классе можно хранить колько угодно объектов(в данном случае
 * хранится три разынх объекта)
 */
