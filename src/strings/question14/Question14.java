/**
 * Перепешите класс SplitDemo с использованием String.split()
 */
package strings.question14;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Question14 {
    public static void main(String[] args) {
        String input="This!!unusual use!!of explamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        System.out.println(Arrays.toString(input.split("!!")));
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 2)));
        System.out.println(Arrays.toString(input.split("!!",2)));

    }
}

