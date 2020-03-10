package typeInformations;

import java.util.Random;

class Initable{
    static final int staticFinal=47;
    static final int staticFinal2=ClassInitialization.rand.nextInt(1000);
            static{
                System.out.println("Инициализация Initable");
            }
}
class Initable2{
    static int staticNonFinal=147;
    static{
        System.out.println("Инициализация Initable2");
    }

}
class Initable3{
    static int staticNonFinal=78;
    static{
        System.out.println("Инициализация Initable3");
    }
}

public class ClassInitialization {
    public static Random rand=new Random(47);

    public static void main(String[] args) throws Exception{
        //не запускает процесс инициализации
        Class initable=Initable.class;
        System.out.println("После создания ссылки на Initable");
        //Не запускает процесс инициализации
        System.out.println(Initable.staticFinal);

        //запускает процесс инициализации
        System.out.println(Initable.staticFinal2);

        //запускает процесс инициализации
        System.out.println(Initable2.staticNonFinal);

        //метод позволяет немедленно инициализировать класс
        Class initable3=Class.forName("typeInformations.Initable3");
        System.out.println("После создания ссылки на Initable3");
        System.out.println(Initable3.staticNonFinal);

    }
}
/**
 * Инициализация откладывается на столько, на сколько это возможно
 * Из создании ссылки initable видно, что использование синтаксиса .class для получения
 * ссылки на класс не приводит к инициализации. Вызов же Class.forName() немедленно инициализирует
 * класс для получения ссылки на Class, это видно при создании initable3.
 * Статичекое неизменное static final является "константой времени компиляции,
 * Initable.staticFinal, оно может читаться без инициализации класса Initable.
 * Если static поле не объявлено с ключевым словом final, то при обращении к нему чтение
 * возможно только после проведения компоновки(выделения памяти) и инициализации(выделения памяти), видно
 * на примере Initable2.staticNonFinal
 */
