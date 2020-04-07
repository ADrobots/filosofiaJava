
package generics.question6;

import typeInformations.pets.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomList61<T> {
    private ArrayList<T> storage=new ArrayList<T>();
    private Random random=new Random(47);
    public void add(T item){
        storage.add(item);
    }
    public T select(){
        return storage.get(random.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList61<String> rs=new RandomList61<String>();
        for (String s:"The quick brown fox jumped over the lazy brown dog".split(" ")) {
            rs.add(s);
        }

        for(int i=0; i<10; i++){
            System.out.print(rs.select()+" ");
        }

        RandomList61<Integer> irl=new RandomList61<Integer>();
        for (Integer r: Arrays.asList(1,2,3,4,5,6)) {
            irl.add(r);
        }
        for(int i=0; i<10; i++){
            System.out.print(irl.select()+" ");
        }

        RandomList61<Pet> pets=new RandomList61<Pet>();
        for (Pet pet: Arrays.asList(new Dog(), new Rodent(), new Rat(), new Cymric())) {
            pets.add(pet);
        }
        for(int i=0; i<10; i++){
            System.out.print(pets.select()+" ");
        }

    }
}
