package exceptions.question28;

class SimpleExeption extends RuntimeException{
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

public class Question28 {


    //Вариант из книги
    public void errBook() throws SimpleExeption {
        throw new SimpleExeption("Error from errBook");
    }

    public static void main(String[] args) {
        Question28 q4=new Question28();

        q4.errBook();
    }

}
