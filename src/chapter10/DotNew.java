package chapter10;
//Выражение new указывает внешнему объекту создать
//объект одного из его внутренних класов


public class DotNew {
    class Inner{}

    public static void main(String[] args) {
        DotNew dn=new DotNew();
        DotNew.Inner dni=dn.new Inner();
    }

}
