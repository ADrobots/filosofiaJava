//: generics/coffee/Latte16.java
package typeInformations.question16;

import typeInformations.factory.Factory;

public class Latte16 extends Coffee16 {
    public static class Factory implements typeInformations.factory.Factory<Latte16>{
        @Override
        public Latte16 create() {
            return new Latte16();
        }
    }
} ///:~
