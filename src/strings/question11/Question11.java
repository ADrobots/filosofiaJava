/**
 * Данный класс будет использоваться для тестирования
 * регулярных выражений. В качестве аргументов будут
 * вводиться входная строка, в которой будет осуществляться
 * поиск, за ней будут введены несколько регулярных
 * выражений, применяемых к входным данным. Программа для
 * тестирования регулярных выражений в процессе построения
 */

package strings.question11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question11 {
    public static void main(String[] args) {
        if (args.length<2){
            System.out.println("Usage\n"+" Question10 "+" characterSequence "+" regularExpression ");
            System.exit(0);
        }

        System.out.println("Input: \""+args[0]+"\"");
        for (String arg:args){
            System.out.println("Regular expression: \""+arg+"\"");
            Pattern p=Pattern.compile(arg);
            Matcher m=p.matcher(args[0]);
            if (!m.find()){
                System.out.println("no mustch found for "+"\""+arg+"\"");
                m.reset();
            }
            while (m.find()){
                System.out.println("Match \""+m.group()+"\" at positions "+m.start()+((m.end()-m.start()<2)?"":("-"+(m.end()-1))));
            }
        }

    }
}

/**
 * Первый аргумент командной строки содержит входную строку("abcabcabcdefabc")
 * в котором будет осуществляться поиск
 * Затем следует одно или нескольких регулярных выражений, применяемых к входным данным
 *
 */
