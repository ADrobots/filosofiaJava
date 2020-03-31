//Отмените объявление ShowMethod как public класс. Убедитесь в том что синтезированный
//конструктор пропал из результатов.

package typeInformations.question18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

class ShowMethods {


    private static String usage=
            "usage:\n"+
                    "ShowMethods qualified.class.name\n"+
                    "To show all methods in class or:\n"+
                    "ShowMethods qualified.class.name.word\n"+
                    "To search for methods involvid 'word'";

    private static Pattern p=Pattern.compile("(\\w+\\.)");

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
