/**
 * Создайте класс, который содержит поля типов int, long, double и String
 * Создайте для этого класса конструктор который получает аргумент String,
 * сканирует полученную строку и разбирает ее по разным полям.
 * ДОбавьте метод toString и продемонстрируйте правильность работы своего класса.
 *
 */

package strings.question20;

import java.util.Scanner;

public class Question20 {
    String name;
    int age;
    double weight;
    long height;

    public Question20(String inf){
        Scanner stdin=new Scanner(inf);
        this.name=stdin.next();
        this.age=stdin.nextInt();
        this.weight=stdin.nextDouble();
        this.height=stdin.nextLong();
    }


    public String toString() {
        System.out.format("My name %s, i am %d years old, my weight %f, my height %d",name,age,weight,height);

        return null;
    }

    public static void main(String[] args) {
        Question20 q20=new Question20("Anton 30 55.4 5568");
        System.out.println(q20);
    }
}
