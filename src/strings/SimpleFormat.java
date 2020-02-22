package strings;

public class SimpleFormat {
    public static void main(String[] args) {
        int x=5;
        double y=5.323;

        //Старый способ
        System.out.println("Row 1:["+x+" "+y+"]");

        //Новый способ
        System.out.format("Row 2:[%d %f]\n",x,y);

        //или
        System.out.printf("Row 3:[%d %f]\n",x,y);

    }
}
