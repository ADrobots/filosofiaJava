/*
Исключения в конструкторах
 */
package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
    private BufferedReader in;

    //Конструктор получает строковй аргумент, содержащий имя файла
    //В блоке try создаем экземпляр класса FileReader для этого файла.
    public InputFile(String frame) throws Exception{

        //Если вызов проходит неудажно возбуждается исключение FileNotFoundException
        try{
            in=new BufferedReader(new FileReader(frame));
            //Остальной код, способный возбуждать исключения
        }catch (FileNotFoundException e){
            System.out.println("Could not open "+frame);

            //так как файл не открылся, закрывать его не нужно
            throw e;
        }catch (Exception e){
            //при лругих исключениях необходимо закрыть файл
            try {
                //метод close так же может возбудить исключение, поэтому попытка предпринимается
                //в новом блоке try
                in.close();
            }catch (IOException e2){
                System.out.println("ошибка при выполнении in.close()");
            }
            throw e;
        }finally {
            //Здесь файл не закрывается
        }
    }

    //Метод возвращает объект string, содержащий очередную строку из файла.
    //Вызывается метод readline, который возбуждает исключение. Исключения перехватываются
    //хотя сам метод getLine не возбуждает исключений
    public String getLine(){
        String s;
        try {
            s=in.readLine();
        }catch (IOException e){
            throw new RuntimeException("Ошибка при выполнении readLine()");
        }
        return s;
    }

    //метод вызывается пользователем, когда InputFile становится не нежным.
    //размещения метода в finally нет смысла, так как нет гарантии что метод будет
    //вызван.
    public void dispose(){
        try {
            in.close();
            System.out.println("dispose() успешен");
        }catch (IOException e2){
            throw new RuntimeException("ошибка при выполнении in.close()");
        }
        }
}

/**
 * next {@link exceptions.CleanUp}
 */
