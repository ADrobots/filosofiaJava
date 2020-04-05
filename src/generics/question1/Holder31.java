//Используйте Holder31 с библиотекой pets и продемонстрируйте, что объект
//Holder31 объявленый с базовым типом, может так же хранит производный тип.

package generics.question1;

import typeInformations.pets.Dog;
import typeInformations.pets.Pet;
import typeInformations.pets.Rat;
import typeInformations.pets.Rodent;


public class Holder31<T> {
    T a;
    public Holder31(T a){
        this.a=a;
    }
    public void set(T a){
        this.a=a;
    }
    public T get(){
        return a;
    }

    public static void main(String[] args) {
        Holder31<Pet> pets=new Holder31<Pet>(new Pet());
        Pet p=pets.get();
        System.out.println(p);

        pets.set(new Dog());
        System.out.println(pets.get());

        pets.set(new Rodent());
        System.out.println(pets.get());

        pets.set(new Rat());
        System.out.println(pets.get());
    }
}
