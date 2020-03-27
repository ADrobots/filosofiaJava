//: generics/coffee/Cappuccino16.java
package typeInformations.question16;

import typeInformations.factory.Factory;

public class Cappuccino16 extends Coffee16 {
    public static class Factory implements typeInformations.factory.Factory<Cappuccino16>{
        @Override
        public Cappuccino16 create() {
            return new Cappuccino16();
        }
    }
} ///:~
