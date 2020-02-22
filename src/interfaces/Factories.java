package interfaces;

interface Service{
    void method1();
    void method2();
}
interface ServiceFactory{
    Service getFactory();
}

class Implementation1 implements Service{
    Implementation1(){}; //доступ в пределах пакета
    public void method1(){
        System.out.println("Implementation1 method1");
    };
    public void method2(){
        System.out.println("Implementation1 method2");
    };
}
class Implementation1Factory implements ServiceFactory{
    public Service getFactory(){
        return new Implementation1();
    }
}

class Implementation2 implements Service{
    Implementation2(){};
    public void method1(){
        System.out.println("Implementation2 method1");
    }
    public void method2(){
        System.out.println("Implementation2 method2");
    }
}
class Implementation2Factory implements ServiceFactory{
    public Service getFactory(){
        return new Implementation2();
    }
}

public class Factories {
    public static void serviceConsumer(ServiceFactory factory){
        Service s=factory.getFactory();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        serviceConsumer(new Implementation2Factory());
    }

    //Без паттерна "Фабричный метод" вашему коду пришлось бы в каком-то месте
    //задать тип создаваемого объекта Service чтобы он мог вызвать подходящий
    //конструктор
}
