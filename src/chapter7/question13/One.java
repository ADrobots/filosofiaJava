package chapter7.question13;
class Two{
    public void stroka(String s){
        System.out.println("String Two");
    }
    public void stroka(int i){
        System.out.println("Int Two");
    }
    public void stroka(char c){
        System.out.println("Char Two");
    }
}

public class One extends Two{
    public void stroka(float f){
        System.out.println("Float One");
    }

    public static void main(String[] args) {
        One one=new One();
        one.stroka("1");
        one.stroka(2);
        one.stroka('3');
        one.stroka(4.0f);
    }
}

