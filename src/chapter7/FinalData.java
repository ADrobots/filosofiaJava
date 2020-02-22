package chapter7;

import java.util.Random;

class Value{
    int i;//доступ в пределах пакета
    public Value(int i){
        this.i=i;
    }
}
public class FinalData {
    private static Random random=new Random(20);

    private String id;
    public FinalData(String id){this.id=id;}

    //Могут быть константами во врмемя компиляции
    private final int valueOne=9;
    private static final int VALUE_two=99;

    //Типичная открытая константа
    private static final int VALUE_THREE=39;

    //Не может быть константой времени компиляции
    private final int i4=random.nextInt(20);//значения для разных объектов уникальны
    static final int INT_5=random.nextInt(20);//инициалидируется один раз во время загрузки
    private Value value1=new Value(11);
    private final Value value2=new Value(12);
    private static final Value VAL_3=new Value(33);

    //Массивы
    private final int[] a={1,2,3,4,5,6};
    public String toString(){
        return id +": "+"i4= "+i4+", INT_5= "+INT_5;
    }

    public static void main(String[] args) {
        FinalData finalData1=new FinalData("finalData1");
       // finalData1.valueOne++;//Значение нельзя изменить
        finalData1.value2.i++;//Объект не является неизменным
        for(int i=0; i<finalData1.a.length; i++){
            finalData1.a[i]++;//Объект так же является неизменным
        }
       // finalData1.value2=new Value(0);//Ссылку нельзя изменить
       // finalData1.VAL_3=new Value(1);//Ссылку нельзя изменить
       // finalData1.a=new int[3];//Ссылку на объект в массиве нельзя изменить

        System.out.println(finalData1);
        FinalData finalData2=new FinalData("finalData2");
        System.out.println(finalData1);
        System.out.println(finalData2);

    }
}
