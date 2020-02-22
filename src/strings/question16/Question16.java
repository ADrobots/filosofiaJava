/**
 * Измените пример JGrep.java так, чтобы в его аргументе ему можно было передать имя каталога или файла,
 * при передаче каталога в поиск должны включаться все файлы, находящиеся в указанном каталоге).
 * Подсказка: Список имен файлов можно построить командой
 *          File[] files=new File(".").listFiles();
 */
package strings.question16;

import net.mindview.util.TextFile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question16 {
    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

        File[] files=new File(args[0]).listFiles();
        for (File s:files) {
            System.out.println(s);
        }

        int flag=0;
        if(args[2].equals("Pattern.CASE_INSENSITIVE")) flag=Pattern.CASE_INSENSITIVE;
        if(args[2].equals("Pattern.DOTALL")) flag=Pattern.DOTALL;
        if(args[2].equals("Pattern.MULTILINE")) flag=Pattern.MULTILINE;
        if(args[2].equals("Pattern.COMMENTS")) flag=Pattern.COMMENTS;


        Pattern p = Pattern.compile(args[1], flag);



        for(int i=0; i<=files.length; i++) {
            int index = 0;
            Matcher m = p.matcher("");
            /*Matcher m=Pattern.compile(p.toString()).matcher("");*/
            for (String line : new TextFile(files[i].toString())) {
                m.reset(line);
                while (m.find()) {
                    System.out.println(index++ + ": " + m.group() + ": " + m.start());
                }
            }
            System.out.println("============");
        }

    }
}

