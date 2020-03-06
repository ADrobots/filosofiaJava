/**
 * Встройте новый интерфейс в ToyTest.java Убедитесь в том, что он обнаруживается,
 * а информация о нем выводится программой.
 */

package typeInformations.question2;

interface HasBatteries{}

interface Waterproof{}

interface Shoots{}

interface Luminous{}
//luminous - светящийся





class Toy{

    Toy(){}
    Toy(int i){}
}

//1)FancyToy наледуется от Toy и реализует интерфейсы HasBatteries, Waterproof, Shoots
class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, Luminous {
    //fancy - маскарадный
    FancyToy(){
        super(1);
    }
}

public class Question2 {
    //4)метод printInfo() использует getName() для получения полного имя пакета
    //методы getSimpleName() - возвращает  имя без пакета, метод getCanonicalName - возвращает полное имя.
    static void printInfo(Class cc){
        //метод isInterface() сообщает, является ли объект Class интерфейсом
        System.out.println("Имя класса "+cc.getName()+" является интерфейсом? ["+cc.isInterface()+"]");
        System.out.println("Простое имя "+cc.getSimpleName());
        System.out.println("Каноническое имя "+cc.getCanonicalName());
    }

    public static void main(String[] args) {
        //2)В методе main() создается ссылка на Class
        Class c=null;

        try{
            //3)Которая инициализируется информацией класса FancyToy с ипользованием метода forName()
            //в блоке try
            //внимание, должно указываться полное имя(волючающая имя пакета)
            c=Class.forName("typeInformations.question2.FancyToy");
        }catch (ClassNotFoundException e){
            System.out.println("Не удается найти FancyToy");
            System.exit(0);
        }

        printInfo(c);
        System.out.println("======================================================================");
        //5)метод Class.getInterface возвращает массив объектов Class, представляющих интерфейсы
        for (Class face:c.getInterfaces()) {
            printInfo(face);
        }
        System.out.println("======================================================================");

        //6)метод getSuperClass() предоставляет информацию о базовом объекте Class
        Class up=c.getSuperclass();
        Object obj=null;
        try{
            //необходим конктруктор по умолчанию:
            //7)метод newInstance() класса Class используется для риализации "виртуального конструктора"
            obj=up.newInstance();
        }catch (InstantiationException e){
            System.out.println("Не удалось найти экземпляр");
            System.exit(1);
        }catch (IllegalAccessException ee){
            System.out.println("Отказано в доступе");
            System.exit(1);
        }

        printInfo(obj.getClass());
    }
}
