/**
 * Измените пример StartEnd чтобы он использовал входные данныеэ
 * Groups.POEM, но при этом выдавал положительные результаты
 * для find(), lookingAt() и matches()
 */
package strings.question13;

import strings.Groups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question13 {
    public static String input= Groups.POEM;

    private static class Display{
        private boolean regexPrinted=false;
        private String regex;
        Display(String regex){
            this.regex=regex;
        }

        void display(String message){
            if (!regexPrinted){
                System.out.println(regex);
                regexPrinted=true;
            }
            System.out.println(message);
        }
    }

    static  void examine(String s, String regex){
        //examine - исследовать
        Display d=new Display(regex);
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s);
        while(m.find()) {
            d.display("find() '" + m.group() + "' start= " + m.start() + " end= " + m.end());
        }
        if (m.lookingAt()) {
                d.display("lookingAt() start= " + m.start() + " end= " + m.end());
         }
         if (m.matches()) {
             d.display("matches() start=" + m.start() + " end=" + m.end());
         }
    }

    public static void main(String[] args) {
        for (String in:input.split("\n")) {
            System.out.println("input: "+in);
            for (String regex:new String[]{"\\w*are\\w*", "A\\w*", "T\\w+", "Did.*?."}) {
                    //w - метасимвол обозначающий числовой, строковый символы и знак подчеркивания
                    //* - любое количество экземпляров элемента
                    //+ - один или несколько экземпляров предшествующих элементов
                    //. - сокращенная запись людого символа, совпадающего с любым символом
                    //? - означает что предшествующий ему символ является необязательным

                examine(in, regex);
            }
        }
    }

}
/**
 * find() находит совпадение регулярного выражения в любой позиции входных данных
 * lookingAt() и matches() совпадает только в том случае если регулярное выражение
 * совпадает от самого начала входных данныех.
 * Для matches() совпадение успешно если в выражении совпадают все входные данные
 * Для lookingAt() достаточно совпадения только в начальной части входных данных
 */
