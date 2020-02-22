package chapter7.question10;

class Component1{
    Component1(String c1){
        System.out.println("Первое любимле блюдо "+c1);
    }
}
class Component2{
    Component2(String c2){
        System.out.println("Второе любимле блюдо "+c2);
    }
}
class Component3{
    Component3(String c3){
        System.out.println("Третье любимле блюдо "+c3);
    }
}

class Root{
    Component1 component1Root=new Component1("Лапша");
    Component2 component2Root=new Component2("Пельмени");
    Component3 component3Root=new Component3("Суп");
    Root(char r){
        System.out.println("Вызван Root"+r);
    }


}

public class Stem extends Root{
    Component1 component1Stem=new Component1("Роллы");
    Component2 component2Stem=new Component2("Борщ");
    Component3 component3Stem=new Component3("Лазанья");
    Stem(char s){
        super('!');
        System.out.println("Вызван Stem"+s);
    }

    public static void main(String[] args) {
        Stem stem=new Stem('?');
    }
}
