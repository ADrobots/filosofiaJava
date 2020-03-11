package typeInformations;

public class GenericClassReferences {
    public static void main(String[] args) {
        //Обычную ссылку Class можно связать с любым объектом Class
        Class intClass=int.class;

        //Параметризованную ссылку можно связать только с объявленым типом.
        Class<Integer> genericIntClass=int.class;
        genericIntClass=Integer.class;

        //Использование синтаксиста обобщенных типов позволяет компилятору
        //реалоизовать дополнительную проверку типа
        //genericIntClass=double.class;
    }

}
