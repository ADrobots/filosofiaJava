//Добавьте в LostMessage второй уровень потери исключений, чтобы
//исключение HoHumException само замещалось третьим исключением
package exceptions.question19;


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

    void methodCauseAddingException() throws AdditionException {
        throw new AdditionException();
    }

    public static void main(String[] args) {
       //мой вариант
        /*try{
            LostMessage lm=new LostMessage();
            try{
                try {
                    lm.f();
                }catch (RuntimeException re){
                    re.printStackTrace();
                } finally {
                    lm.dispose();
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lm.methodCauseAddingException();
            }
        }catch (Exception e){
            e.printStackTrace();
        }*/

        //вариант из книги
        try{
            LostMessage lm=new LostMessage();
            try {
                lm.f();
            }catch (Exception e) {
                System.out.println(e);
            }finally {
                lm.methodCauseAddingException();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}