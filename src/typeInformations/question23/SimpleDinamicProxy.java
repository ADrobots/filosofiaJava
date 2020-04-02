//Внутри метода invoke из примера SimpleDynamicProxy попробуйте вывести аргумент-заместитель
//Объясните, что при этом происходит?

package typeInformations.question23;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

class DynamicProxyHandler implements InvocationHandler{
    private Object proxyed;
    public DynamicProxyHandler(Object proxyed){
        this.proxyed=proxyed;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //System.out.println("Proxy "+proxy);

        long timeIn=new Date().getTime();
        System.out.println("**** proxy: "+proxy.getClass()+", methods "+method+", args: "+args+", invoked at "+timeIn+" on "+new Date().getMinutes()+":"+new Date().getSeconds());
        if (args!=null){
            for (Object arg:args) {
                System.out.println(" "+arg);
            }
        }
        long timeOut=new Date().getTime();
        System.out.println("Call-return "+(timeOut-timeIn));
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
    //etc - так далее
    //Ошибки возникают из-за бесконечной рекурсии, так как вызов toString повторно
    //передается обратно в этот метод вызова
}
