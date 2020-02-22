package interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

//реазизация интерфейса для выполенения требований метода

public class RandomWords implements  Readable {
    private static Random rand=new Random(47);
    private static final char[] capitals="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers="abcdefghijklmnopqrstuwxyz".toCharArray();
    private static final char[] vowels="aeiou".toCharArray();
    private int count;
    public RandomWords(int count){this.count=count;}
    public int read(CharBuffer charBuffer){
        if(count-- == 0){
            return -1;
        }

        charBuffer.append(capitals[rand.nextInt(capitals.length)]);
        for (int i=0; i<4; i++){
            charBuffer.append(lowers[rand.nextInt(lowers.length)]);
            charBuffer.append(vowels[rand.nextInt(vowels.length)]);
        }
            charBuffer.append(" ");
        return 10; //колличество присоединенных символов

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(new RandomWords(10));
        while(s.hasNext()) System.out.println(s.next());
    }
}
