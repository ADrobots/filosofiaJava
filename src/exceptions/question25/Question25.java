/**
 * Создайте трехуровневую иерархию исключений. Далее сделайте базовый класс
 * А с методом, который возбуждает исключение, являющееся основой иерархии.
 * Унаследуйте клсасс В от А и переопределите метод так, чтобы он возбуждал
 * исключение из второго уровня иерархии. Аналогично поступите при наследовании
 * класса С от В. В методе main создайте класс С, проведите восходящее преобразование
 * к классу А, а затем вызовите метод.
 */
package exceptions.question25;

class A extends Exception {
    void getException() throws A{
        throw new A();
    }
}

class B extends A{
    @Override
    void getException() throws B {
        throw new B();
    }
}

class C extends B{
    @Override
    void getException() throws C {
        throw new C();
    }
}

public class Question25 {
    public static void main(String[] args) {
        A abc = new C();

        try {
            abc.getException();
        } catch (C c) {
            System.out.println("C exception");
        } catch (B b) {
            System.out.println("B exception");
        } catch (A a) {
            System.out.println("A exception");
        } catch (Exception e) {

        }
    }
}

/**
 * вариант из книги {@link exceptions.question25.Question25book}
 */
