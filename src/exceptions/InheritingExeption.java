package exceptions;

class SimpleExeption extends Exception{}

public class InheritingExeption {
    public void exept() throws SimpleExeption{
        System.out.println("Возбуждается исключение SimpleExeption");
        throw new SimpleExeption();
    }

    public static void main(String[] args) {
        InheritingExeption ie=new InheritingExeption();
        try {
            ie.exept();
        }catch (SimpleExeption exeption){
            System.out.println("Перехваченная ошибка");
        }
    }
}

/**
 * Компилятор создает конструктор по умолчанию, автоматически вызываюший
 * конструктор базового класса.
 *
 * next {@link exceptions.FullConstructors}
 */
