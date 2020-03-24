/**
 * Конструктором является разновидностью "Фабричный метод". Измените метод RegisteredFactories так, чтобы вместо использования
 * явно заданной фабрики обхъект класса сохранялся в List, а для создания  каэдого объекта использовался метод newInstance()
 */

//Регистрация фабрик класса в базовом классе
package typeInformations.question14;

import typeInformations.factory.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part1{
    public String toString(){
        return getClass().getSimpleName();
    }

    static List<Class<? extends Part1>> partFactories=new ArrayList<Class<? extends Part1>>();

    static {
        partFactories.add(FuelFilter1.class);
        partFactories.add(AirFilter1.class);
        partFactories.add(CabinAirFilter1.class);
        partFactories.add(OilFilter1.class);
        partFactories.add(FanBelt1.class);
        partFactories.add(PowerSteeringBelt1.class);
        partFactories.add(GeneratorBelt1.class);
    }

    private static Random random=new Random(47);

    public static Part1 createRandom(){
        int n=random.nextInt(partFactories.size());
        try{
            return partFactories.get(n).newInstance();
        }catch (InstantiationException e){
            throw new RuntimeException(e);
        }catch (IllegalAccessException e){
            throw new RuntimeException(e);
        }
    }


}

class Filter1 extends Part1 {}

class FuelFilter1 extends Filter1 {
    //создание фабрики класса для каждого конкретного типа

    public static class Factory implements typeInformations.factory.Factory<FuelFilter1>{
        public FuelFilter1 create(){
            return new FuelFilter1();
        }
    }
}

class AirFilter1 extends Filter1 {
    public static class Factory implements typeInformations.factory.Factory<AirFilter1>{
        public AirFilter1 create(){
            return new AirFilter1();
        }
    }
}

class CabinAirFilter1 extends Filter1 {
    public static class Factory implements typeInformations.factory.Factory<CabinAirFilter1>{
        public CabinAirFilter1 create(){
            return new CabinAirFilter1();
        }
    }
}

class OilFilter1 extends Filter1 {
    public static class Factory implements typeInformations.factory.Factory<OilFilter1>{
        @Override
        public OilFilter1 create() {
            return new OilFilter1();
        }
    }
}

class Belt1 extends Part1 {}
//Belt - румень

class FanBelt1 extends Belt1 {
    //fan belt - ремень вентилятора
    public static class Factory implements typeInformations.factory.Factory<FanBelt1>{
        public FanBelt1 create(){
            return new FanBelt1();
        }
    }
}

class GeneratorBelt1 extends Belt1 {
    public static class Factory implements typeInformations.factory.Factory<GeneratorBelt1>{
        public GeneratorBelt1 create(){
            return new GeneratorBelt1();
        }
    }
}

class PowerSteeringBelt1 extends Belt1 {
    public static class Factory implements typeInformations.factory.Factory<PowerSteeringBelt1>{
        public PowerSteeringBelt1 create(){
            return new PowerSteeringBelt1();
        }
    }
}


public class RegisteredFactories1 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.println(Part1.createRandom());
        }
    }

}
