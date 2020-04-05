package generics;

import typeInformations.pets.Cat;
import typeInformations.pets.Pet;
import typeInformations.pets.Rat;
import typeInformations.question12.Americano;
import typeInformations.question12.Cappuccino;
import typeInformations.question12.Coffee;

public class TupleTest {

    static TwoTuple<String,Integer> f(){
        return new TwoTuple<String,Integer>("hi",1);
    }

    static ThreeTuple<Pet, String,Integer> g(){
        return new ThreeTuple<Pet,String, Integer>(new Cat(),"Petya",1);
    }

    static FourTuple<Coffee,Pet,String,Integer> h(){
        return new FourTuple<Coffee,Pet,String, Integer>(new Americano(),new Cat(),"coffe and pet",1);
    }

    static FiveTuple<Coffee,Pet,String,Integer,Double> k(){
        return new FiveTuple<Coffee, Pet, String, Integer, Double>(new Cappuccino(),new Rat(),"cappuccino and pet",1,1.1);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi=f();
        System.out.println(ttsi);

        //Ошибка компиляции
        //ttsi.first="three";

        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}

/**
 * Благодаря обоюбщениям можно создать произвольный кортеж, возвращающий любую
 * группу типов, написав нужное выражение.
 * Спецификация final для открытых полей(public) предотвращает повторное присваивание после создания.
 */
