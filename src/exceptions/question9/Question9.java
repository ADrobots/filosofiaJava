package exceptions.question9;

class FirstException extends Exception{
    public FirstException(String string){
        super(string);
    }
}

class SecondException extends Exception{
    public SecondException(String string){
        super(string);
    }
}

class ThirdException extends Exception{
    public ThirdException(String string){
        super(string);
    }
}

public class Question9 {
    public static void method(Integer intg) throws FirstException, SecondException, ThirdException{
        if (intg<5) throw new FirstException("Меньше пяти");
        if (intg==5) throw new SecondException("Равно пяти");
        if(intg>5) throw new ThirdException("Больше пяти");

    }

    public static void main(String[] args) {
        try{
            Question9.method(2);
            Question9.method(9);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
