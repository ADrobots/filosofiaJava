//: generics/coffee/Breve16.java
package typeInformations.question16;

import typeInformations.factory.Factory;

public class Breve16 extends Coffee16 {
    public static class Factory implements typeInformations.factory.Factory<Breve16>{
        @Override
        public Breve16 create() {
            return new Breve16();
        }
    }
} ///:~
