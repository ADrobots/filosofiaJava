package strings;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {
        String input="This!!unusual use!!of explamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 2)));

    }
}
/**
 * вторая форма сплит ограничивает количество выполняемых разбиений
 */
