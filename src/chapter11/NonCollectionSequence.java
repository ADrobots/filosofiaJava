package chapter11;

import chapter11.typeinfo.pets.Pet;
import chapter11.typeinfo.pets.Pets;

import java.util.Iterator;

class PetSequence{
    Pet[] pets= Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence{
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
                //not inplemented
            throw  new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence ncs=new NonCollectionSequence();
        InterfaceVsIterator.display(ncs.iterator());
    }

}
/**
 * Получение Iterator обеспечивает связывание последовательности
 * с методом, работаюцим с этой последовательностью, при минимальном уровне
 * логических привязок и накладывает гораздо меньше ограничений на класс
 * последовательности, чем реализация Collection
 */