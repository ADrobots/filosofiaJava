/**
 * Блок закомментированного текста в начале программы извлекается и обрабатывается
 * с применением регулярных выражений, после чего результат образует входные данные
 * для оставшейся части примера
 */
package strings;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*!
Here's a block of text to use as input to
the regular  expression matches. Not that we'll
first extract the block of text by looking for
the special delimiters? then process the
extracted blocko.
!*/
public class TheReplacements {
    public static void main(String[] args) throws Exception{
        String s= TextFile.read("C:\\Users\\tony\\IdeaProjects\\filosofiajava\\src\\strings\\TheReplacements.java");
        //Поиск блока текста, заключенного в специальные комментарии:
        Matcher mInput= Pattern.compile("/\\*!(.*)!\\*/",Pattern.DOTALL).matcher(s);
        //Pattern.DOTAL - в этом режиме метасимвол "." точка совпадает с любым символом.
        //Включая символ завершения строки

        if (mInput.find()){
            //Совпадение выражения в круглых скобках
            s=mInput.group(1);
            //Два и более пробела заменяются одним пробелом
            s=s.replaceAll(" {2,}", " ");
            //Один и более пробелов в начале строки заменяются пустой строкой.
            //Для выполнения должен быть активен режим MULTILINE
            //Pattern.MULTILINE - по умолчанию эти выражения совпадают только в начале и в конце всей
            //входной строки
            s=s.replaceAll("(?m)^ +","");
            System.out.println(s);
            s=s.replaceFirst("[eyuioa]","(VOWELS1");
            StringBuffer sbus=new StringBuffer();
            Pattern p=Pattern.compile("[eyuioa]");
            Matcher m=p.matcher(s);
            //Обработка информации find  при выполнении замены:
            while (m.find()){
                m.appendReplacement(sbus, m.group().toUpperCase());
            }
            System.out.println(sbus);
            m.appendTail(sbus);
            System.out.println(sbus);
        }
    }
}
/**
 * Класс TextFile читает файл статическим методом read() и возвращает содиржимое
 * в виде String.
 * Перменная mInput хранит текст совпадения между /*! и !*\/
 * Методом replaceAll() сокращаются множественные пробелы до одного пробела,
 * а так же пробел в начале строки, которые являются частью String
 * Метод replaceFirst() выполняет только первую найденную замену, а replaceAll()
 * все найденные замены.
 * Методы replaceAll() и replaceFirst() представляют обычные литералы, которые
 * не дают возможность выполнить какую-либо дополнительную обработку при каждой
 * замене они не помогут.
 * Метод appendReplace() позволяет задать код, выполняемый при замене.(при построении
 * буффера sbus выбираются и обрабатываются данные group(), преобразованные в верхний
 * регистр)
 * Все замены выполняются одна за одной(m.find()) после чего вызывается метод
 * appendTail(), чтобы поместить остаток в sbus
 *
 * */
