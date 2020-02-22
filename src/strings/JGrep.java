package strings;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

        Pattern p = Pattern.compile("\\b[Ssct]\\w+");
        //проблема, аргумент взятый из консоли не подставляется в качестве аргумента компилированного паттерна
        // Перебор строк входного файла:
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find()) {
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
            }
        }

    }
}
/**
 * файл открывается как объект TextFile, который читает строки файла в ArrayLIst
 * Метод reset() используется лдя связывания Matcher()  с каждой строкой входных данных.
 * Метод find() используется для поиска в полученной строке
 *
 * Тестовый пример открывает файл JGrep для чтения входных данных и ищет слова, начиющиеся с [Ssct]
 */
