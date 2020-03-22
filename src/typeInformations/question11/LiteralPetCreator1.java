//Использование литералов Class
package typeInformations.question11;

import typeInformations.pets.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator1 extends PetCreator1 {

    public static final List<Class<? extends Pet>> allTypes= Collections.unmodifiableList(
            Arrays.asList(Pet.class, Dog.class, Cat.class, Rodent.class,
                    Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                    Cymric.class, Rat.class, Mouse.class, Humster.class, Gerbil.class));

    //типы, которые должны создаваться случайным образом
    private static final List<Class<? extends Pet>> types=allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
}

/**
 * В следующем примере PetCount3 контейнер необходимо заполнить всеми типами Pet(в том числе теми, которые
 * генерируются случайным образом), поэтому необходим контейнер allTypes.
 *
 * Список types() заполняется частичным содержимым контейнера allTypes()
 * с пмощью вызова метода List.subList(). Список types() содержит типы Pet,
 * используемые для генерации случаных объектов Pet.
 *
 * В этом примере type()  не нужно заключать в блок try, так как обработка осуществляется на стадии компиляции
 * т.к. не приведет к выдаче искоючений(в отличие от Class.forName())
 */
