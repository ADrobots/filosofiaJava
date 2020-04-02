package typeInformations.question25.access;

import java.lang.reflect.Method;

public class HeddenMethodsAndFields {
    public int i=1;
    double aDouble=2.43;
    protected long aLong=12345434;
    private float aFloat=2.35f;

    public void methodOne(){
        System.out.println("HMAF.methodOne() is public");;
    }
    void methodTwo(){
        System.out.println("HMAF.methodTwo() is package");
    }
    protected void methodThree(){
        System.out.println("HMAF.methodThree is protected");
    }
    private void methodFour(){
        System.out.println("HMAF.methodFour() is private");
    }

    public static void getMethod(Object obj, String method) throws Exception{
        Method m=obj.getClass().getDeclaredMethod(method);
        m.setAccessible(true);
        m.invoke(obj);
    }

}
