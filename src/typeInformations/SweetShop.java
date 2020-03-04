package typeInformations;

class Candy{
    static {
        System.out.println("Загрузка класса Candy");
    }
}

class Gum{
    static {
        System.out.println("Загрузка класса Gum");
    }
}

class Coockie{
    static {
        System.out.println("Загрузка класса Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("В методе main");
        //1й случай
        new Candy();

        //2й случай
        try {
            Class.forName("typeInformations.Gum");
        }catch (ClassNotFoundException e){
            System.out.println("Не удалось найти Gum");
        }
        System.out.println("После вызова Class.forName(\"Gum\")");

        //3случай
        new Coockie();
        System.out.println("После создания объекта Cookie");
    }

}
