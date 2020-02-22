package exceptions;//Игнорирование исключений RuntimeException

public class NeverCaught {
    static void f(){
        throw new RuntimeException("from f()");
    }

    static void g(){
        f();
    }

    public static void main(String[] args) {
        g();
    }
}

/**
 * RuntimeException - особый случай исключения, так как не требует спецификаций исключений.
 * Вывод направляется в System.error. RuntimeException  добирается до метода main без перехвата,
 * то при выходе из програмы для исключения вызвается метод printStackTrace()
 *
 *
 */
