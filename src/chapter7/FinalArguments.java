package chapter7;
//Использование final с аргументами метода
class Gizmo{
    public void spin(){
        System.out.println("Gizmo");
    };
}

public class FinalArguments {
    void with(final Gizmo g){
        //g=new Gizmo();//Запрещено g объявлено final
    }

    void without(Gizmo g){
        g=new Gizmo();//Разрешено g не является final
        g.spin();
    }

    //void g(final int i){i++};//Нельзя именять, неизменные примитивы доступны только для чтения
    int f(final int i){return  i+1;}

    public static void main(String[] args) {
        FinalArguments x=new FinalArguments();
        x.without(new Gizmo());
        x.with(new Gizmo());

    }
}
