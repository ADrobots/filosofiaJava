//Программа доступа к информации трассировки стека.

package exceptions;

public class WhoCalled {
    //Метод генерирует исключение для заполнения трассировки стека.
    public static void method(){
        try {
           throw new Exception();
        }catch (Exception e){
            for (StackTraceElement ste:e.getStackTrace()) {
                System.out.println(ste.getMethodName());
            }
        }
    }

    public static void methodTwo(){
        method();
    }

    public static void main(String[] args) {
        method();
        System.out.println();
        methodTwo();
    }
}
