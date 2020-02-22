//Предложение finally выполняется всегда
package exceptions;

class ThreeException extends Exception{}

public class FinallyWorks {
    static int count=0;

    public static void main(String[] args) {
        while(true){
            try {
                if (count++ == 0) throw new ThreeException();
                System.out.println("Нет исключения");
            }catch (ThreeException e){
                System.out.println("ThreeException");
            }finally {
                System.out.println("В блоке finally");
                if (count==2)break;
            }
        }
    }
}

/**
 * В независимости от возбужденного исключения, блок finally выполняется
 * всегда. Пример является так же решением проблемы с невозможностью возврата
 * Java к месту где было возбуждено исключение.
 * Одним из способов отказоустойчисвости программы является добавление
 * статическго счетчка или другого "устройства", что позволит циклу попытаться
 * решить задачу несколькими способами.
 */
