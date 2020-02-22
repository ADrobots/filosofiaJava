//Перехват иерархии исключений
package exceptions;

class Annoyance extends Exception{}
//Annoyance - досада
class Sneeze extends Annoyance{}
//Sneeze - чих

public class Human {
    public static void main(String[] args) {
        //Перехват точного типа
        try{
            throw new Sneeze();
            //Перехвачен первый блок, который соответствует возбужденному исключению
        }catch (Sneeze s){
            System.out.println("Sneeze");
        }catch (Annoyance a){
            System.out.println("Annoyance");
        }

        //Перехват точного типа
        try{
            throw new Sneeze();
            //исключение все равно будет поймано, так как исключение Sneeze перехватывает
            //базовый класс
        }catch (Annoyance a){
            System.out.println("Annoyance");
        }
    }
}

/**
 * Блок catch(Annnoyance a) перехватит Annnoyance или любой другой класс, унаследованный от него.
 */
