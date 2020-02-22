package chapter11.question31;

public class Shapes {
    public static void main(String[] args) {
        RandomShapeGenerator rsg=new RandomShapeGenerator(20);
        for (Shape s:rsg) {
            s.draw();
        }
    }
}
