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
