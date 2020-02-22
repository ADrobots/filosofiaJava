/**Процесс создания собственных исключений можно продолжить - в класс
 * исключения можно добавить дополнительные конструкторы и члены
 * */

package exceptions;

class MyException extends Exception{
    private int index=0;
    public MyException(){}
    public MyException(String msg){
        super(msg);
    }
    public MyException(String msg, int index){
        super(msg);
        this.index=index;
    }

    public String getMessage(){
        return "Подробное сообщение: "+index+" "+super.getMessage();
    }

    public Integer getIndex(){
        return index;
    }
}

//Extra - дополнительный
//Feature - функция, характерная черта
public class ExtraFeature {
    static void one() throws MyException {
        System.out.println("Возбуждается MyException  из one()");
        throw new MyException();
    }

    static void two() throws MyException{
        System.out.println("Возбуждается Myexception из two()");
        throw new MyException("Создано в two()");
    }

    static void three()throws MyException{
        System.out.println("Возбуждается Myexception из three()");
        throw new MyException("Создано в three()",37);
    }

    public static void main(String[] args) {

        try {
            one();
        }catch (MyException me){
            me.printStackTrace(System.out);
        }

        try{
            two();
        }catch (MyException me){
            me.printStackTrace(System.out);
        }

        try{
            three();
        }catch (MyException me){
            me.printStackTrace(System.out);
            System.out.println(me.getIndex());
        }
    }

}

/**
 * В класс добавлено поле index с методом, считывающим значение(getIndex()).
 * Добавлен конструктор, который присваивает значение index
 * Метод Trowable.getMessage был переопределен для вывода более подробного сообщения.
 * Метод getMessage() является для классов исключений аналогом метода toString()
 *
 * next {@link exceptions.intro.introduction.txt}
 */
