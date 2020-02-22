//Блок finally выполнится всегда
package exceptions;
class FourException extends Exception{}

public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Входим в первый блок try");
        try {
            System.out.println("Входим во второй блок try");
            try {
                throw new FourException();

            }finally {
                System.out.println("Finally во втором блоке try");
            }
        }catch (FourException fe){
            System.out.println("Перехвачено FourException в первом блоке try");
        }finally {
            System.out.println("Finally в первом блоке try");
        }
    }

}

/**
 * finally так же исполняется в ситуациях, где используется операторы break и contionue
 * Данная комбинация блока finally и операторов break и continue исбавляет необходимость
 * в использовании оператора goto
 */
