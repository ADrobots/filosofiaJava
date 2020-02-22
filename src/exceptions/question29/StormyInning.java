/**
 * Измените все типы исключений в StormyException так, чтобы они расширяли
 * RuntimeException. Покажите, что при этом не обязательны ни спецификации исключений
 * , ни блоки try. Уберите комментарии // и продемонстрируйте, что эти методы могут
 * компилироваться без спецификаций
 */

package exceptions.question29;

class BaseballException extends RuntimeException{}

class Foul extends BaseballException {}

class Strike extends BaseballException {}

abstract class Inning{
    public Inning(){}
    public void event(){}
    abstract void atBat();
    public void walk(){}
}

class StormException extends RuntimeException{}

class RainedOut extends StormException {}

class PopFoul extends Foul {}

interface Storm{
    public void event();
    public void walk();
}

public class StormyInning extends Inning implements Storm {

    StormyInning(){}
    StormyInning(String s){}

    public void walk(){}

    public void event(){}

    public void rainHard(){}

    public void atBat(){}

    public static void main(String[] args) {

            StormyInning si=new StormyInning();
            si.atBat();

        System.out.println("============================");

            Inning in=new StormyInning();
            in.atBat();

    }



}
