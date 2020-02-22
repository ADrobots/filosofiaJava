/**
 * Измените пример human так, чтобы исключения наследовали от
 * RuntimeException. Измените метод main() так, чтобы прием из
 * TurnOfChecking использовался для обработки разных типов исключений
 *
 */
package exceptions.question30;

import java.io.FileNotFoundException;
import java.io.IOException;

class Annoyance extends RuntimeException{}

//Annoyance - досада
class Sneeze extends Annoyance {}
//Sneeze - чих

public class Human {
    void throwRuntimeException(int type){
        try {
            switch (type){
                case 0: throw new Annoyance();
                case 1: throw new Sneeze();
                /*case 2: throw new RuntimeException("!!!");*/
                default: return;
            }
        }catch (Exception e){
            //Превращаем в некотролируемое исключение(заворачиваем в RuntimeException)
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Human y=new Human();
        try {
            y.throwRuntimeException(5);
        }catch (RuntimeException re){
            try {
                throw re.getCause();
            }catch (Sneeze s){
                System.out.println("Sneeze");
            }catch (Annoyance a){
                System.out.println("Anouance");
            }catch (Throwable t){
                System.out.println("Throwable");
            }
        }
    }
}

/**
 * Блок catch(Annnoyance a) перехватит Annnoyance или любой другой класс, унаследованный от него.
 */
