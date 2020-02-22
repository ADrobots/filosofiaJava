//вариант из книги
package exceptions.question24;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FailingConstructor22 {
    private BufferedReader in;

    public FailingConstructor22(String fname) throws Exception{
        try{
            in=new BufferedReader(new FileReader(fname));
        }catch (FileNotFoundException e){
            System.out.println("Не открывается файл "+fname);
        }catch (Exception e){
            try {
                in.close();
            }catch (IOException ioe){
                System.out.println("in.close(): ошибка запуска");
            }
            throw e;
        }
    }

    public String getLine(){
        String s;
        try{
            s=in.readLine();
        }catch (IOException e){
            throw new RuntimeException("readline(): ошибка запуска");
        }
        return s;
    }

    public void dispose(){
        try{
            in.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            FailingConstructor22 fc22=new FailingConstructor22("C:\\Users\\tony\\IdeaProjects\\filosofiajava\\src\\exceptions\\intro\\introduction.txt");
            try{
                String s;
                int i=1;
                while ((s=fc22.getLine())!=null){
                    System.out.println(i+" "+s);
                    i++;
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                fc22.dispose();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
