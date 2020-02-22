/**
 * "Отключение" контролируемых исключений
 */
package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

class WrapCheckedException{
    //Wrap - заворачивать
    void throwRuntimeException(int type){
        try {
            switch (type){
                case 0: throw new FileNotFoundException();
                case 1: throw new IOException();
                case 2: throw new RuntimeException("!!!");
                default: return;
            }
        }catch (Exception e){
            //Превращаем в некотролируемое исключение(заворачиваем в RuntimeException)
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception{}
//Some - несколько

public class TurnOffChecking {
    public static void main(String[] args) {
        /**
         * Метод, генерирующий различные типы искобчений, которые перезватываются
         * и заворачиваются в RuntimeException
         */
        WrapCheckedException wce=new WrapCheckedException();
        //Вызываем метод без блока try, и покидаем метод с помощью исключения
        //RuntimeException()
        /*wce.throwRuntimeException(0);*/

        /**
         * Метод throwRuntimeException() можно вызвать без блока try, т.к. он не возуждает
         * никаких контролируемых исключений. Однако, когда нужно явно перехватить исключение
         * доставточно поместить код в блок try
         */
        //Перезватываем исключения
        for (int i=0; i<4; i++){
            try{
                if (i<3) wce.throwRuntimeException(i);
                else throw new SomeOtherException();
            }catch (SomeOtherException e){
                System.out.println("SomeOtherException "+e);
            }catch (RuntimeException re){
                try{
                    throw re.getCause();
                }catch (FileNotFoundException e){
                    System.out.println("FileNotFoundException: "+e);
                }catch (IOException e){
                    System.out.println("IOException: "+e);
                }catch (Throwable e){
                    System.out.println("Throwable: "+e);
                }
            }
        }
    }
}
