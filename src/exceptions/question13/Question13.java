/**
 * Измените упражнение 9, добавив туда блок funally. Проверьте что блок выполняется
 * даже в случае возбуждения NullPointerException
 */

package exceptions.question13;

class FirstException extends Exception{
    public FirstException(String string){
        super(string);
    }
}

class SecondException extends Exception{
    public SecondException(String string){
        super(string);
    }
}

class ThirdException extends Exception{
    public ThirdException(String string){
        super(string);
    }
}

public class Question13 {
    public static void method(Integer intg) throws FirstException, SecondException, ThirdException {
        if (intg<5) throw new FirstException("Меньше пяти");
        if (intg==5) throw new SecondException("Равно пяти");
        if(intg>5) throw new ThirdException("Больше пяти");

    }

    public static void main(String[] args) {
        try{
            /*Question13.method(null);*/
            Question13.method(12);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Вызвано из finally, даже при значении null, исключение которого не прехвачено");
        }
    }

    /*private static Integer[] x = new Integer[1];
    public static void f(int x)
            throws FirstException, SecondException, ThirdException {
        if(x < 0) throw new FirstException("x < 0");
        if(x == 0) throw new SecondException("x == 0");
        if(x > 0) throw new ThirdException("x > 0");
    }
    public static void main(String[] args) {
        try {
            // to throw NullPointerException:
            f(x[0]);
            f(0);
            f(1);
            f(-1);
            // will catch any Exception type:
        } catch(Exception e) {
            System.out.println("Caught Exception");
            e.printStackTrace(System.out);
        } finally {
            System.out.println("made it to finally");
        }
    }*/
}
