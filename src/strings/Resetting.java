package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Resetting {
    public static void main(String[] args) {
        Matcher m= Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bugs");

        while (m.find()){
            System.out.print(m.group()+" ");
        }

        System.out.println();

        m.reset("fig the rig with rags");

        while (m.find()){
            System.out.print(m.group()+" ");
        }
    }

    /**
     * вызов метода reset() без аргументов приводит Matcher в начало текущей последовательности
     */
}
