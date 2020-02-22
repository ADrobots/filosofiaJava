package chapter11;

import chapter11.typeinfo.pets.Pet;
import chapter11.typeinfo.pets.Pets;

import java.util.AbstractCollection;
import java.util.Iterator;

public class CollectionSequence extends AbstractCollection<Pet>{
 private Pet[] pets= Pets.createArray(8);
 public int size(){
     return pets.length;
 }
 public Iterator<Pet> iterator(){
     return new Iterator<Pet>() {
         private int index=0;
         @Override
         public boolean hasNext() {

             return index<pets.length;
         }

         @Override
         public Pet next() {
             return pets[index++];
         }
         public void remove(){
             //не реализовна
             throw new UnsupportedOperationException();
         }
     };
 }

    public static void main(String[] args) {
        CollectionSequence cs=new CollectionSequence();
        InterfaceVsIterator.display(cs);
        InterfaceVsIterator.display(cs.iterator());
    }
}

/**
 * Метод remove() является необязательной операцией, а при вызове будет выдано исключение
 * В примере видим, что реализация Collection так же резизует метод iterator(),
 * а одна лишь реалихация iterator() требует меньше усилий, чем наследование от AbstractCollecton.
 * Тем не менее, если класс уже наследуетот другого класса, не можем наследовать от AbstractCollection.
 * В этом случае для реализации Collection придется реализовать все методы интерфейса.
 * В такой ситуации проще использовать наследование и добавить способность создания итератора.
 * next {@link chapter11.NonCollectionSequence}
 */
