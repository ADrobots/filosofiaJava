/**
 * Резульлтаты работы выводятся в стандарный поток для ошибок на консоль,
 * что достигается использованием класса System.err, это лучше, чем System.out,
 * который может быть перенаправлен.
 */

package exceptions;
class MyExeption extends Exception{
    public MyExeption(){};
    public MyExeption(String string){super(string);}
}

public class FullConstructors{
    //Первый способ исключения по умолчанию
    public void f() throws MyExeption{
        System.out.println("Возбуждается исключение MyExeption из метода f()");
        throw new MyExeption();
    }
    //Второй способ исключения с передачей строковой переменной в конструктор
    public void g() throws MyExeption{
        System.out.println("Возбуждается исключение MyExeption из метода g()");
        throw new MyExeption("Ошибка, вызванная из метода g()");
    }


    public static void main(String[] args) {
        FullConstructors fc=new FullConstructors();

        try {
            fc.f();
        }catch (MyExeption myExeption){
            myExeption.printStackTrace(System.out);
        }

        try {
            fc.f();
        }catch (MyExeption myExeption){
            myExeption.printStackTrace();
        }

        try {
            fc.g();
        }catch (MyExeption myExeption){
            myExeption.printStackTrace(System.err);
        }


    }

}

/**
 * в данном примере используется два конструктора, которые определяют способ
 * создания объекта MyExeption. Во втором конструктре используется конструктор
 * родительского класса с аргументом String, вызываемый ключевы словом super
 *
 * printStackTrace(System.err) - метод клсса Throwable(унаследован от Exeption),
 * позволяет восстановить последовательность вызванных методов, которая привела
 * к точке восстановления исключения
 *
 * При вызове printStackTrace()(по умолчанию) информация отправляется в стандартный поток ошибок.
 */
