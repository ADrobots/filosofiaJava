package exceptions.question4;

class SimpleExeption extends Exception{
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

public class Question4 {

    //Мой Вариант
    public void err() throws SimpleExeption{
        throw new SimpleExeption();
    }

    //Вариант из книги
    public void errBook() throws SimpleExeption{
        throw new SimpleExeption("Error from errBook");
    }

    public static void main(String[] args) {
        Question4 q4=new Question4();

        //Мой Вариант
        try {
            q4.err();
        }catch (SimpleExeption e) {
            e=new SimpleExeption("error");
            e.getMsg();
        }

        //Вариант из книги
        try{
            q4.errBook();
        }catch (SimpleExeption s){
            s.getMsg();
        }
    }

}
