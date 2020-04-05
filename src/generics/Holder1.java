package generics;
class Automobile{}

public class Holder1 {
    //holder  - держатель
    private Automobile a;
    public Holder1(Automobile a){
        this.a=a;
    }
    Automobile get(){
        return a;
    }
}
/**
 * Класс не универсальный, так как хранит только один класс.
 * ДЛя того чтобы не писать новый класс для каждого типа, можем
 * в классе хранить поле Object
 * {@link generics.Holder2}
 */
