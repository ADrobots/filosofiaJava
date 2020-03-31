package typeInformations;

import java.util.List;

public interface Robot {
    String name();
    String model();
    List<Operation> operations();

    class Test{
        public static void test(Robot robot){
            if (robot instanceof Null){
                System.out.println("[Null Robot]");
            }

            System.out.println("Robot name: "+robot.name());
            System.out.println("Robot model: "+robot.model());

            for (Operation operation:robot.operations()) {
                System.out.println(operation.description());
                operation.command();
            }
        }
    }
}

/**
 * Данный интерфейс так-же имеет вложенный класс для выполнения тестов.
 * Далее создаем класс, предстовляющий для уборки снега
 * {@link typeInformations.ShowRemovalRobot}
 */
