//мой вариант
package typeInformations.question21;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;

interface Interface{
    void doSomething();
    void doSomethingElse(String arg);
    String getTime();

}

class RealDemo implements Interface {

    public String getTime(){
        GregorianCalendar time=new GregorianCalendar();
        return time.get(Calendar.MINUTE)+":"+time.get(Calendar.SECOND);
    }

    @Override
    public void doSomething() {
        System.out.println("RealDemo doSomething "+getTime());
    }

    @Override
    public void doSomethingElse(String arg) {
        System.out.println("RealDemo doSomethingElse "+arg+" "+getTime());
    }
}

class SimpleProxy implements Interface {
    private Interface proxyed;

    public SimpleProxy(Interface proxyed){
        this.proxyed=proxyed;
    }


    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething "+proxyed.getTime());
        proxyed.doSomething();
    }

    @Override
    public void doSomethingElse(String arg) {
        System.out.println("SimpleProxy doSomethingElse "+arg+" "+proxyed.getTime());
        proxyed.doSomethingElse(arg);

    }

    public String getTime(){
        GregorianCalendar time=new GregorianCalendar();
        return proxyed.getTime();
    }


}

public class SimpleProxyDemo {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.doSomethingElse("heeelllooo");
        iface.getTime();
    }

    public static void main(String[] args) {
        consumer(new RealDemo());
        System.out.println();
        consumer(new SimpleProxy(new RealDemo()));
        System.out.println();
        consumer(new SimpleProxy(new RealDemo()));
    }
}

/**
 * Метод consumer получает Interface.
 * Метод consumer не знает, получает ли он RealObject или Proxy, так как оба класса
 * реализуют Interface. Объект Proxy выполняет операции, идентичные методу RealObject.
 */