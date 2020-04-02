//: generics/coffee/Americano16.java
package typeInformations.question16;

import typeInformations.factory.Factory;

public class Americano16 extends Coffee16 {
    public static class Factory implements typeInformations.factory.Factory<Americano16>{

        @Override
        public Americano16 create() {
            return new Americano16();
        }
    }
} ///:~
