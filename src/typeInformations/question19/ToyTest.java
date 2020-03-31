//В программе ToyTest используйте отражение для создания
//объекта Toy конструктором с аргументами
package typeInformations.question19;

import java.lang.reflect.InvocationTargetException;

interface HasBatteries{}

interface Waterproof{}

interface Shoots{}

class Toy{

    Toy(){}
    Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    //fancy - маскарадный
    FancyToy(){
        super(1);
    }
}

public class ToyTest {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("typeInformations.question19.Toy");
            c.getDeclaredConstructor(int.class).newInstance(25);
        } catch(NoSuchMethodException e) {
            System.out.println("No such method: " + e);
        } catch(InstantiationException e) {
            System.out.println("Unable make Toy: " + e);
        } catch(IllegalAccessException e) {
            System.out.println("Unable access: " + e);
        } catch(InvocationTargetException e) {
            System.out.println("Target invocation problem: " + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
