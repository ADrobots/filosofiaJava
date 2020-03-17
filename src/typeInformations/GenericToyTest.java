package typeInformations;

public class GenericToyTest {
    public static void main(String[] args) throws Exception{
        Class<FancyToy> ftClass=FancyToy.class;

        //Создается точный тип:
        FancyToy fancyToy=ftClass.newInstance();

        Class<? super FancyToy> up=ftClass.getSuperclass();

        //Не компилируется
        //Class<Toy> up2=ftClass.getSuperclass();

        //Создается только Object
        Object obj=up.newInstance();
    }
}
/**
 * При получении объекта суперкласса компилятор позволяет сказать, что суперкласс
 * представляет "некий класс, являющийся суперклассом FancyToy"
 * Компилятор не принимает Class<Toy>.
 * Из-за не однозначтности up.newInstance() возвращает не точный тип, а прост Object.
 */
