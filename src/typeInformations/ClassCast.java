package typeInformations;

class Building{}
class House extends Building{}

public class ClassCast {
    public static void main(String[] args) {
        //1
        Building b=new House();
        //2
        Class<House> houseType=House.class;
        //3
        House h=houseType.cast(b);
        //или
        h=(House)b;
    }
}

/**
 * Метод cast() получает аргумент-объект и преобразует его к типу ссылки на Class.
 *
 * Новый синтаксис приведения типов полезен в ситуациях, в которых нельзя использовать обычное приведение типа.
 * Такие ситуации встречаются редко.
 *
 * Еще одно приведение типа - метод Class.asSubclass(), который преобразует объект
 * класса к конкретному типу. Метод используется редко.
 */
