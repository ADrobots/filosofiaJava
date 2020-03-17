package typeInformations;

public class BoundedClassReferences {
    //bounded - ограниченная
    //references - ссылка
    public static void main(String[] args) {
        Class<? extends Number> bounded=int.class;
        bounded=double.class;
        bounded=Number.class;
        //или любой класс, производный от Number
    }
}
/**
 Синтаксис параметризации добавлены для обеспечения проверки комиляции, для
 того чтобы узнать заранее о допущеных ошибках.
 С обычными ссылками на Class об ошибках узнаем только во время выполнения программы
 */