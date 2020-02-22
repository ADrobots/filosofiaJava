package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finding {
    public static void main(String[] args) {
        Matcher m= Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");

        while (m.find()){
            System.out.print(m.group()+" ");
        }
        System.out.println();
        int i=0;
        while (m.find(i)){
            System.out.print(m.group()+" ");
            i++;
        }
    }
    /**
     * Шаблон \\w+ разбивает входные на слова.
     * Метод find() используется как итератор, перемещаясь во входной строке.
     * Версия второго метода find(int i), в который передается аргуемент, представляющий
     * позицию строки, с которой начинается поиск - эта версия сбрасывает позицию поиска
     * до значения аргумента
     */


}
