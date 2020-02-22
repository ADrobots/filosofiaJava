/**
 * Напишите класс с методом, который возбуждает исключение, созданное вами в упражнении 4. Попробуйте откомпилировать
 * его без спецификации исключений и посмотрите, что «скажет» компилятор. После этого добавьте необходимую спецификацию
 * исключений. Протестируйте свой класс и его исключение внутри блока try-catch.
 */

package exceptions.question8;

class SimpleExeption extends Exception{
    String message;

    public SimpleExeption(){};

    public SimpleExeption(String msg){
        super(msg);
        this.message=msg;
    }

    public void getMsg(){
        System.out.println(message);
    }
}

public class Question8 {
   static public void methodWithExceptions() throws SimpleExeption{
        throw new SimpleExeption();
    }

    public static void main(String[] args) {
        try{
            methodWithExceptions();
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }
    }

}
