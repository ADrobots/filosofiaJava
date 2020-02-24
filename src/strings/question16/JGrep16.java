//вариант из книги
package strings.question16;

import net.mindview.util.TextFile;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep16 {
    public static void main(String[] args) {
        //проверяем наличие не менее двух аргументов в командной консоли
        if(args.length<2){
            System.out.println("Use: Java Grep(file of directory)");
            //в случае менее двух аргументов выйти из программы
            System.exit(0);
        }

        //компилируем регуляного выражения, аргумент взят из консоли
        Pattern p= Pattern.compile(args[1]);
        //сравниваем взятый аргумент в котором указан файл с регулярным выражением
        Matcher d=Pattern.compile("\\w+\\.{1}\\w+").matcher(args[0]);
        //если указывается файл с расширением и
        //если совпадения есть - вывести все строки файла
        while (d.find()){
            System.out.println("file: "+args[0]);
            int index=0;
            //сравниваем полученные строки файла с регулярным выражением из из консоли, из второго аргумента
            Matcher matcher=p.matcher("");
            //получаем строки файла
            for (String line:new TextFile(args[0])) {
                //перезаписываем каждую строку, в котором есть совпадение
                matcher.reset(line);
                //и выводим в консоль
                while (matcher.find()) {
                    System.out.println(index++ + " " + matcher.group() + ": " + matcher.start());
                }
            }
        }
        //сравниваем аргумент, в котором указана корневая директория с файлами с регулярным выражением для поиска самих этих файлов
        Matcher e=Pattern.compile("^\\.{1}$").matcher(args[0]);//\w+\/$
        //если при сравнении группы найдены
        if (e.find()){
            //создать массив из файлов, находящиеся в директории
            File[] files=new File(args[0]).listFiles();
            System.out.println("root dir of files: "+ Arrays.asList(files));
            //перебрать все найденные файлы
            for (File f:files) {
                //если имена файлов совпадают с регулярным выражением
                if(f.getName().matches("\\w+\\.{1}\\w+")){
                    System.out.println(f.getName()+":");
                    int index=0;
                    Matcher m=p.matcher("");
                    //перебрать все строки из файлов
                    for (String line:new TextFile(f.getName())) {//args[0]+f.getName()
                        //переписать каждую строку, в котором есть совпадение
                        m.reset(line);
                        while (m.find()){
                            System.out.println(index++ +" "+m.group()+": "+m.start());
                        }
                    }
                }

            }
        }

        //обнулить найденные совпадения
        d.reset();
        e.reset();

        //если нет совпадений ни с корневой директорией не с конкретным фалом
        //выводим все файлы из субдиректорий
        if(!(d.find() | e.find())){
            //вывести сообщение что файлов не найдено
            if (new File(args[0]).listFiles()==null){
                System.out.println("no such directory: "+args[0]);
                //затем выйти
                System.exit(0);
            }
            //создаем массив из файлов, которые находятся в субдиректории
            File[] files=new File(args[0]).listFiles();
            System.out.println(args[0]+": subdir of files: "+Arrays.asList(files));
            //перебираем все файлы из субдиректории
            for (File f:files) {
                int index=0;
                Matcher m=p.matcher("");
                //перебираем все строки файлов, которые соответствуют регулярному выражению
                for (String line:new TextFile(args[0]+"\\"+f.getName())) {
                    m.reset(line);
                    while (m.find()){
                        System.out.println(index++ +" "+m.group()+": "+m.start());
                    }
                }
            }


        }


    }
}
