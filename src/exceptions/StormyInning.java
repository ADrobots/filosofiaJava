/*Переопределенные методы могуть возбуждать только исключения, производные от
исключений базового класса.
 */

package exceptions;

class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}

abstract class Inning{
    public Inning() throws BaseballException{}
    public void event() throws BaseballException{}
    abstract void atBat() throws Foul, Strike;
    public void walk(){}//не возбуждает исключений
    //walk - ходить
}
class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoul extends Foul{}

interface Storm{
    public void event() throws RainedOut;
    public void walk() throws RainedOut;
}


///Stormy - штормовой
//Inning - подача
public class StormyInning extends Inning implements Storm {
    //можно добавлять новые исключения для конструкторов, но должны обработать
    //и исключения базового конструктора

    StormyInning() throws RainedOut, BaseballException {}
    StormyInning(String s) throws Foul, BaseballException{}

    //обычные методы должны соответствовать правилам базового класса:
    //!void walk() throws PopFoul{} //Ошибка компиляции

    //Интерфейс не может добавлять исключения к существубщим методам базового класса:
    //!public void event() throws RainedOut{}

    //Eсли метод был определен в базовом классе , исключения допускаются:
    public void rainHard() throws RainedOut{}
    //rain hard - сильный дождь
    //rained out - выпал дождь

    //Возможно не допускать возбуждения исключения вообще, даже если базовая
    //версия это делает:
    public void event(){}

    //Переопределенные методы могут возбуждать унаследованные исключения:
    public void atBat() throws PopFoul{}

    public static void main(String[] args) {
        try{
            StormyInning si=new StormyInning();
            si.atBat();
        }catch (PopFoul e){
            System.out.println("PopFoul");
        }catch (RainedOut e){
            System.out.println("RainedOut");
        }catch (BaseballException e){
            System.out.println("BaseballException");
        }
        System.out.println("============================");

        //Strike не вызывается в унаследованной версии

        try{
            Inning in=new StormyInning();
            in.atBat();

            //Мы должны перехватить исключение из базовой версии метода
        }catch (Strike e){
            System.out.println("Strike");
        }catch (Foul e){
            System.out.println("Foul");
        }catch (RainedOut e){
            System.out.println("BaseballException");
        }catch (BaseballException e){
            System.out.println("BaseballException");
        }
    }



}
/*
    Конструктор Inning и метод event() класса Inning объявляют о том что будут возбуждаться
исключения, но этого не делают. Данное решение позволяет пользователям перехватывать
любые типы исключений, которые могут добавлены в переопределенной версии метода. Так же решение
уместно и для абстрактных методов(типа atBat)
    Интерфейс Storm содержит один метод event(), определенный в классе Inning,
и один уникальный walk(). Оба метода возбуждают исключения RainedOut. Когда класс
StormyInning расширяется от Inning и реализует интерфейс Storm, выясняется что
метод event() из Storm не способен изменить тип исклюяения для метода event()
класса Inning. Проблем нет, когда метод описанный в интерфейсе отсутствует в
базовом классе.
    Ограничения для исключений не распространяются на конструкторы.В классе
StormyInning волен возбудить любое исключение, несмотря на исключения базового
класса. Однако конструктор базового класса вызывается, и поэтому конструктор
унаследованного класса должен объявить все исключения базового конструктора в своей
спецификации исключений.
    Так же конструктор унаследованного класса не может перезватыватьисключения,
возбужденные конструктором унаследованного класса.
    Метод StormInning.walk() не будет скомпилирован, поскольку возбуждает
исключение, когда как Inning.walk() этого не делает.
    Переопределенный метод event() показывает, что в методах унаследованных классов
можно вообще не возбуждать исключений, даже если это делается в базовой
версии.
    В методе main() видим, при работе с объектом StormyInning компилятор заставляет
перехватывать те исключения, которые характерны для этого класса. При восходящем
преобразовании к базовому типу компилятор уже навязывает перехват исключений
из базового класса
 */