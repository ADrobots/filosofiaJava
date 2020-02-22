package exceptions;

public class Rethrowing {

    public static void methodOne() throws Exception{
        System.out.println("Создание исключения в methodOne()");
        throw new Exception("Возбужедно исключение из methodOne");
    }

    public static void methodTwo() throws Exception{
      try{
            methodOne();
        }catch (Exception e){
            System.out.println("В методе methodTwo, e.ptintStackTrace");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void methodThree() throws Exception{
        try {
            methodOne();
        }catch (Exception e){
            System.out.println("В методе methodThree, e.ptintStackTrace");
            e.printStackTrace(System.out);
            throw (Exception)e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
            methodTwo();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("===========================");

        try{
            methodThree();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

/**
 * Строка, с которой вызывается метод fillInStackTrace(), становится новой точкой
 * происходждения исключения
 *
 * next {@link exceptions.RethrowNew}
 */
