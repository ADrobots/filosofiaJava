/**
 * напишите программу которая определяет, является ли массив char примитимвным типм
 * или "настоящим" объектом.
 */
package typeInformations.question10;
class Primer{}

public class Question10 {
    public static void main(String[] args) {
        Character [] characters={'1','2'};
        System.out.println(characters instanceof Object);
        Character character='b';
        System.out.println(character instanceof Object);

        //вариант из книги
        char[] chars=new char[3];
        System.out.println("chars[] have superclass "+characters.getClass().getSuperclass());
        System.out.println("chars[] inctanceof Object: "+chars instanceof Object);
    }
}
