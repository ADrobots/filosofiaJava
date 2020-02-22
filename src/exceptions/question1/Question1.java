package exceptions.question1;

public class Question1 {
    public static void mainMethod() throws Exception{
        System.out.println("Возбуждение исключения Exeption из mainMethod()");
        throw new Exception("Ошибка в mainMethod: ");
    }


    public static void main(String[] args){
        try {
            mainMethod();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally {
            System.out.println("Ошибка произошла");
        }

    }



}
/**
 * next {@link exceptions.question2.Question2}
 */
