package chapter11;

import java.util.ArrayList;

class Apple{
    private static int id;
    private final int count=id++;
    public int id(){
       return count;
    }
}

class Orange{}

public class AppleAndOrangeWithoutGeneric {
    /*@SuppressWarnings("unchecked")*/
    public static void main(String[] args) {
        ArrayList apple=new ArrayList();
        for (int i=0; i<3; i++) {
            apple.add(new Apple());
        }
        //apple.add(new Orange()); ошибка возникает во время выполнения программы

        for (int i=0; i<apple.size(); i++){
            ((Apple)apple.get(i)).id();
            //необходимо указывать преобразование объекта
        }
    }
}
