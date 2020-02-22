package chapter10.question6.packageTwo;

import chapter10.question6.packageOne.One;

public class Two {
    protected class TwoTwo implements One{
        /*public TwoTwo(){}*/

        @Override
        public void watch() {
            System.out.println("Смотреть телевизор");
        }
    }
    public One one() {
        return new TwoTwo();
    }
}
