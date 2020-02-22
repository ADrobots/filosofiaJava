package chapter11;

import java.util.ArrayList;

class Apple2{
    private static int id;
    private final int count=id++;
    public int id(){
        return count;
    }
}

class Orange2{}

public class AppleAndOrangeWithGeneric {

    public static void main(String[] args) {
        ArrayList<Apple2> apples=new ArrayList<Apple2>();
        for(int i=0; i<3; i++){
            apples.add(new Apple2());
        }
        //apples.add(new Orange2()); ошибка возникает во время компиляции

        for (Apple2 a2:apples) {
            System.out.println(a2.id());
        }
        //преобразование объекта становится лишним
    }
}
