package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    static public final String POEM="Twas brilling, and the slithy toves\n"+
            "Did gyre and gimble in the wade.\n"+
            "All mimsy were the borogoves\n"+
            "And the mome raths outgrabe\n\n"+
            "Baware the Jabberworck, my son,\n"+
            "The jaws that bite, the claws that catch.\n"+
            "Beware the Jubjub bird, and shun\n"+
            "The frumios Bandersnatch.";

    public static void main(String[] args) {
        Matcher m= Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);

        while(m.find()){
            for (int i=0; i<=m.groupCount(); i++){
                System.out.print("["+m.group(i)+"]");
            }
            System.out.println();
        }
        /**
         * Шаблон регулярного выражения содержит несколько подвыражений, заключенных в фигурные скобки
         * Эти выражения состоят из произвольного количества сволов, не являющихся пропусками(\S+)
         * за которыми следуют произвольное количество символов-пропусков(\s+)
         * Группы предпназначены для хранения трех последних слов в каждой строке текста,
         * конец которой обозначается знаком $.
         * Задача решается при помощи флага шаблона (?m) в качестве последовательности
         */
    }
}
