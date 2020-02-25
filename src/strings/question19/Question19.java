/*На основе двух последних упражненией напишите программу, которая анализаирует
* исходный код программы Java и выдает список всех имен классов, используемых
* в программе*/
package strings.question19;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question19 {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Usage: -file -regex -flag");
            System.exit(0);
        }
        Pattern p = Pattern.compile("[A-Z]\\w+");
        System.out.println("Classes in "+args[0]);
        //добавлено из книги
        //выводим все классы, кроме тех, что указаны в комментарии
        Pattern pp=Pattern.compile("^(//|/\\*|\\*)");
        int index = 0;
        Matcher m = p.matcher("");
        Matcher mm=pp.matcher("");
        for(String line : new TextFile(args[0])) {
            m.reset(line);
            mm.reset(line);
            while(m.find() && !mm.find())
                System.out.println(index++ + ": " + m.group());
        }
    }

}

