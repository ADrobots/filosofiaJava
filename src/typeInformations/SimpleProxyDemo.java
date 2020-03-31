package typeInformations;

interface Interface{
    void doSomething();
    void doSomethingElse(String arg);
}

class RealDemo implements Interface{

    @Override
    public void doSomething() {
        System.out.println("RealDemo doSomething");
    }

    @Override
    public void doSomethingElse(String arg) {
        System.out.println("RealDemo doSomethingElse "+arg);
    }
}

class SimpleProxy implements Interface{
    private Interface proxyed;

    public SimpleProxy(Interface proxyed){
        this.proxyed=proxyed;
    }


    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxyed.doSomething();
    }

    @Override
    public void doSomethingElse(String arg) {
        System.out.println("SimpleProxy doSomethingElse "+arg);
        proxyed.doSomethingElse(arg);

    }
}

public class SimpleProxyDemo {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.doSomethingElse("heeelllooo");
    }

    public static void main(String[] args) {
        consumer(new RealDemo());
        System.out.println();
        consumer(new SimpleProxy(new RealDemo()));
    }
}

/**
 * Метод consumer получает Interface.
 * Метод consumer не знает, получает ли он RealObject или Proxy, так как оба класса
 * реализуют Interface. Объект Proxy выполняет операции, идентичные методу RealObject.
 */