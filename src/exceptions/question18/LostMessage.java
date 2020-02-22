//Добавьте в LostMessage второй уровень потери исключений, чтобы
//исключение HoHumException само замещалось третьим исключением
package exceptions.question18;


class VeryImportantException extends Exception{
    public String toString(){
        return "Очень важное исключение!";
    }
}

class HoHumException extends Exception{
    public String toString(){
        return "Второстепенное исключение";
    }
}

class AdditionException extends Exception{
    public String toString(){
        return "Дополнительное исключение";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    void methodCauseAddingException() throws AdditionException{
        throw new AdditionException();
    }

    public static void main(String[] args) {
        //мой вариант
        /*try {
            LostMessage lm=new LostMessage();
            try {
                lm.f();
            }finally {
                try{
                lm.dispose();
                }finally {
                    throw new Exception();
                }
            }

        }catch (Exception e){
            System.out.println(e);
        }*/

        try{
            LostMessage lm=new LostMessage();
            try{
                try {
                    lm.f();
                }finally {
                    lm.dispose();
                }
            }finally {
                lm.methodCauseAddingException();
            }

        } catch (RuntimeException re){
            re.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}