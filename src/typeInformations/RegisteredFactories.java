//Регистрация фабрик класса в базовом классе
package typeInformations;

import typeInformations.factory.Factory;

import java.util.ArrayList;
import java.util.List;

class Part{
    public String toString(){
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories=new ArrayList<Factory<? extends Part>>();


}

class Filter extends Part{}

class FuelFilter extends Filter{
    //создание фабрики класса для каждого конкретного типа

    public static class Factory implements typeInformations.factory.Factory<FuelFilter>{
        public FuelFilter create(){
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter{
    public static class Factory implements typeInformations.factory.Factory<AirFilter>{
        public AirFilter create(){
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter{
    public static class Factory implements typeInformations.factory.Factory<CabinAirFilter>{
        public CabinAirFilter create(){
            return new CabinAirFilter();
        }
    }
}



public class RegisteredFactories {

}
