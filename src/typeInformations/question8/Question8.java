/**
 * Напишите метод который получает объект и рекурсивно выводит все классы в иерархии
 * этого объекта.
 */
package typeInformations.question8;

import typeInformations.ToyTest;

class Toy{}

class FancyToy extends Toy{}

public class Question8 {
    //мой вариант
    public static void recursionObject(Class c){
        try {
            System.out.println(c);
            Class result = c.getSuperclass();
            recursionObject(result);
        }catch (Exception e){
            System.exit(1);
        }
    }
    //вариант из книги
    public static void hierarchy(Object o){
        if (o.getClass().getSuperclass()!=null) {
            System.out.println(o.getClass() + " is subclass " + o.getClass().getSuperclass());

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
        //мой вариант
//        Class c=Class.forName("typeInformations.FancyToy");
//        recursionObject(c);

        //вариант из книги
        hierarchy(new FancyToy());
    }
}
