/**
 * Изменить пример JGrep так чтобы его аргументы могли передать имя флага
 * (например Pattern.CASE_INSENSITIVE
 */
package strings.question15;

import net.mindview.util.TextFile;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question15 {
    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        //Мой вариант, не верный
//        Pattern p = Pattern.compile("\\b[a-z]\\w+", Pattern.CASE_INSENSITIVE);

        //Вариант верный
        int flag=0;
        if(args[2].equals("Pattern.CASE_INSENSITIVE")) flag=Pattern.CASE_INSENSITIVE;
        if(args[2].equals("Pattern.DOTALL")) flag=Pattern.DOTALL;
        if(args[2].equals("Pattern.MULTILINE")) flag=Pattern.MULTILINE;
        if(args[2].equals("Pattern.COMMENTS")) flag=Pattern.COMMENTS;


        Pattern p = Pattern.compile(args[1], flag);

        //проблема, аргумент взятый из консоли не подставляется в качестве аргумента компилированного паттерна

        int index = 0;
        Matcher m = p.matcher("");
        /*Matcher m=Pattern.compile(p.toString()).matcher("");*/
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find()) {
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
            }
        }

    }
}

