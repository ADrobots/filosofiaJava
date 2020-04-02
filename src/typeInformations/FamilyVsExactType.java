//Различия между inctanceof и сравнением Class
package typeInformations;

class Base{}
class Derived extends Base{}
//derived - полученный

public class FamilyVsExactType {
    static void test(Object x){
        System.out.println("Тестируем x тип "+x.getClass());
        System.out.println("x inctanceof Base "+(x instanceof Base));
        System.out.println("x inctanceof Derived "+(x instanceof Derived));
        System.out.println("Base.isInstance(x) "+Base.class.isInstance(x));
        System.out.println("Derived.isInstance(x) "+Derived.class.isInstance(x));
        System.out.println("x.getClass()==Base.class "+(x.getClass()==Base.class));
        System.out.println("x.getClass()==Derived.class "+(x.getClass()==Derived.class));
        System.out.println("x.getClass().equals(Base.class) "+(x.getClass().equals(Base.class)));
        System.out.println("x.getClass().equals(Derived.class) "+(x.getClass().equals(Derived.class)));
    }

    public static void main(String[] args) {
        test(new Base());
        System.out.println();
        test(new Derived());

    }
}

/**
 * Метод test осуществляет проверку типов полученных объектов, использую обе формы оператора
 * instanceof. Затем для проверки на равенство объектов Class испоьзует операцию
 * сравнения сслок == и метод equals. Действия операторов instanceof  и метода isInstance
 * одинаково. Совпадают результаты работы операции сравнения == и метода equals(). *
 */