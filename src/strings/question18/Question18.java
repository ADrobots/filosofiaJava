/*Напишите программу которая читает файл с исходным кодом Java(имя файла передается в командной строке,
и выводит все строковые литералы, содержащиеся в файле*/
/**
 * вариант из книги
 * +мой вариант(не верный, но работает)
 */
package strings.question18;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question18 {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Use: -file -regexp -flag");
        }
          Pattern p=Pattern.compile("\\\".+\\\"");
          Matcher m=p.matcher("");

        for (String line:new TextFile(args[0])) {
            line=line.replaceAll(" {2,}", " ");
            line=line.replaceAll("(?m)^ +","");
            m.reset(line);

            while (m.find()){
                System.out.println(m.group());
            }
        }
    }

}

