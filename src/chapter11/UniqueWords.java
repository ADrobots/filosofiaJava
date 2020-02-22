package chapter11;

/**
 * Так как используем TreeSet, результат отсортирован
 * Конструктор TextFile открывает файл и рабивает его на слова припомощи регулярного
 * выражения \\W+
 */


import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words=new TreeSet<String>(new TextFile("src\\chapter11\\SetOperations.java", "\\W+"));
        //регулярное выражение:
        // + - метасимвол. Колличество символов: 2 или более
        // \W - метасимвол для поиска символов. Любой Символ кроме буквенного, цифрового или
        //знака подчеркивания

        System.out.println(words);
    }
}

/***
 * next {@link chapter11.UniqueWordsAlphabetic}
 */
