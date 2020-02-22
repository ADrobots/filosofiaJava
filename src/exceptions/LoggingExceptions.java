//Вывод информации об исключении через объект Logger

package exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception{
    private static Logger logger=Logger.getLogger("LoggingException");

    public LoggingException(){
        StringWriter trace=new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        }catch(LoggingException e){
            System.err.println("Перехвачено "+e);
        }

        try {
            throw new LoggingException();
        }catch(LoggingException e){
            System.err.println("Перехвачено "+e);
        }
    }
}

/**
 * getLogger() - статический метод, создает объект Logger, связанный с аргументом String,
 * который направляет результат в System.err
 * Простеший способ вывести данные в Logger - использовать метод severe();
 * printStackTrace() по умолчанию не выдает данные в формате String, поэтому используется
 * перегруженная версия printStackTrace(), получающий аргумент java.io.PrintWrit
 * Передавая конструктору PrintWrite объект java.io.StringWrite, вывод можно получитьв формате String вызовом toString()
 *
 * next {@link exceptions.LoggingExceptions2}
 */
