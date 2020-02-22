package chapter7.question9;

class Component1{
    Component1(){
        System.out.println("Вызван Components1");
    }
}
class Component2{
    Component2(){
        System.out.println("Вызван Components2");
    }
}
class Component3{
    Component3(){
        System.out.println("Вызван Components3");
    }
}

class Root{
    Component1 component1Root;
    Component2 component2Root;
    Component3 component3Root;
    Root(){
        System.out.println("Вызван Root");
    }


}

public class Stem extends Root{
    Component1 component1Stem;
    Component2 component2Stem;
    Component3 component3Stem;
    Stem(){
        System.out.println("Вызван Stem");
    }

    public static void main(String[] args) {
        Stem stem=new Stem();
    }
}
