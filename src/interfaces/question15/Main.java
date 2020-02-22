package interfaces.question15;


interface One{
    void one();
    void oneOne();
    void oneOneOne();
}

interface Two{
    void two();
    void twoTwo();
    void twoTwoTwo();
}

interface Three{
    void three();
    void threeThree();
    void threeThreeThree();
}

interface Four extends One, Two, Three {
    void four();
    void fourFour();
    void fourFourFour();
}

abstract class Five{
    abstract void five();
    public String toString(){return "Five";};
}

class Six extends Five implements Four {
    void five(){
        System.out.println("Five");
    }
    public void one(){};
    public void oneOne(){};
    public void oneOneOne(){};
    public void two(){};
    public void twoTwo(){};
    public void twoTwoTwo(){};
    public void three(){};
    public void threeThree(){};
    public void threeThreeThree(){};
    public void four(){};
    public void fourFour(){};
    public void fourFourFour(){};
}

public class Main {
    static void o(One o){o.one(); o.oneOne(); o.oneOneOne();}
    static void t(Two t){t.two(); t.twoTwo(); t.twoTwoTwo();}
    static void th(Three th){th.three(); th.threeThree(); th.threeThreeThree();}
    static void fo(Four fo){fo.four(); fo.fourFour(); fo.fourFourFour(); fo.one(); fo.oneOne(); fo.oneOneOne(); /*...*/}
    static void six(Six s){s.five();/*...*/;  s.five();}
    public static void main(String[] args) {
        Six people=new Six();
        o(people);
        t(people);
        th(people);
        fo(people);
        six(people);

    }
}
