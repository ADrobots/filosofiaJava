/**
 * Программа выводит двоичный массив байтов в удобочитаемом
 * шестнадцатеричном формате с использованием
 * метода String.format()
 */
package strings;

//import net.mindview.util.BinaryFile;

import java.io.File;

public class Hex {
    public static String format(byte[] data){
        StringBuilder result=new StringBuilder();
        int n=0;
        for(byte b:data){
            if(n%16==0){
                result.append(String.format("%05x: ",n));
            }
            result.append(String.format("%02x ",b));
            n++;
            if(n%16==0){
                result.append("\n");
            }
        }
        result.append("\n");
        return result.toString();
    }

//    public static void main(String[] args) throws Exception{
//        if (args.length==0){
//            System.out.println(format(BinaryFile.read("C:\\Users\\tony\\IdeaProjects\\filosofiajava\\out\\production\\filosofiajava\\strings\\Turtl.class")));
//        }else {
//            System.out.println(format(BinaryFile.read(new File(args[0]))));
//        }
//    }
}
