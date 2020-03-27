//: generics/coffee/Mocha16.java
package typeInformations.question16;

import typeInformations.factory.Factory;

public class Mocha16 extends Coffee16 {
    public static class Factory implements typeInformations.factory.Factory<Mocha16>{
        @Override
        public Mocha16 create() {
            return new Mocha16();
        }
    }
} ///:~
