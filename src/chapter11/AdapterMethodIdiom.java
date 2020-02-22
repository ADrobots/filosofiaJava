/**
 * Возникают случаи, когда реализую в foreach интерфейс Iterable, нам нужно перебрать
 * список слов в обратном порядке. Если просто создать производный класс и переопределить
 * метод Iterator(), мы заменим существующий метод.
 *
 * Идиома "Метод-Адаптер" позволяет использовать foreach с другими разновидностями
 * Iterable(). Адаптер в названии происходит от паттерна проектирования, потому что для команды
 * foreach необходимо предоставить конкретный интерфейс
 */

package chapter11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReverseArrayList<T> extends ArrayList<T> {
    public ReverseArrayList(Collection<T> c){super(c);}

    public Iterable<T> reverse(){
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current=size()-1;
                    @Override
                    public boolean hasNext() {
                        return current>-1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}

public class AdapterMethodIdiom{
    public static void main(String[] args) {
        ReverseArrayList<String> ral=new ReverseArrayList<String>(
                Arrays.asList("Hello what is your name".split(" ")));
        //Получение списка с помощью iterator()
        for (String s:ral) {
            System.out.print(s+" ");
        }
        System.out.println();
        //Получение списка с помощью передачи реализации Iterable по вашему выбору
        for (String ss:ral.reverse()) {
            System.out.print(ss+" ");
        }

    }

    /**
     * Если просто поместить объект ral  в команду foreach - получим прямой итератор(по умолчанию)
     * Но если вызвать для объекта метод reverse(), он обеспечит другое поведение
     * next {@link MultiIteratorClass}
     */
}
