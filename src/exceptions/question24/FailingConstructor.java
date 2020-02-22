/**
 * Создайте класс FailingConstructor с конструктором, во время выполнения
 * которого может произойти ошибка, приводящая к выдаче исключенияю. В методе
 * main напишите код, который защищает программу от таких сбоев.
 */

package exceptions.question24;

class OneException extends Exception{
    public OneException(String s){
        System.out.println("Вызвано исключение: "+s);
    }
}

public class FailingConstructor {
    public int index;
    public FailingConstructor(int i) throws OneException {
        this.index=i;
        if(i>5)throw new OneException(i+" - число больше 5");
        System.out.println(i+": подходящее число");
    }

    public void dispose(){
        index--;
        System.out.println("index уменьшен до "+index);
    }

    public static void main(String[] args){
        try{
            FailingConstructor fc=new FailingConstructor(7);
            try{

            }finally {
                fc.dispose();
            }
        }catch (OneException oe){
            oe=new OneException("!!!");
        }





    }
}
