package chapter7.question19;
//"Пустые" неизменные поля

class TwoObject{
    private final int x;
    TwoObject(int i){
        x=i;
    }

    @Override
    public String toString() {
        return "TwoObject{" +
                "x=" + x +
                '}';
    }
}

public class OneObject {
    private final int o;//Пустая константа
    private final TwoObject twoObject;//Пустая константа-ссылка

    OneObject(){
        o=2;//Инициализация пустой константы
        twoObject=new TwoObject(2);//Инициализация пустой неизменной ссылки
    }

    OneObject(int i){
        o=i;//Инициализация пустой константы
        twoObject=new TwoObject(i);//Инициализация пустой неизменной ссылки
    }

    public static void main(String[] args) {
        OneObject one=new OneObject();
        OneObject two=new OneObject(1);

        //one.twoObject=new TwoObject(3);
        //two.twoObject=new TwoObject(2);

        System.out.println(one.twoObject);
        System.out.println(two.twoObject);
    }
}
