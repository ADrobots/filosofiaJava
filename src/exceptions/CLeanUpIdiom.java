/**
 * За создание каждого объекта, нуждающегося в завершении
 * должна следовать конструкция try-finally
 */

package exceptions;

class NeedsCleanUp{
    private static long counter=1;
    private final long id=counter++;

    public void dispose(){
        System.out.println("NeedsCleanUp "+id+" освобожден");
    }
}

class ConstructionException extends Exception{}

class NeedsCleanUp2 extends NeedsCleanUp{
    //Возможны ошибки при конструировании
    public NeedsCleanUp2() throws ConstructionException{}
}

public class CLeanUpIdiom {
    public static void main(String[] args) {
        //Часть 1:
        //Если ошибки при конструировании исключены, блок catch не нужен
        NeedsCleanUp nc1=new NeedsCleanUp();
        try {

        }finally {
            nc1.dispose();
        }

        //Часть 2
        //Если ошибки конструирования невозможны, объекты можно группировать:
        NeedsCleanUp nc2=new NeedsCleanUp();
        NeedsCleanUp nc3=new NeedsCleanUp();
        try{

        }finally {
            //Обратный порядок конструирования
            nc3.dispose();
            nc2.dispose();
        }

        //Часть 3
        //Если при конструировании возможны ошибки, необходимо защитить
        //каждую операцию

        try{
            NeedsCleanUp2 nc4=new NeedsCleanUp2();
            try {
                NeedsCleanUp2 nc5=new NeedsCleanUp2();
                try {

                }finally {
                nc5.dispose();
                }
            }catch (ConstructionException ce){
            System.out.println(ce);
            }finally {
                nc4.dispose();
            }
        }catch (ConstructionException ce){
            System.out.println(ce);
        }
    }
}
/**
 * Громозкость обработки исключений - веская причина для создания конструкторов,
 * при выполнении которых не могут происходить ошибки.
 * Если dispoce() возбуждает исключение, понабятся дополнительные блоки try.
 */
