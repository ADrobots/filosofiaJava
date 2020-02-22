/**
 * Продемонстрируйте, что конструктор производного класса не может перехватывать
 * исключения, возбужденные конструктором базового класса.
 */

package exceptions.question21;

class OneExceprion extends Exception{}

class MainConstructor{
    public MainConstructor() throws OneExceprion{
        throw new OneExceprion();
    }

}

class SecondaryConstructor extends MainConstructor {
    //Исключение OneException должен быть пойман или брошен
    public SecondaryConstructor() throws OneExceprion {

        super();
        //поймать исключение try и catch не допускается
        //так как первым вызывается оператор super() в конструкторе
       // try {
            //super();
        //} catch (OneExceprion e) {
            //e.printStackTrace();
        //}

    }
}
public class Question21 {
    public static void main(String[] args) {
        try{
            SecondaryConstructor sc=new SecondaryConstructor();
        }catch (OneExceprion e){
            e.printStackTrace();
        }
    }
}
