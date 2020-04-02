package typeInformations;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class DynamicProxyHandler implements InvocationHandler{
    private Object proxyed;
    public DynamicProxyHandler(Object proxyed){
        this.proxyed=proxyed;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: "+proxy.getClass()+", methods "+method+", args: "+args);
        if (args!=null){
            for (Object arg:args) {
                System.out.println(" "+arg);
            }
        }
        return method.invoke(proxyed,args);
    }
}

public class SimpleDinamicProxy {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.doSomethingElse("hhheeelllooo");
    }

    public static void main(String[] args) {
        RealDemo realDemo=new RealDemo();
        consumer(realDemo);

        Interface proxy=(Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(), new Class[]{Interface.class},
                new DynamicProxyHandler(realDemo));

        consumer(proxy);
    }

    /**
     * Динамический заместитель создается вызовом статического метода Proxy.newProxyInstance()
     * В метод передаются:
     * - загрузчик классов
     * - список интерфейсов, который долэны реализовываться интерфейсом
     * - обработчик вызовов(реализация интерфейса InvocationHandler.
     * Динамический посредник перенаправляет все вызовы обработчику, так что конструктор
     * обработчика вызовов обычно получает ссылку на настоящий объект для
     * перенаправления запросов после выполнения его промежуточной операции.
     *
     * Метод invoke получат объект-заместитель на тот случай, если обработка должна
     * зависеть от источника запроса, но чаще источник игнорируется
     *
     * В общем случае выполняется промежуточная операция, после чего вызов Method.invoke()
     * перенаправляет запрос замещаемому объекту с передачей необходимых аргументов.
     *
     */
}
