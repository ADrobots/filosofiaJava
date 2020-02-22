/**
 * Измените пример {@link strings.Groups} так, чтобы в нем подсчитывались все уникальные
 * слова, не начинающиеся с прописной буквы
 */
package strings.question12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question12 {
    static public String POEM="Twas brilling, and the slithy toves\n"+
            "Did gyre and gimble in the wade.\n"+
            "All mimsy were the borogoves\n"+
            "And the mome raths outgrabe\n\n"+
            "Baware the Jabberworck, my son,\n"+
            "The jaws that bite, the claws that catch.\n"+
            "Beware the Jubjub bird, and shun\n"+
            "The frumios Bandersnatch.";

    public static void main(String[] args) {
        Matcher m= Pattern.compile("(\\b[a-z]\\S+)\\b").matcher(POEM);

        Set<String> arrSet=new LinkedHashSet<String>();

        while(m.find()){
                arrSet.add(m.group());


        }
        System.out.println("Коллекция без повторений: "+arrSet);
        System.out.println("Количество неповторяемых символов: "+arrSet.size());

    }
}
