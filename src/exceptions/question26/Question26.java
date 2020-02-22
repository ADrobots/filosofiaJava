package exceptions.question26;


import java.io.FileInputStream;

public class Question26 {
    public static void main(String[] args) throws Exception{
        FileInputStream in=new FileInputStream("C:\\Users\\tony\\IdeaProjects\\filosofiajava\\src\\exceptions\\1MainException.java");
        in.close();
    }
}
