package chapter11;

import java.util.ArrayList;
import java.util.Collection;
//Обычно создается объект конкретного класса,
//преобразуем его в соответствующий интерфейс
//восходящтим преобразование и затем используем
// интерфейс в оставшейся части кода.
//Такое решение работает не всегда, потому что некоторые классы
//обладают дополнительной функциональностью
//Интерфейс Collection обобщает концепцию последовательности
//-способа хранения группы объектов


public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList<Integer>();

        for (int i=0; i<=10; i++){
            c.add(i);
        }

        for (Integer i:c) {
            System.out.print(i+", ");
        }
    }
}

//В этом примере используется только методы Collection,
//подойдет объект любого класс, производного от Collecction,
//но самым распространенным типом последовательности является
//ArrayList
