//Создайте класс для хранения трех объектов одного типа, с методами сохранения
//и выборки этих объектов и конструктором для инициализации всех трех объектов.
package generics.question2;

import typeInformations.pets.Dog;
import typeInformations.pets.Pet;

public class Question2<T> {
    T i1;
    T i2;
    T i3;

    public Question2(T i1, T i2, T i3){
        this.i1=i1;
        this.i2=i2;
        this.i3=i3;
    }
    public void setI1(T i1){
        this.i1=i1;
    }
    public void setI2(T i2){
        this.i2=i2;
    }
    public void setI3(T i3){
        this.i3=i3;
    }

    public T getI1(){
        return i1;
    }
    public T getI2(){
        return i2;
    }
    public T getI3(){
        return i3;
    }

    @Override
    public String toString() {
        return i1+" "+i2+" "+i3;
    }

    public static void main(String[] args) {
        Dog dog1=new Dog("vasia");
        Dog dog2=new Dog("petya");
        Dog dog3=new Dog("sava");
        Question2<Dog> dogs=new Question2<Dog>(dog1,dog2,dog3);
        System.out.println("Dogs: "+dogs);

    }


}
