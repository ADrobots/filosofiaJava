package strings;

import java.math.BigInteger;
import java.util.Formatter;

public class Conversion {
    public static void main(String[] args) {
        Formatter f=new Formatter(System.out);

        char u='a';
        System.out.println("u='a'");
        f.format("s: %s\n",u);
        //f.format("d: %d\n",u);
        f.format("c: %c\n",u);
        f.format("b: %b\n",u);
        //f.format("f: %f\n",u);
        //f.format("e: %e\n",u);
        //f.format("x: %x\n",u);
        f.format("h: %h\n\n",u);

        int v=121;
        System.out.println("v=121");
        f.format("d: %d\n",v);
        f.format("c: %c\n",v);
        f.format("b: %b\n",v);
        f.format("s: %s\n",v);
        //f.format("f: %f\n",u);
        //f.format("e: %e\n",u);
        f.format("x: %x\n",v);
        f.format("h: %h\n\n",v);

        BigInteger w=new BigInteger("5000000000000000000");
        System.out.println("w=new BigInteger(5000000000000000000)");
        f.format("d: %d\n",w);
        //f.format("c: %c\n",w);
        f.format("b: %b\n",w);
        f.format("s: %s\n",w);
        //f.format("f: %f\n",w);
        //f.format("e: %e\n",w);
        f.format("x: %x\n",w);
        f.format("h: %h\n\n",w);

        double x=192.543;
        System.out.println("x=192.543");
        //f.format("d %d\n",x);
        //f.format("c %c\n",x);
        f.format("b %b\n",x);
        f.format("s %s\n",x);
        f.format("f %f\n",x);
        f.format("e %e\n",x);
        //f.format("x %x\n",x);
        f.format("h %h\n\n",x);

        Conversion c=new Conversion();
        System.out.println("c=new Conversion()");
        //f.format("d %d\n",c);
        //f.format("c %c\n",c);
        f.format("b %b\n",c);
        f.format("s %s\n",c);
        //f.format("f %f\n",c);
        //f.format("e %e\n",c);
        //f.format("x %x\n",c);
        f.format("h: %h\n\n",c);

        boolean z=false;
        //f.format("d: %d\n",z);
        //f.format("c: %c\n",z);
        f.format("b: %b\n",z);
        f.format("s: %s\n",z);
        //f.format("f: %f\n",z);
        //f.format("e: %e\n",z);
        //f.format("x: %x\n",z);
        f.format("h: %h\n\n",z);

    }
}
/**
 * в закомментированных строках приведены преобразования,
 * недействительные для данного типа, попытка выполнения возбуждает
 * исключение
 * Преобразование b работает для всех переменных, даже для 0 - которое
 * равно true.
 */
