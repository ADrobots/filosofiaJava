package chapter7;
class Villain{
    private String name;
    protected void set(String nm){
        name=nm;
    }
    public Villain(String name){
        this.name=name;
    }
    public String toString(){
        return "Я объект Villain и мое имя " + name;
    }
}

public class Orc extends Villain {
    private int old;
    public Orc(String name, int old){
        super(name);
        this.old=old;
    }
    public void change(String name, int old){
        set(name);
        this.old=old;
    }
    public String toString(){
        return "Orc "+old+ ": "+super.toString();
    }

    public static void main(String[] args) {
        Orc orc=new Orc("tony", 1);
        System.out.println(orc);
        orc.change("galina", 2);
        System.out.println(orc);
    }
}
