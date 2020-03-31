package typeInformations.question22;

public class RealDemo implements Interface {

    @Override
    public void doSomething() {
        System.out.println("RealDemo doSomething");
    }

    @Override
    public void doSomethingElse(String arg) {
        System.out.println("RealDemo doSomethingElse "+arg);
    }
}

/**
 * Метод consumer получает Interface.
 * Метод consumer не знает, получает ли он RealObject или Proxy, так как оба класса
 * реализуют Interface. Объект Proxy выполняет операции, идентичные методу RealObject.
 */