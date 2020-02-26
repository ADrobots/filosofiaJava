package strings;

import java.util.Scanner;

public class BetterRead {
    public static void main(String[] args) {
        Scanner stdin=new Scanner(SimpleRead.input);
        System.out.println("What is your name");
        String name=stdin.nextLine();
        System.out.println(name);
        //System.out.println(stdin.nextLine());

        System.out.println("How old you? What is your favorite double?");
        int age=stdin.nextInt();
        System.out.println(age);
        //System.out.println(stdin.nextInt());

        double favorite=stdin.nextDouble();
        System.out.println(favorite);
        //System.out.println(stdin.nextDouble());

        System.out.format("Hi, %s.\n", name);
        System.out.format("In 5 years you will be %d\n", age+7);

        System.out.format("Your favorite double is %f\n", favorite/4);
    }
}

/**
 * Конструктор Scanner может получать любые входные объекты
 * (File, InputStream, String, интерфейс Readable - для описания объектов,
 * содержащего метод read, и т.д.)
 *
 * Просто метод next() возвращает String
 * остальные методы next() возвращают все примитивные типы(nextInt(), nextDouble())
 * кроме char
 *
 * таже существует метод hasNext который возвращает true,
 * если следующая входная лексема соответствует правильному типу
 */
