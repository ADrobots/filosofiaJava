/**
 * Измените предыдущее упражнение так, чтобы в нем использовался метод Class.getDeclaredFields() для
 * вывода информации о полях класса
 */
package typeInformations.question9;

import java.lang.reflect.Field;

class Toy{
    long l=1000;
    void lng(){}
}

class FancyToy extends Toy {
    int i=0;
    String str="str";
}

public class Question9 {
    //мой вариант
    public static void hierarchy(Object o){
        if (o.getClass().getSuperclass()!=null) {
            System.out.println(o.getClass() + " is subclass " + o.getClass().getSuperclass());
            System.out.println("fields and methods: ");
            for (Field s:o.getClass().getDeclaredFields()) {
                System.out.println(s.getName());
            }

            try {
                hierarchy(o.getClass().getSuperclass().newInstance());
            } catch (InstantiationException e) {
                System.out.println("unable to instantiate obj");
            } catch (IllegalAccessException e) {
                System.out.println("unable to access");
            }
        }
    }
    public static void main(String[] args){

        hierarchy(new FancyToy());
    }
}
