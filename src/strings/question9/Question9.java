/**
 * Взяв за основу документацию java.util.regex.Pattern
 * замените все гласные в Splitting.knights подчеркиваниями.
 */
package strings.question9;

import strings.Splitting;

import java.util.regex.Pattern;

public class Question9 {

    public static String s= Splitting.knights;
    public static Pattern pattern=Pattern.compile("a|o|y|e|u|i|\\+");

    public static void main(String[] args) {
        System.out.println(s);
        //мой вариант
        System.out.println(s.replaceAll(pattern.toString(), "_"));
        //вариант из книги
        System.out.println(s.replaceAll("[aeoiuyAEOIUY]","_"));
    }
}
