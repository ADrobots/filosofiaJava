package chapter7.question11;

import chapter7.question7.C;

class Cleanser{
    private String s="Cleaners()";
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


public class Detergent{
    private String s="Detergent()";
    Cleanser cleaners=new Cleanser();
    public void append(String a){s+=a;}
    public void dilute(){cleaners.append("Dilute()");}
    public void apply(){cleaners.append("Apply()");}
    public void scrub() {
        append("Detergent.scrub()");
        cleaners.scrub();
    }
    public void foam(){
        append("Foam()");
    }

    public String toString(){
        return s+" "+cleaners;
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


//дз
class Powder{
    private String s="Cleaners()";
    Detergent detergent=new Detergent();
    Cleanser cleanser=new Cleanser();
    public void append(String a){s+=a;}
    public void dilute(){cleanser.append("Dilute()");}
    public void apply(){cleanser.append("Apply()");}
    public void scrub(){
        append("Powder.scrub()");
    }
    public void foam(){detergent.append("Foam()");}
    public void sterilize(){
        append("Sterilize()");
    }
    public String toString(){
        return s+" "+cleanser+" "+detergent;

    }

    public static void main(String[] args) {
        Powder powder=new Powder();
        powder.dilute();
        powder.apply();
        powder.scrub();
        powder.foam();
        powder.sterilize();
        System.out.println(powder);

        //Проверяем Detergent
        Detergent.main(args);

        //Проверяем бозовый класс Cleaners
        Cleanser.main(args);
    }
}