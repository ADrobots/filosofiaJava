package exceptions.question5;

public class Question5 {
    public static Integer[] integers=new Integer[2];
    static int x=8;

    public static void main(String[] args) {
        while(true){
            try {
                integers[x]=1;
                System.out.println(integers[x]);
                break;
            } catch (Exception e){
                System.err.print("Не помещается ");
                e.printStackTrace();
                x--;

            }

        }
    }

}
