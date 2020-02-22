package chapter7.LinkInitialization;

class Carrot{
    private String c;
    Carrot(){
        System.out.println("Carrot()");
        c="Constructed";
    }
    public String toString(){
        return c;
    }
}

public class Pats {
    private String cat,dog,mouse;
    private String bird;
    private Carrot carrot=new Carrot();
    Pats(){
        cat="Tom";
        dog="Dog";
        mouse="Mouse";
    }

    public String toString(){
        if(bird==null)bird="Bird";
        return
        "cat = "+cat+"\n"+
                "dog = "+dog+"\n"+
                "mouse = "+mouse+"\n"+
                "bird = "+bird+"\n"+
                "carrot = "+carrot;
    }

    public static void main(String[] args) {
        Pats pats=new Pats();
        System.out.println(pats);
    }
}
