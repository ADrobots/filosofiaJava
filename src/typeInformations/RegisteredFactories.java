//Регистрация фабрик класса в базовом классе
package typeInformations;

import typeInformations.factory.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part{
    public String toString(){
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories=new ArrayList<Factory<? extends Part>>();

    static {
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
    }

    private static Random random=new Random(47);

    public static Part createRandom(){
        int n=random.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }


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

class OilFilter extends Filter{
    public static class Factory implements typeInformations.factory.Factory<OilFilter>{
        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part{}
//Belt - румень

class FanBelt extends Belt{
    //fan belt - ремень вентилятора
    public static class Factory implements typeInformations.factory.Factory<FanBelt>{
        public FanBelt create(){
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt{
    public static class Factory implements typeInformations.factory.Factory<GeneratorBelt>{
        public GeneratorBelt create(){
            return new GeneratorBelt();
        }
    }
}

class PowerSteeringBelt extends Belt{
    public static class Factory implements typeInformations.factory.Factory<PowerSteeringBelt>{
        public PowerSteeringBelt create(){
            return new PowerSteeringBelt();
        }
    }
}



public class RegisteredFactories {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.println(Part.createRandom());
        }
    }

}
/**
 * Классы Belt и Filter существуют только для классификации, поэтому программа
 * не должна создавать экзмемплятры этих классов, а только их субклассов.
 * Если класс должен создаваться методом createRandom(), то он должен содержать
 * внутренний класс Factory.
 * Метод createRaтвщь() выбрает случайный объект-фабрику из Part.Factories и вызывает
 * его метод create() для создания нового объекта Part.
 */
