/**
 * При попытке нисходящего преобразования к С вывести методы не получится,
 * так как за пределами пакета C не доступен
 */

package typeInformations;

import typeInformations.packageaccess.HiddenC;

import java.lang.reflect.Method;

public class HiddenImplementation {
    public static void main(String[] args) throws Exception{
        A a= HiddenC.makeA();
        a.f();

        System.out.println(a.getClass().getName());

        //ошибка компиляции, не удается найти C
        /*if (a instanceof C){
            C c=(C)a;
            c.g();
        }*/

        //с помощью отражения можем вызвать метод g() интерфейса С из пакета packageaccess
        callHiddenMethod(a,"g");
        callHiddenMethod(a,"v");
    }

    public static void callHiddenMethod(Object a, String methodName) throws Exception{
        Method g=a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
/**
 * Рефлексия позволяет добрать до любых методов и вызвать даже закрытые методы
 * Зная метод, можно вызвать setAccesible(true) для объекта Method
 */
