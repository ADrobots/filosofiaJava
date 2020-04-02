package typeInformations.question23;

public interface Interface{
    void doSomething();
    void doSomethingElse(String arg);
}

/**
 * Метод consumer получает Interface.
 * Метод consumer не знает, получает ли он RealObject или Proxy, так как оба класса
 * реализуют Interface. Объект Proxy выполняет операции, идентичные методу RealObject.
 */