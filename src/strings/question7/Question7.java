/**
 * Взяв за основу документацию java.util.regex.Pattern напишите и протестируйте регулярное
 * выражение, которое проверяемт, что предложение начинается с прописной буквы и завершается
 * точкой.
 */
package strings.question7;

import strings.Splitting;

public class Question7 {
    /*public String s= Splitting.knights;*/
    public String s="Hello, what is your name.";
    public static void main(String[] args) {
        String s="Hello what is your name!";
        System.out.println(s.matches("^[A-Z].*[.|!]$"));
        System.out.println("Hello what is your name?".matches("^[A-Z].*[.|?]$"));
    }

}
