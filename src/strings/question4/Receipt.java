/**
 * Измените пример Receipt так, чтобы все ширины управлялись одним набором констант.
 * Сделайта так чтобы ширину вывода можно было изменить, модифицирую одно значение в
 * одном месте
 */
package strings.question4;

import java.util.Formatter;

public class Receipt {
    //Receipt - чек
    private double total=0;
    private Formatter f=new Formatter(System.out);
    private final int res1=15;
    private final int res2=5;
    private final int res3=10;

    private final String row1="%-"+res1+"s %"+res2+"s %"+res3+"s\n";
    private final String row2="%-"+res1+".15s %"+res2+"d %"+res3+".2f\n";
    private final String row3="%-"+res1+".15s %"+res2+"s %"+res3+".2f\n";

    public void printTitle(){

        f.format(row1,"Item","Qty","Price");
        f.format(row1,"----","---","-----");
    }

    public void printTotal(String name, int qty, double price){
        f.format(row2,name,qty,price);
        total+=price;
    }

    public void printTotal(){
        f.format(row3,"Tax","", total*0.06);
        f.format(row1,"","","-----");
        f.format(row3,"Total","", total*1.06);
    }

    public static void main(String[] args) {
        Receipt receipt=new Receipt();
        receipt.printTitle();
        receipt.printTotal("Butter",10,6.22);
        receipt.printTotal("Sandwichas with milk",2,2.37);
        receipt.printTotal();

    }
}
