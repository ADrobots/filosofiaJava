//1
//2
//3
//4
/*
  123
 */
package strings.question17;
import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question17_1 {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Use: -file -regexp -flag");
        }
        String s=TextFile.read(args[0]);
        //пример взят из http://www.cyberforum.ru/java/thread1721536.html
        Matcher m=Pattern.compile("(\\/\\/.+)|(\\/\\*(.|\\s)+?\\*\\/)").matcher(s);


        if (m.find()){
            s=m.group();
            s=s.replaceAll(" {2,}"," ");
            s=s.replaceAll("(?m)^ +","");
            while (m.find()){
                System.out.println(m.group(0));
            }
        }
    }

}
/**
 *
 * 123123
 *
 */
