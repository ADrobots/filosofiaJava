/**
 * Измените пример SweetShop так, чтобы тип создаваемых объектов определяется
 * аргументом командной строки. Другими словами, если для запуска используется
 * командная строка java SweetShop Candy, то создаеются только объекты Candy.
 * Обратите внимание на возможность управления тем, какие объекты Class загружаются
 * программой, через аргумент командной строки.
 *
 */
package typeInformations.question7;

import java.util.List;

class Candy{
    static {
        System.out.println("Загрузка класса Candy");
    }
}

class Gum{
    static {
        System.out.println("Загрузка класса Gum");
    }
}

class Coockie{
    static {
        System.out.println("Загрузка класса Cookie");
    }
}

public class Question7 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("typeInformations.question7." + args[0]);

            Object obj=c;
            if (obj instanceof Candy){
                new Candy();
            }
            if (obj instanceof Gum){
                new Gum();
            }
            if (obj instanceof Coockie){
                new Coockie();
            }
        }catch (ClassNotFoundException e){
            System.out.println("Используется не верный тип данных");
        }
        }

}
