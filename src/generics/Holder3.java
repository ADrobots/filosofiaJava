package generics;

public class Holder3<T> {
    T a;
    public Holder3(T a){
        this.a=a;
    }
    public T get(){
        return a;
    }
    public void set(T a){
        this.a=a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3=new Holder3<Automobile>(new Automobile());
        Automobile a=h3.get();//преобразование не требуется

        //нельзя записать информацию типа String
        //h3.set("not an automobile");

        //нельзя записать информацию типа Integer
        //h3.set(1);
    }

    /**
     * При создании класса Holder3 нужно указать включаемый тип объектов с
     * использование синтаксиса с угловыми скобками.
     * В объекте можно размещать только объекты укаханного типа(того, который указан
     * в угловых скобках)
     * Получаемое значение автоматически относится к правильному типу.
     */
}
