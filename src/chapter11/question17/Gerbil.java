package chapter11.question17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//gerbil - песчанка
public class Gerbil {
    private final int gerbilNumber;
    public Gerbil(int i){
        this.gerbilNumber=i;
    }

    //hop хмель
    void hop(){
        System.out.println(gerbilNumber+" hops");
    }

    public static void main(String[] args) {
        Map<String, Gerbil> gerbilsMap=new HashMap<String, Gerbil>();

            for (int i = 0; i < 10; i++) {
                gerbilsMap.put("Gerb" + i, new Gerbil(i));
            }

        Iterator iterator=gerbilsMap.keySet().iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
            gerbilsMap.get(iterator.next()).hop();
            System.out.println();
        }



        System.out.println("\n");

    }

}
