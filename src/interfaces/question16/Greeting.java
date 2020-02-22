package interfaces.question16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class RandomChar{
    Random random=new Random();
    public char nextChar(){
        return (char) random.nextInt(128);
    }
}

public class Greeting extends RandomChar implements Readable{

    private Random random=new Random(47);
    private char[] chars="abcdefg".toCharArray();
    int count;
    public Greeting(int count){
        this.count=count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0){return -1;}

        for (int i=0; i<4; i++) {
            cb.append(chars[random.nextInt(chars.length)]);
        }
        cb.append(" ");

        return 3;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new Greeting(3));

        while (s.hasNext()) {
            System.out.println(s.next());
        }
        RandomChar r=new RandomChar();
        System.out.println(r.nextChar());
    }
}
