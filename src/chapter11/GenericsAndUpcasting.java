package chapter11;

import java.util.ArrayList;

//При помещении в контейнер мы не ограничены общим
//типом, казанным в параметре обобщенного типа.
//Восходящее преобразование работает с обобщенными
//типами точно так же, как и с любыми другими типами
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples=new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());

        for (Apple apple:apples) {
            System.out.println(apple);
        }
    }

}
