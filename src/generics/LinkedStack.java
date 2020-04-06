//Стек, реализованный на базе связанного списка
package generics;

public class LinkedStack<T> {
    private static class Node<U>{
        U item;
        Node<U> next;

        Node(){item=null; next=null;}
        Node(U item, Node<U> next){
            this.item=item;
            this.next=next;
        }

        boolean end(){
            return item==null && next==null;
        }
    }

    private Node<T> top=new Node<T>();//Сторож
    public void push(T item){
        top=new Node<T>(item,top);
    }
    public T pop(){
        T result=top.item;
        if(!top.end()){
            top=top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss=new LinkedStack<String>();
        for (String s:"Phasert on stun!".split(" ")){
            lss.push(s);
        }
        String s;
        while ((s=lss.pop())!=null){
            System.out.println(s);
        }
    }

    /**
     * Внутренний класс Node яляется обобщенным и имеет собственный
     * параметр-тип.
     * Для определения путого стека используется сторож(end sentinel).
     * Сторож создается при конструировании LinkedStack, и
     * при каждом вызове push новый узел Node<T> создается и свызявается с предыдущим
     * узлов NOde<T>. При вызова pop() всегда возвращает top.item, после чего текущий
     * узел Node<T> удаляется и происход переход к следующему узлу. Но при достижении
     * сторожа перемещение не выполняется. Елси клиент и дальше будет вызвать pop()
     * он будет получать null(признак пустого стека.
     *
     */
}
