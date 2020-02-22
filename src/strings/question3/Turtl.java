package strings.question3;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtl {
    private String name;
    private Formatter f;

    public Turtl(String name, Formatter f){
        this.name=name;
        this.f=f;
    }

    public void move(int x, int y){
        f.format("%s the Turtl is at (%d,%d)\n",name,x,y);
    }

    public static void main(String[] args) {
        PrintStream outAlias=System.err;
        Turtl tommy=new Turtl("Tommy", new Formatter(System.err));
        Turtl terry=new Turtl("Terry", new Formatter(outAlias));

        tommy.move(0,0);
        terry.move(4,8);
        tommy.move(1,1);
        terry.move(5,9);
    }
}

/**
 * здесь используется новый форматный спецификатор %s обозначающий
 * аргумент String. Это простейший форматный спецификатор, который
 * определяет только тип преобразования.
 *      Вывод относящийся к объекту tommy направляется в System.out
 *      а вывод объекта terrry отправляется в синоним System.out
 *      Перегруженные версии конструктора получают разные варианты
 *      выходных потоков, самыми полезными являются PrintStream, OutStream и file.
 */
