/**
 * fillInStackTrace - метод, при использовании которого, информация о месте зарождения
 * теряется и остается только то, что относится к новой команде throw
 *
 */
package exceptions;
//Повторное возбуждение объекта исключения, отличного от перехваченого

class OneException extends Exception{
    public OneException(String s){super(s);}
}

class TwoException extends Exception{
    public TwoException(String s){super(s);}
}

public class RethrowNew {
    public static void method() throws OneException{
        System.out.println("Создано исключение из method()");
        throw new OneException("Мозбужедно исключение OneException из метода method()");
    }

    public static void main(String[] args) {
        try {
            try {
                method();
            }catch (OneException oe){
                System.out.println("Перехвачено во внутреннем блоке try, e.printStackTrace()");
                oe.printStackTrace(System.out);
                throw new TwoException("Возбуждено исключение TwoException из внтреннего блока try");
            }
        }catch (TwoException te){
            System.out.println("Перехвачено во внешнем блоке try, e.printStackTrace()");
            te.printStackTrace(System.out);
        }
    }
}
