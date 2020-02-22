package chapter10.question6.packageThree;


import chapter10.question6.packageOne.One;
import chapter10.question6.packageTwo.Two;

public class Three extends Two{
    /*One one(){
        return this.new TwoTwo();
    }*/

    public static void main(String[] args) {
        Two t=new Two();
        One tt=t.one();
        tt.watch();

        /*Three three=new Three();
        three.one().watch();*/
    }
}
