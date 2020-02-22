/**
 *Интерфейс Iterable реализуется многими классами,
 * прежде всего всеми реализациями Collection(но не Map)
 */

package chapter11;
import java.util.Map;

public class EnvironmentVariable {
    public static void main(String[] args) {
        for (Map.Entry entry:System.getenv().entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}

/**
 * System.getenv() - метод, возвращает Map
 * entrySet() - метод, создает контейнер Set с элементами Map.Entry
 * Контейнер Set реализует интерфейс Iterable, поэтому он может использоваться в циклах foreach
 * next {@link chapter11.ArrayNotIterator}
 */
