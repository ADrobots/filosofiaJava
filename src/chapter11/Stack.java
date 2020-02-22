package chapter11;

import java.util.LinkedList;

/*<<<<<<< HEAD
=======
*//*<<<<<<< HEAD
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T v) { storage.addFirst(v);}
    public T peek() { return storage.getFirst();}
    public T pop() { return storage.removeFirst();}
    public boolean empty() { return storage.isEmpty();}
    public String toString() { return storage.toString();}
}
=======*//*
>>>>>>> 826664c2827cbfa29582a15e634d45999cd4a1a3*/
/**
 * push - поместить в стек в последнюю очередь-значит будет первым
 * pop - получить первым из стека(то есть последним помещенным)
* */

public class Stack<T>{
    private LinkedList<T> storage=new LinkedList<>();
    public void push(T v){
        storage.addFirst(v);
    }
    public T peec(){return storage.peek();}
    public T pop(){return storage.removeFirst();}
    public boolean empty(){return storage.isEmpty();}
    public String toString(){return storage.toString();}
}

/**
* <T> после имени класса означает что тип является параметризованным
* Stack<T> - определение для хранения объектов типа Т
* Стек реализуется LinkedList<T>, а контейнер LInkedList так же узнает что в нем будут храниться
* объекты типа Т
*
* next {@link chapter11.StackTest}
* */

/*<<<<<<< HEAD
=======
*//*>>>>>>> 47be2d3d9b7e8f1cb1d0483acf6f6ea392a4edff*//*
>>>>>>> 826664c2827cbfa29582a15e634d45999cd4a1a3*/
