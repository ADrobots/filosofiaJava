//Создавая объект(ForNameCreator), производный от PetCreator
//Нужно передать только контейнер с типами объектов, которые создаются методом
//randomPet() и другими методами.

package typeInformations.question11;

import typeInformations.pets.Pet;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types=new ArrayList<Class<? extends Pet>>();

    private static String[] typeNames={
            "typeInformations.pets.Mutt",
            "typeInformations.pets.Pug",
            "typeInformations.pets.EgyptianMau",
            "typeInformations.pets.Manx",
            "typeInformations.pets.Cymric",
            "typeInformations.pets.Rat",
            "typeInformations.pets.Mouse",
            "typeInformations.pets.Humster",
            "typeInformations.question11.Gerbil"

    };

    private static  void loader(){
        try{
            for (String name:typeNames) {
                types.add((Class<? extends Pet>)Class.forName(name));
            }
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    static {loader();}

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }


}

//Метод loader() создает контейнер List с объектами Class посредством
//метода Class.forName().

//Для создания типизированного контейнера List с объектами Class необходимо
//приведение типа, из-за которго компилятор выдает предупреждение.




