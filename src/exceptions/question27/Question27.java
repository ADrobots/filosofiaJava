/**
 * Измените упражнение 3 и преобразуйте искоючение в RuntimeException
 */
package exceptions.question27;

public class Question27 {
    public static void main(String[] args) {
        Integer[] integers1=new Integer[5];
        for (int i=0; i<12; i++){
            try{
                integers1[i]=i;
            }catch (Exception e){
                //мой вариант
                /*throw new RuntimeException(i+" больше допустимого, массива размером "+integers1.length+"\n");*/
                //вариант из книги
                throw new RuntimeException(e);

            }
        }
    }
}
