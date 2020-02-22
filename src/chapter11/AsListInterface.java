package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Show{}
class Powder extends Show{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Show{}
class Slush extends Show{}

public class AsListInterface {
    public static void main(String[] args) {

        List<Show> show1= Arrays.asList(new Crusty(),new Slush(), new Powder());

       /*List<Show> show2=Arrays.asList(new Light(), new Heavy());
         не откомпилируется, так как Arrays.asList() обнаруживает только Powder,
        поэтому он создается List<Powder> вместо List<Show>
        */

        List<Show> show3=new ArrayList<Show>();
        Collections.addAll(show3, new Light(), new Heavy()/*, show1*/);//допускается только один объект List

        /*Collections.addAll() - работает нормально, так как по перному аргументу
         определяет правильный целевой тип */

        //Подсказка с явно указанным аргументом типа
        List<Show> show4=Arrays.<Show>asList(new Light(), new Heavy());

        /*В середину последовательности Arrays.asList() можно вставить "подсказку"
        *, которая сообщит компилятору фактический целевой тип List. Этот прием называесят
        *  ЯВНЫМ УКЗАНАИЕМ  АРГУМЕНТА ТИПА*/
    }
}
