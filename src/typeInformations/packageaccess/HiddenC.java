/**
 * Проще всего использовать для реализации доступ на уровне пакета, чтобы внешние
 * клиенты не видеть ее
 */

package typeInformations.packageaccess;

import typeInformations.A;

class C implements A{
    @Override
    public void f() {
        System.out.println("public C.f()");
    }
    public void g(){
        System.out.println("public C.g()");
    }
    void u(){
        System.out.println("package C.u()");
    }
    protected void v(){
        System.out.println("protected C.v()");
    }
    private void w(){
        System.out.println("private C.w()");
    }
}

public class HiddenC {
    public static A makeA(){
        return new C();
    }
}

/**
 * Класс HiddenC - едиственная public(открытая) часть этого пакета, при вызове которго
 * создается интерфейс A. Даже если метод makeA() будеть возвращать интерфейс С,
 * за пределами пакета не удастся ничего использовать кроме А, так как С вне пакета
 * недоступна
 * {@link typeInformations.HiddenImplementation}
 */
