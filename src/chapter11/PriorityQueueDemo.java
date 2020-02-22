/**
 * Согласно принципу FIFO  следующим должен извлекаться элемент,
 * который дольше всех ожидает в очереди.
 * В PriorityQueue извлекается элемент, обладающий наивысшим приоритетом
 *
 * При вызоме метода offer() для объекта, позиция его определяется сортировкой
 * PriorityQueue гарантирует, что при вызове peek(), poll(), remove()
 * будет получен элемент  с наивысшим приоритетом
 *
 */

package chapter11;
import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //Создаем приоритетную очередь
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>();

        //Добавляем в очередь случайные целые числа
        Random random=new Random(50);
        for (int i=0; i<10; i++){
            priorityQueue.offer(random.nextInt(i+5));
        }
        QueueDemo.printQ(priorityQueue);

        //Создаем контейнер, содержащий целочисленные значения
        List<Integer> integers= Arrays.asList(90,10,20,40,6,3,5,7,3);
        //Вставляем значения контейнера integers в контейнер приоритетной очереди
        priorityQueue=new PriorityQueue<Integer>(integers);
        //Вывести объекты из очереди в порядке приоритетности
        QueueDemo.printQ(priorityQueue);

        //Вывести объекты из очереди в обратном поряднке, используя обратный компаратор, полученный
        //при вызове Collections.reverseOrder()
        priorityQueue=new PriorityQueue<Integer>(
        integers.size(), Collections.reverseOrder());
        priorityQueue.addAll(integers);
        QueueDemo.printQ(priorityQueue);

        //Создаем строковую переменную
        String stringss="HELLO, WHAT IS YOUR NAME?";
        //Создаем контейнер List содержащий обыекты типа String, букве
        //нные объекты, производные от разделенной строки string методом split()
        List<String> strings=Arrays.asList(stringss.split(""));
        //Согдаем приоритетную очереь, содержащую объекты типа String
        PriorityQueue<String> priorityQueue1=new PriorityQueue<String>(strings);
        QueueDemo.printQ(priorityQueue1);
        //Вывести объекты из очереди в обрантном порядке
        //"Калибруем очередь" для вывода объектов в обратном порядке
        priorityQueue1=new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
        priorityQueue1.addAll(strings);
        System.out.println(priorityQueue1);

        //Создаем коллекцию Set
        Set<Character> characterSet=new HashSet<Character>();
        for (Character c:stringss.toCharArray()) {
            characterSet.add(c);//autoboxing
        }
        PriorityQueue<Character> priorityQueue2=new PriorityQueue<Character>(characterSet);
        //Выводим объекты типа Character без повторов(уникальные объекты)
        QueueDemo.printQ(priorityQueue2);

        /**
         * Типы Integer, String, Character работают с PriorityQueue, потому что для этих классов
         * существует естественный встроенный порядок. Если иппользовать собственный класс с PriorityQueue,
         * можно включить дополнительную функциональность для введения естественного порядка или передать
         * собственный объект Comparator. Далее будет приведен сложный пример, демонстрирующий эти возможности
         *
         */



    }
}
