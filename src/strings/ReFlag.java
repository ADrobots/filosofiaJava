package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReFlag {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("^java",Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m=p.matcher("java has regex\nJava has regex\nJAVA has pretty good regular expressions are in Java");

        while (m.find()){
            System.out.println(m.group());
        }
    }
}
/**
 * метод group() возвращает только совпавшую часть
 * шалон совпадает в строках, начинающихся с префиксов "java", "Java", "JAVA",
 * т.к. имеется флаг Pattern.CASE_INSENSITIVE, который допускает совпадение при любом регистре
 */
