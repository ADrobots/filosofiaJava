//вариант из книги
package typeInformations.question21;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

interface Interface21{
    void doSomething();
    void doSomethingElse(String arg);

}

class RealDemo21 implements Interface21 {

    @Override
    public void doSomething() {
        System.out.println("RealDemo doSomething");
    }

    @Override
    public void doSomethingElse(String arg) {
        System.out.println("RealDemo doSomethingElse "+arg);
    }
}

class SimpleProxy21 implements Interface21 {
    private Interface21 proxyed;
    private static int doCount=0;
    private static int seCount=0;

    public SimpleProxy21(Interface21 proxyed){
        this.proxyed=proxyed;
    }


    @Override
    public void doSomething() {
       long time=new Date().getTime();
        System.out.println("Time called doSomething() "+doCount+": "+time+"msec");
        System.out.println("on "+new Date());
        doCount++;
        proxyed.doSomething();
        System.out.println("Call-return time= "+((new Date().getTime())-time)+"msec");
    }

    @Override
    public void doSomethingElse(String arg) {
        long time=new Date().getTime();
        System.out.println("Time called doSomethingElse() "+seCount+": "+time+"msec");
        System.out.println("on "+new Date());
        seCount++;
        proxyed.doSomethingElse(arg);
        System.out.println("Call-return time= "+((new Date().getTime())-time)+"msec");

    }

}

public class SimpleProxyDemo21 {
    public static void consumer(Interface21 iface){
        iface.doSomething();
        iface.doSomethingElse("heeelllooo");
    }

    public static void main(String[] args) {
        consumer(new RealDemo21());
        System.out.println();
        consumer(new SimpleProxy21(new RealDemo21()));
        System.out.println();
        consumer(new SimpleProxy21(new RealDemo21()));
    }
}