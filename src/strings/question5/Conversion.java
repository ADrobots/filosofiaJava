/**
 * Для каждого базового типа преобразования в примеденной
 * таблице напишите самое сложное из возможных выражений форматирования.
 * Другими словами, используйте все возможные форматные
 * спецификаторы, доступные для этого типа форматирования
 */
package strings.question5;

import java.math.BigInteger;
import java.util.Formatter;

public class Conversion {
    public static void main(String[] args) {
        Formatter f=new Formatter(System.out);

        char u='a';
        System.out.println("u='a'");
        f.format("%-2s%-2S%-2c%-2C%-5b%-5B%-3h%-3H\n\n",u,u,u,u,u,u,u,u);

        int v=121;
        System.out.println("v=121");
        f.format("%-4d%-2c%-2C%-5b%-5B%-3x%-3X%-4s%-4S%-3h%-3H\n\n",v,v,v,v,v,v,v,v,v,v,v);


        BigInteger w=new BigInteger("5000000000000000000");
        System.out.println("w=new BigInteger(5000000000000000000)");
        f.format("%-20d%-5b%-5B%-20s%-20S%-9h%-9H%-18x%-18X\n\n",w,w,w,w,w,w,w,w,w);

        double x=192.543;
        System.out.println("x=192.543");
        f.format("%-5b%-5B%-8s%-8S%-12f%-13e%-15h\n\n",x,x,x,x,x,x,x);


        Conversion c=new Conversion();
        System.out.println("c=new Conversion()");
        f.format("%-5b%-5B%-36s%-36S%-25h\n\n",c,c,c,c,c,c);

        boolean z=false;
        System.out.println("boolean z=false");
        f.format("%-6b%-6B%-6s%-6S%-4h\n\n",z,z,z,z,z);
    }
}
