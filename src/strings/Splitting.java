package strings;

import java.util.Arrays;

public class Splitting {
    //knights - рацари
    public static String knights="Then, when you have found the shrubbery, you must" +
            "cut diwn the mighties tree in the forest... with... a herring!";

    public static void split(String regex){
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    /**
     * обратите внимание что регулярные выражения могут использоваться обычные символы
     * присутствие специальных символов не обязательно
     * @param args
     */
    public static void main(String[] args) {
        /**
         * в первом случае строка разбивается по пробелам
         */
        split(" ");
        /**
         * разбиение по символам, не являющимися символами слов
         */
        split("\\W+");
        /**
         * буква n за которой следуют символы, не являющиеся символами слов
         */
        split("n\\W+");
        split("\\w+");
    }
}

/**
 * W обозначает символ, не ялвяющийся символом слов
 * w -версия в нижнем регистре, обозначает символ слова
 */

