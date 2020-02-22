package exceptions.question2;

public class Question2 {
    public static void main(String[] args) throws Exception{
        Object o=new Object();
        System.out.println(o.getClass());

        //Возбуждение исключения при нулевой ссылки на объект
        o=null;
        try {
            System.out.println(o.getClass());
        }catch (Exception e){
            e=new Exception("Возбуждено исключение из объекта о ");
            e.printStackTrace(System.out);
        }
        System.out.println();

        //Нет возбуждения исключения при имеющейся не нулевой ссылки на объект
        try {
            o=new Object();
            System.out.println(o.getClass());
        }catch(Exception exeption){
            System.out.println(new Exception("Повторно возбуждено исключение из объекта о"));
            exeption.printStackTrace(System.out);
        }
    }
}
