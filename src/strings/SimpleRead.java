package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class SimpleRead {
    public static BufferedReader input=new BufferedReader(new StringReader("Sir Robin of Camelot\n23 1.568"));

    public static void main(String[] args) {
        try {
            System.out.println("What is your name");
            String name=input.readLine();
            System.out.println(name);

            System.out.println("How old you? What is your favorite double?");
            System.out.println("(input: <age> <double>)");
            String numbers=input.readLine();
            System.out.println(numbers);

            String[] numArr=numbers.split(" ");
            int age=Integer.parseInt(numArr[0]);
            double favorite=Double.parseDouble(numArr[1]);

            System.out.format("Hi, %s.\n", name);
            System.out.format("In 5 years you will be %d\n", age+7);

            System.out.format("Your favorite double is %f\n", favorite/4);




        }catch (IOException e){
            System.err.print("i/o exception");
        }
    }
}

/**
 * StringReader - объект, который преобразует String в поток, доступный для чтения
 * объект используется для создания BufferedReader содержащего метод readLine()
 * В итоге объеки импут читается по строкам.
 * Метод readline() получает объект String для каждой строки ввода.
 * Мы бы могли этим методом обойстись если бы все данные имели одно входное значение,
 * но так как строка содержить более 2х значений приходится применять разбиение строки
 * с помощью создания массива numArr[] и метода разбиения строки split()
 */
