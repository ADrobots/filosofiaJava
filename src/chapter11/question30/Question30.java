package chapter11.question30;

import chapter11.InterfaceVsIterator;
import chapter11.typeinfo.pets.Pet;
import chapter11.typeinfo.pets.Pets;

import java.beans.IntrospectionException;
import java.util.*;

public class Question30 implements Collection<Pet>{
    public static Pet[] pets= Pets.createArray(4);


    @Override
    public int size() {
        return pets.length;
    }

    @Override
    public boolean isEmpty() {
        return (this.size()==0)?true:false;

    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            public boolean hasNext() {
                return index < pets.length;
            }
            public Pet next() { return pets[index++]; }
            public void remove() { // not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public Object[] toArray() {
        return pets;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(Pet pet) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw  new  UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {

    }


    public static void main(String[] args) {
        Question30 question30=new Question30();
        InterfaceVsIterator.display(question30);

    }
}
