package typeInformations.question15;

        import typeInformations.factory.Factory;
        import typeInformations.pets.Pet;

        import java.util.ArrayList;
        import java.util.List;

public class PetFactory {
    public String toString(){
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Pet>> petFactories=new ArrayList<Factory<? extends Pet>>();

    static {
        petFactories.add(new FuelFilter.Factory());
        petFactories.add(new AirFilter.Factory());
        petFactories.add(new CabinAirFilter.Factory());
        petFactories.add(new OilFilter.Factory());
        petFactories.add(new FanBelt.Factory());
        petFactories.add(new PowerSteeringBelt.Factory());
        petFactories.add(new GeneratorBelt.Factory());
    }

    private static Random random=new Random(47);

    public static Part createRandom(){
        int n=random.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}
