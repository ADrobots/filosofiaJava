package strings;

import java.util.Formatter;

public class Receipt {
    //Receipt - чек
    private double total=0;
    private Formatter f=new Formatter(System.out);

    public void printTitle(){
        f.format("%-15s %5s %10s\n","Item","Qty","Price");
        f.format("%-15s %5s %10s\n","----","---","-----");
    }

    public void printTotal(String name, int qty, double price){
        f.format("%-15.15s %5s %10.2f\n",name,qty,price);
        total+=price;
    }

    public void printTotal(){
        f.format("%-15.15s %5s %10.2f\n","Tax","", total*0.06);
        f.format("%-15.15s %5s %10s\n","","","-----");
        f.format("%-15.15s %5s %10.2f\n","Total","", total*1.06);
    }

    public static void main(String[] args) {
        Receipt receipt=new Receipt();
        receipt.printTitle();
        receipt.printTotal("Butter",10,6.22);
        receipt.printTotal("Sandwichas with milk",2,2.37);
        receipt.printTotal();

    }
}
