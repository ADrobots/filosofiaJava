/**
 * Создайте два класса исключения, каждый из которых автоматически выводит информацию о себе. Продемонстрируйте, что эти классы работают.
 */
package exceptions.question6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class MyExceptionOne extends Exception{
    Logger logger=Logger.getLogger("MyExceptionOne: ");

    MyExceptionOne(){
        StringWriter trace=new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class MyExceptionTwo extends Exception{
    Logger logger=Logger.getLogger("MyExceptionTwo: ");

    public MyExceptionTwo() {
        StringWriter trace=new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class Question6 {

    static void one() throws MyExceptionOne, MyExceptionTwo{
        throw new MyExceptionOne();
    }

    static void two() throws MyExceptionTwo{
        throw new MyExceptionTwo();
    }

    public static void main(String[] args) {

        try{
            one();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }

        try{
            two();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }


    }
}
