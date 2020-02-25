/*
Напишите программу которая читает файл с исходным кодом Java(имя файла передается в командной строке, и выводит все комментарии, содержащиеся в файле
*/
package strings.question17;

import net.mindview.util.TextFile;
//hello

/*hello*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question17 {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Use: -file -regexp -flag");
        }
        String s=TextFile.read(args[0]);
//        Pattern p=Pattern.compile("(//\\s.+)|(/\\*\\s+.+)|(\\*\\s+.+)");
//        Pattern p=Pattern.compile("(/\\*(.*)\\*/)");
          Pattern p=Pattern.compile("(//\\s.+)|(/\\*\\s+.+)|(\\*\\s+.+)");
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

/**
 * ссылка на сайт по вариантам извлечения комментариев
 */
