package interfaces.question8;
interface FastFood{
    void eat();
    void doNotEat();
}

class Meal{
   Meal(){
        System.out.println("Meal()");
    }
}

class Bread{
    Bread(){
        System.out.println("Bread()");
    }
}

class Cheese{
    Cheese(){
        System.out.println("Chees()");
    }
}

class Lettuce{
    Lettuce(){
        System.out.println("Lettuce");
    }
}

class Lunch extends Meal {
    Lunch(){
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch(){
        System.out.println("Portable Lunch()");
    }
}

class Pickle{
    private String name="Pickle";
    Pickle(){
        System.out.println("Pickle()");
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Sandwich extends Lunch implements FastFood{
    private Bread bread=new Bread();
    private Cheese cheese=new Cheese();
    private Lettuce lettuce=new Lettuce();

    Sandwich(){
        eat();
    }

    private Pickle pickle=new Pickle();

    @Override
    public void eat() {
        System.out.println("Сыесть sandwich c "+pickle);
    }

    @Override
    public void doNotEat() {
        System.out.println("Не есть sandwich");
    }

    public static void main(String[] args) {
        new Sandwich();
    }

    //Класс Sandwich с тремя уровнями наследования(с четырмя если
    //считать наследование от класса Object) и четырмя встроенными
    //объектами
    //Сначала вызывается конструктор базового класса Meal, затем по
    //иерархии наследования идет производный класс Lunch,
    //далее производится инициализация членов класса, объявленных
    //в порядке их объявления, затем конструктор производного класса
    //от Lunch
}
