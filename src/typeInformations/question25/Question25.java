//Создайте класс, содержащий методы с разными уровнями доступа: закрытым(private), защищеным(protected),
// и с доступом в пределах пакета(package). Напишите метод для вызова этих методом
//из за предела пакетов.
package typeInformations.question25;

import typeInformations.question25.access.HeddenMethodsAndFields;

public class Question25 {
    public static void main(String[] args) throws Exception{
        HeddenMethodsAndFields one=new HeddenMethodsAndFields();
        one.methodOne();
        HeddenMethodsAndFields.getMethod(one,"methodThree");


    }
}
