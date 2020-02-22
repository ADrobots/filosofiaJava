package exceptions.question10;

class DynamicFieldException extends Exception{}
class DynamicFieldExceptionTwo extends Exception{}

public class Question10 {

    //Мой вариант(не верный)
    /*public static void methodOne() throws DynamicFieldException {
        throw new DynamicFieldException();
    }

    public static void methodTwo() throws DynamicFieldException{
        DynamicFieldException dfe=new DynamicFieldException();
        dfe.initCause(new DynamicFieldExceptionTwo());
        throw dfe;
    }

    public static void main(String[] args) throws Exception {
       methodTwo();

    }*/

    //Вариант из книги
    /*static void g() throws DynamicFieldException{
        throw new DynamicFieldException();
    }

    static void f(){
        try {
            try {
                g();
            }catch (DynamicFieldException dfe) {
                dfe.printStackTrace();
                throw new DynamicFieldExceptionTwo();
            }
            }catch (DynamicFieldExceptionTwo dfet) {
            dfet.printStackTrace();
        }
    }

    public static void main(String[] args) {
        f();
    }*/

}
