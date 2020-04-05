//создайте и протестируйте обобщеный тип SixTuple для шести элементов
package generics.question3;

import generics.FiveTuple;
import typeInformations.pets.Dog;
import typeInformations.pets.Pet;
import typeInformations.question12.Cappuccino;
import typeInformations.question12.Coffee;

class SixTuples<A,B,C,D,E,F>extends FiveTuple<A,B,C,D,E>{
    public final F six;
    public SixTuples(A a,B b,C c,D d,E e,F f){
        super(a,b,c,d,e);
        this.six=f;
    }

    public String toString(){
        return "("+first+", "+second+", "+third+", "+four+", "+five+", "+six+")";
    }
}

public class Question3  {
    static SixTuples<Long, Coffee, Pet, String, Integer,Double> f(){
        return new SixTuples(23456, new Cappuccino(),new Dog(),"hello",1,1.1);
    }

    public static void main(String[] args) {
        System.out.println(f());
    }
}
