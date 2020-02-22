/**
 * Создайте класс FailingConstructor с конструктором, во время выполнения
 * которого может произойти ошибка, приводящая к выдаче исключенияю. В методе
 * main напишите код, который защищает программу от таких сбоев.
 */

package exceptions.question22;

import java.util.Random;

class OneException extends Exception{
    public OneException(String s){
        System.out.println("Вызвано исключение: "+s);
    }
}

public class FailingConstructor {
    public int index;
    public FailingConstructor(int i) throws OneException{
        this.index=i;
        if(i>5)throw new OneException(i+" - число больше 5");
        System.out.println(i+": подходящее число");
    }

    public static void main(String[] args){
        FailingConstructor fc=null;
        try{
            fc=new FailingConstructor(7);
        }catch (OneException oe){
            oe.printStackTrace();
        }finally {

        }





    }
}
