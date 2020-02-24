/*
    Напишите программу которая читает файл с исходным кодом Java(имя файла передается
    в командной строке, и выводит все комментарии, содержащиеся в файле
 */

package strings.question17;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question17 {
    public static void main(String[] args) {
        if(args.length<3){
            System.out.println("Use: -file -regexp -flag");
        }
        //записываем строки файла в экземпляр объекта String
        String s=TextFile.read(args[0]);
        //2 более пробела заменяем на один пробел
        s.replaceAll(" {2,}","");
        //поиск блока текста, заключенного в комментарии
        Matcher matcher= Pattern.compile(args[1]).matcher(s);
    }
}
