package typeInformations;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

class NullRobotProxyHandler implements InvocationHandler {
    private String nullName;
    private Robot proxyed = new NRobot();

    NullRobotProxyHandler(Class<? extends Robot> type) {
        nullName = type.getSimpleName() + " NullRobot";
    }

    private class NRobot implements Null, Robot {
        @Override
        public String name() {
            return nullName;
        }

        @Override
        public String model() {
            return nullName;
        }

        @Override
        public List<Operation> operations() {
            return Collections.emptyList();
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxyed, args);
    }
}

public class
NullRobot{
    public static Robot newNullRobot(Class<? extends Robot> type){
            return (Robot) Proxy.newProxyInstance(NullRobot.class.getClassLoader(), new Class[]{Null.class, Robot.class}, new NullRobotProxyHandler(type));
    }

    public static void main(String[] args) {
        Robot[] bots={new ShowRemovalRobot("SHowBee"),
        newNullRobot(ShowRemovalRobot.class)};

        for (Robot bot:bots) {
            Robot.Test.test(bot);
        }
    }
}

/**
 * Когда понадобится null-объект Robot, мы вызываем newNullRobot(), передавая тип Robot,
 * для которого нужен заместитель. Заместитель выполняет требования к интерфейсам Robot и
 * Null и предоставляет конкретное имя замещаемого типа.
 */

