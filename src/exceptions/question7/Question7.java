package exceptions.question7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Question7 {

    static Logger logger=Logger.getLogger("LoggerExcention");

    static void logException(Exception e){
        StringWriter trace=new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        Integer[] integers1=new Integer[5];
        for (int i=0; i<12; i++){
            try{
                integers1[i]=i;
            }catch (Exception e){
                /*e=new Exception(i+" больше допустимого, массива размером "+integers1.length+"\n");*/
                logException(e);
            }
        }
    }
}
