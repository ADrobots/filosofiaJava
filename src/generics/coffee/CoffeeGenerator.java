package generics.coffee;

import javax.naming.OperationNotSupportedException;
import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee>{
    private Class[] types={Latte.class,Mocha.class,Cappuccino.class,Americano.class,Brave.class};

    private static Random random=new Random(47);

    public CoffeeGenerator(){}

    //данная часть кода для перебора
    private int size=0;
    public CoffeeGenerator(int size){
        this.size=size;
    }

    @Override
    public Coffee next() {
        try{
            return (Coffee)types[random.nextInt(types.length)].newInstance();
        }catch (Exception e){
            throw new RuntimeException();
        }
    }

    class CoffeeIterator implements Iterator<Coffee>{
        int count=size;
        public boolean hasNext(){return count>0;}
        public Coffee next(){
            count--;
            return CoffeeGenerator.this.next();
        }
        //метод не реализован
        public void remove(){
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator gen=new CoffeeGenerator();

        for (int i=0; i<5; i++){
            System.out.print(gen.next()+" ");
        }
        System.out.println("\n-=-=-=-=-=-=-=-");
        for (Coffee c:new CoffeeGenerator(6)) {
            System.out.println(c);
        }
    }
}
/**
 * Параметризованный интерфейс  Generator гарантирует
 * возврат параметра-типа из метода next()
 *
 * CoffeeGenerator реализует интерфейс Iterable для того чтобы
 * использовать его в конструкции foreach.
 */
