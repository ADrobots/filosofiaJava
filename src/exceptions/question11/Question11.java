/**
 * Повторите предыдущее упражнение{@link exceptions.question9.Question9}, но на этот раз в предложении catch()
 * преобразуйте исключение метода g() в RuntimeException.
 */

package exceptions.question11;


class DynamicFieldException extends Exception{}
class DynamicFieldExceptionTwo extends Exception{}

public class Question11 {
    static void g() throws RuntimeException{
        throw new RuntimeException();
    }

    static void f() {
        try {
            g();
        } catch (RuntimeException re) {
            re.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        f();
    }
}
