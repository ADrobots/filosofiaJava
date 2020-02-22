package chapter11;

/**
 * Если нужна алфавитная сортировка, то нужно передать конструктору TreeSet компактор {@link java.lang.String .CASE_INSENSITIVE_ORDER}
 * Компактор - объект, определяющий порядок.
 */
import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words=new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);

        words.addAll(new TextFile("src\\chapter11\\SetOperations.java",  "\\W+"));

        System.out.println(words);
    }


}
