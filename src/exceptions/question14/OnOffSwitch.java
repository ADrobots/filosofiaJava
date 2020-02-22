/**
 * Покажите, что программа OnOffSwith.java может завершиться сбоем при
 * возбуждении RuntimeException внутри блока try
 */

package exceptions.question14;

//Switch - переключатель
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

public class OnOffSwitch{
    public static Integer[] integers=new Integer[1];

    //вариант из книги
    public static void f(int i) throws OnOffException1, OnOffException2 {
    }

    //мой вариант
    /*public static void f() throws OnOffException1, OnOffException2 {
        throw new RuntimeException();
    }*/
    public static void main(String[] args) {
        Switch sw=new Switch();

    try{
        sw.on();
        f(integers[0]);
        /*f();*/
        sw.off();
        }catch(OnOffException1 o1){
        o1.printStackTrace();
        sw.off();
        }catch (OnOffException2 o2){
        o2.printStackTrace();
        sw.off();
        }

    }
}

/**
 * Для выключения переключателя по завершению рабоыт метоад main в конце блока try и каждого
 * блока обрабтчика исключения вызывается метод off().
 * Но проблема будет вызвана тем, что исключение может быть не перехвачено и метод off()
 * не будет вызван, поэтому предпочтительней испльзовать блок finally, так как в него будет
 * помещен завершающий код, метод off()
 *пример далее {@link exceptions.WithFinally}
 *
 */
