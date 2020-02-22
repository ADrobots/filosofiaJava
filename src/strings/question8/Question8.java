/**
 * Разбейте строку Splitting.knights по словам the или you
 */
package strings.question8;

import strings.Splitting;

import java.util.Arrays;

public class Question8 {
    static public String s= Splitting.knights;

    static void split(String regex){
        System.out.println(Arrays.toString(s.split(regex)));
    }
    public static void main(String[] args) {
        System.out.println(s);
        //вариант из книги
        split("you|the");
        //мой вариант
        split("you|the?\\w+");
    }
}
