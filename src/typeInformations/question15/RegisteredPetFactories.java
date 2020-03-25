/**
 * Реализуйте новую версию PetFactor с ипользованием регистрации фабрик. Измените фасад
 * Pets чтобы он мог использовать эту версию вместо двух других. Убедитесь в том что остальные
 * примеры, использующие Pets.java продолжают работать правильно
 */
package typeInformations.question15;

import typeInformations.factory.Factory;
import typeInformations.pets.*;
import typeInformations.pets.LiteralPetCreator;
import typeInformations.pets.PetCreator;

import java.util.*;

class PetFactory{
    public String toString(){
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Pet>> petFactories=new ArrayList<Factory<? extends Pet>>();

    static {
        petFactories.add(new Pet.Factory());
    }

    private static Random random=new Random();
    public static Pet createRandom(){
        int n=random.nextInt(petFactories.size());
        return petFactories.get(n).create();
    }
}

class Individual15 extends PetFactory implements Comparable<Individual15>{
    private static long counter=0;
    private final long id=counter++;
    private String name;
    public Individual15(String name){
        this.name=name;
    }
    public Individual15(){}
    public String toString(){
        return getClass().getSimpleName()+(name==null?"":" "+name);
    }
    public long id(){return id;}
    public boolean equals(Object o){
        return o instanceof Individual15 && id==((Individual15)o).id;
    }
    public int hashCode(){
        int result=17;
        if(name!=null){
            result=37*result+name.hashCode();
        }
        result=37*result+(int)id;
        return result;
    }
    public int compareTo(Individual15 arg){
        String first=getClass().getSimpleName();
        String argFirst=arg.getClass().getSimpleName();
        int firstCompare=first.compareTo(argFirst);
        if(firstCompare!=0){
            return firstCompare;
        }
        if (name!=null && arg.name!=null){
            int secondCompare=name.compareTo(arg.name);
            if (secondCompare!=0){
                return secondCompare;
            }
        }
        return (arg.id<id ? -1 : (arg.id==id?0:1));
    }
}

class Pets{
    public static final PetCreator creator=new LiteralPetCreator();
    public static Pet randomPet(){
        return PetFactory.createRandom();
    }
    public static Pet[] createArray(int size){
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size){
        return creator.arrayList(size);
    }

}

abstract class PetCreator15{
    private Random random=new Random();
    public abstract List<Class<? extends Pet>> types();

    public Pet randomPet(){
        return PetFactory.createRandom();
    }
    public Pet[] createArray(int size){
        Pet[] result=new Pet[size];
        for(int i=0; i<size; i++){
            result[i]=randomPet();
        }
        return result;
    }
    public ArrayList<Pet> arrayList(int size){
        ArrayList<Pet> result=new ArrayList<Pet>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}

public class LiteralPetCreator15 extends PetCreator15 {

    public static final List<Class<? extends Pet>> allTypes= Collections.unmodifiableList(
            Arrays.asList(Pet.class, Dog.class, Cat.class, Rodent.class,
                    Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                    Cymric.class, Rat.class, Mouse.class, Humster.class));

    //типы, которые должны создаваться случайным образом
    private static final List<Class<? extends Pet>> types=allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
}

public class RegisteredPetFactories {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.println();
        }
    }
}
