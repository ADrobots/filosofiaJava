package chapter11;

import chapter11.typeinfo.pets.Pet;
import chapter11.typeinfo.pets.Pets;

import java.util.Iterator;
import java.util.List;

public class SimpleIterator {
    public static void main(String[] args) {
        List<Pet> pets= Pets.arrayList(12);
        Iterator<Pet> it=pets.iterator();
        while(it.hasNext()){
            Pet p=it.next();
            System.out.println(p.id()+":"+p+" ");
        }
        System.out.println();

        //более простой синтаксис, где возможно
        for (Pet p:pets){
            System.out.println(p.id()+":"+p+" ");
        }
        System.out.println();

        //итератор так же позволяет удалять элементы
        it=pets.iterator();
        for (int i=0; i<6; i++){
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }
}
