package chapter7;

class Cleanser{
    private String s="Cleaners";
    public void append(String a){
        s+=a;
    }
    public void dilute(){append("Dilute()");}
    public void apply(){append("Apply()");}
    public void scrub(){append("Scrub()");}
    public String toString(){
        return s;
    }

    public static void main(String[] args) {
        Cleanser cleanser=new Cleanser();
        cleanser.dilute();
        cleanser.apply();
        cleanser.scrub();
        System.out.println(cleanser);
    }
}


public class Detergent extends Cleanser{
    //изменяем метод
    public void scrub() {
        append("Detergent.scrub()");
        super.scrub();//вызываем метод базового класса
    }
        //Добавляем новый метод к интерфейсу
        public void foam(){
            append("Foam()");
        }

    public static void main(String[] args) {
        Detergent detergent=new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        System.out.println(detergent);

        //Проверяем базовый класс
        Cleanser.main(args);
    }
}

class Powder extends Detergent{
    public void scrub(){
        append("Powder.scrub()");
    }
    public void sterilize(){
        append("Sterilize()");
    }

    public static void main(String[] args) {
        Powder powder=new Powder();
        powder.dilute();
        powder.apply();
        powder.scrub();
        powder.sterilize();
        System.out.println(powder);

        //Проверяем Detergent
        Detergent.main(args);

        //Проверяем бозовый класс Cleaners
        Cleanser.main(args);
    }
}