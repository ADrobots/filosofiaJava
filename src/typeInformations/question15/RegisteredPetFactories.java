/**
 * Реализуйте новую версию PetFactor с ипользованием регистрации фабрик. Измените фасад
 * Pets чтобы он мог использовать эту версию вместо двух других. Убедитесь в том что остальные
 * примеры, использующие Pets.java продолжают работать правильно
 */
package typeInformations.question15;

import typeInformations.factory.Factory;
import typeInformations.pets.*;
import typeInformations.pets.LiteralPetCreator;
import typeInformations.pets.PetCreator;

import java.util.*;

//Для решения задания нужно переписать базовый класс Individual
//который используется в классе PetFactory и методах Pets и PetCreator
public class RegisteredPetFactories {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.println(PetFactory.createRandom());
        }
    }
}
