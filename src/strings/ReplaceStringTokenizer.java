package strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReplaceStringTokenizer {
    public static void main(String[] args) {
        String input="But i'am not dead yet. I feel happy.";
        StringTokenizer stringTokenizer=new StringTokenizer(input);

        while(stringTokenizer.hasMoreElements()){
            System.out.print(stringTokenizer.nextToken()+" ");
        }
        System.out.println("================================");

        System.out.print(Arrays.toString(input.split(" ")));
        System.out.println("================================");

        Scanner scanner=new Scanner(input);
        while (scanner.hasNext()){
            System.out.print(scanner.next()+" ");
        }
    }
}
/**
 * при использовании Класса Scanner можно разбивать строку по более сложным шаблонам
 */
