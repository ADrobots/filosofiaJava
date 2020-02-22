package chapter11.question32;

import chapter11.InterfaceVsIterator;
import chapter11.typeinfo.pets.Pet;
import chapter11.typeinfo.pets.Pets;

import java.util.*;

class PetSequence implements Iterable<Pet>{
    Pet[] pets= Pets.createArray(8);

    @Override
    public Iterator<Pet> iterator() {
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
        };
    }
}

public class NonCollectionSequence extends PetSequence {

    public Iterable<Pet> reversed(){
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    int current=pets.length-1;
                    @Override
                    public boolean hasNext() {
                        return current>-1;
                    }

                    @Override
                    public Pet next() {
                        return pets[current--];
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized(){
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> shuffle=new ArrayList<Pet>(Arrays.asList(pets));
                Collections.shuffle(shuffle, new Random(47));
                return shuffle.iterator();
            }
        };
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
                //not inplemented
            throw  new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence ncs=new NonCollectionSequence();
        InterfaceVsIterator.display(ncs.iterator());

        for (Pet p:ncs) {
            System.out.print(p+" ");
        }
        System.out.println();
        for (Pet p :ncs.randomized()) {
            System.out.print(p+" ");
        }
        System.out.println();
        for (Pet p:ncs.reversed()) {
            System.out.print(p+" ");
        }
    }

}
/**
 * Получение Iterator обеспечивает связывание последовательности
 * с методом, работаюцим с этой последовательностью, при минимальном уровне
 * логических привязок и накладывает гораздо меньше ограничений на класс
 * последовательности, чем реализация Collection
 */