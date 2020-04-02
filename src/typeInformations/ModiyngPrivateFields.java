package typeInformations;

import java.lang.reflect.Field;

class WithPrivateFinalField{
    private int i=1;
    private final String s1="I'm totally safe";
    private String s2="Am i safe";
    public String toString(){
        return "i= "+i+", "+s1+", "+s2;
    }
}

public class ModiyngPrivateFields {
    public static void main(String[] args) throws Exception{
        WithPrivateFinalField pf=new WithPrivateFinalField();
        System.out.println(pf);

        Field f=pf.getClass().getDeclaredField("i");
        f.setAccessible(true);
        System.out.println("f.getInt(pf): "+f.getInt(pf));
        f.setInt(pf,25);
        System.out.println(pf);

        f=pf.getClass().getDeclaredField("s1");
        f.setAccessible(true);
        System.out.println("f.get(pf): "+f.get(pf));
        f.set(pf,"No, you're not");
        System.out.println(pf);

        f=pf.getClass().getDeclaredField("s2");
        f.setAccessible(true);
        System.out.println("f.get(pf): "+f.get(pf));
        f.set(pf,"No, you're not");
        System.out.println(pf);

    }
}
/**
 * Исключение final-поля защищены от изменений. Исполнительная система принимает изменения,
 * но ничего не происходит.
 */
