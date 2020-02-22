package chapter11.question8;

import java.util.ArrayList;
import java.util.Iterator;

//gerbil - песчанка
public class Gerbil {
    private final int gerbilNumber;
    public Gerbil(int i){
        this.gerbilNumber=i;
    }

    //hop хмель
    void hop(){
        System.out.println("Gerbild "+gerbilNumber+" hops");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils=new ArrayList<Gerbil>();


        for(int i=0; i<10; i++){
            gerbils.add(new Gerbil(i));

        }

        Iterator<Gerbil> it=gerbils.iterator();

        for(int i=0; i<gerbils.size(); i++){
            it.next().hop();
        }

        System.out.println("\n");

        for (Gerbil g:gerbils) {
            g.hop();

        }
    }

}
