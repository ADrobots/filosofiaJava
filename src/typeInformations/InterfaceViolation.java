package typeInformations;

class B implements A{
    @Override
    public void f() {

    }
    public void g(){}
}

public class InterfaceViolation{
    //violation - нарушение
    public static void main(String[] args) {
        A a=new B();
        a.f();

        //ошибка помпиляции
        //a.g();

        System.out.println(a.getClass().getName());

        if(a instanceof B){
            B b=(B)a;
            b.g();
        }
    }
}
/**
 * Использую RTTI, интерфейс a реализуется классом B. Выполняя приведение типа
 * к B можем вызвать метод, отсутствующий в A. Это допустимо, но не жалательно.
 * {@link typeInformations.packageaccess.HiddenC}
 */
