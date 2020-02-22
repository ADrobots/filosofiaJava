//Добавьте в предыдущее упражнение класс с методом dispose(). Измените класс
//FailingConstructor так, чтобы конструктор создавал один из таких объектов в
//поле класса; далее конструктор может выдвать исключение, почле чего создает второй

package exceptions.question23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class NeedsCleanup{
    private static long counter=1;
    private final long id=counter++;
    public void dispose(){
        System.out.println("NeedsCleanup "+id+" dispose");
    }
}

public class FailingConstructor22 {
    private BufferedReader in;
    NeedsCleanup nc;
    NeedsCleanup nc2;

    public FailingConstructor22(String fname) throws Exception{
        nc=new NeedsCleanup();
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
        nc2=new NeedsCleanup();
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
                fc22.nc.dispose();
                fc22.nc2.dispose();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
