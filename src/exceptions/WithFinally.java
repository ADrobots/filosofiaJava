package exceptions;

public class WithFinally {
    public static void main(String[] args) {
        Switch sw=new Switch();
        try {
            sw.on();
            OnOffSwitch.f();
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
