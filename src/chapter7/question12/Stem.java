package chapter7.question12;

class Component1{
    Component1(){
        System.out.println("Вызван Components1");}
    void dispose(){
        System.out.println("Завершен  Component1");
    }
}

class Component2{
    Component2(){
        System.out.println("Вызван Components2");
    }
    void dispose(){
        System.out.println("Завершен  Component2");
    }
}

class Component3{
    Component3(){
        System.out.println("Вызван Components3");
    }
    void dispose(){
        System.out.println("Завершен  Component3");
    }
}

class Root{
    Component1 component1Root;
    Component2 component2Root;
    Component3 component3Root;
    Root(){
        System.out.println("Вызван Root");
        component1Root=new Component1();
        component2Root=new Component2();
        component3Root=new Component3();
    }
    void dispose(){
        component3Root.dispose();
        component2Root.dispose();
        component1Root.dispose();
        System.out.println("Завершен  Root");

    }


}

public class Stem extends Root {
    Component1 component1Stem;
    Component2 component2Stem;
    Component3 component3Stem;
    Stem(){
        super();
        System.out.println("Вызван Stem");
        component1Stem=new Component1();
        component2Stem=new Component2();
        component3Stem=new Component3();
    }
    void dispose(){
        component3Stem.dispose();
        component2Stem.dispose();
        component1Stem.dispose();
        System.out.println("Завершен  Stem");
        super.dispose();
    }

    public static void main(String[] args) {
        Stem stem=new Stem();
        try {

        }finally {
            stem.dispose();
        }
    }
}
