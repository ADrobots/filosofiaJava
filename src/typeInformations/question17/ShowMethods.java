//Измените регулярное выражение в программе так, чтобы оно выделяло ключевые
//слова final и native(используйте опреатор или - |
package typeInformations.question17;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
    private static String usage=
            "usage:\n"+
                    "ShowMethods qualified.class.name\n"+
                    "To show all methods in class or:\n"+
                    "ShowMethods qualified.class.name.word\n"+
                    "To search for methods involvid 'word'";

    private static Pattern p=Pattern.compile("(\\w+\\.)|\\s*final|\\s*native");

    public void testMethodWithoutArgs(){}

    public String testMethodwithArgs(String arg){
        return arg;
    }

    public static void main(String[] args) {

        //выводит описание, если нет аргументов
        if (args.length<1){
            System.out.println(usage);
            System.exit(0);
        }

        int line=0;
        try {
            Class<?> c=Class.forName(args[0]);
            Method[] methods=c.getMethods();
            Constructor[] constructors=c.getConstructors();

            if (args.length==1){
                for (Method meth:methods) {
                    System.out.println(p.matcher(meth.toString()).replaceAll(""));
                }
                for (Constructor constr: constructors) {
                    System.out.println(p.matcher(constr.toString()).replaceAll(""));
                }
                line=methods.length+constructors.length;

            }else {
                for (Method meth:methods) {
                    if (meth.toString().indexOf(args[1])!=-1){
                        System.out.println(p.matcher(meth.toString()).replaceAll(""));
                    line++;
                    }
                }
                for (Constructor constr:constructors){
                    if (constr.toString().indexOf(args[1])!=-1){
                        System.out.println(p.matcher(p.matcher(constr.toString()).replaceAll("")));
                    line++;
                    }
                }

            }


        }catch (ClassNotFoundException e){
            System.out.println("no such class"+e);
        }


    }
}
/**
 * Методы Class getMethods() и getConstructors() возвращают массивы объектов Method
 * и Constructor.
 * В каждом классе есть методы, позволяющие извлечь и проанализировать имена,
 * аргументы, возвращаемые значения и т.д. В данном примере используем только метод toString()
 * для вывода полного имени метода.
 * Остальной код в примере разбирает командную строку и определяет, соответствует лии
 * определенное выражение образцу для поиска(с использованием indexOf). После выделяет
 * описатели имен классав с использованием регулярных выражений.
 *
 * Результат возращаемый методом Class.forName не известен на стадии компиляции,
 * поэтому вся информация сигнатру метода извлекается во время выполнения.
 *
 * Результат будет получен при запуске в программе командой
 * java ShowMethods ShowMethods
 *
 * В результате содержится public конструктор по умолчанию. Хотя конструктор не был
 * определен, он был синтезирован компилятором. Синтезированй конструктор имеет
 * тот же уровень доступа что и его класс.
 */
