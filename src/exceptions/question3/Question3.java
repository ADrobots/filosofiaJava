package exceptions.question3;

public class Question3 {
    public static void main(String[] args) {
        Integer[] integers1=new Integer[5];
        for (int i=0; i<12; i++){
            try{
                integers1[i]=i;
            }catch (Exception e){
                e=new Exception(i+" больше допустимого, массива размером "+integers1.length+"\n");
                e.printStackTrace(System.out);
            }
        }
    }
}
