
/*
Продемонстрируйте, что программа WithFinally работает корректно
при возбуждении RuntimeException внутри блока try
 */
package exceptions.question15;

class Switch {
    private boolean state=false;
    public boolean read(){return  state;}
    public void on(){
        state=true;
        System.out.println(this);
    }
    public void off(){
        state=false;
        System.out.println(this);
    }
    public String toString(){
        return state?"вкл":"выкл";
    }
}

class OnOffException1 extends Exception{};
class OnOffException2 extends Exception{};

public class WithFinally {
    public static Integer[] integers=new Integer[1];
    /*public static void f() throws OnOffException1, OnOffException2 {
        throw new RuntimeException();
    }*/
    public static void f(int i) throws OnOffException1, OnOffException2 {

    }

    public static void main(String[] args) {
        Switch sw=new Switch();
        try {
            sw.on();
            /*WithFinally.f();*/
            WithFinally.f(integers[0]);
        }catch (OnOffException1 o1){
            o1.printStackTrace();
        }catch (OnOffException2 o2){
            o2.printStackTrace();
        }finally {
            sw.off();
        }
    }
}

/**
 * Вызов метода off() перенесен в блок finally, она будет выполнен гарантированно.
 * Даже если исключение будет перезхвачено в блоке catch, блок finally отработает, перед тем как
 * исключение продолжит поиск обработчика на высоком уровне
 *
 * далее {@link exceptions.AlwaysFinally}
 */
