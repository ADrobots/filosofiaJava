/**
 * Создайте класс с полями int, long, float, double.
 * Создайте для этого класса метод toString, использующий
 * String.format, и продемонстрируйте что класс работает правильно
 */
package strings.question6;

public class Question6 {

    private int i;
    private long l;
    private float f;
    private double d;

    public Question6(int i,long l, float f, double d){
        this.i=i;
        this.l=l;
        this.f=f;
        this.d=d;
    }

    @Override
    public String toString() {
        return String.format(
                "i=%d\nl=%d\nf=%f\nd=%f",i,l,f,d);
    }

    public static void main(String[] args) {
        Question6 q=new Question6(1,22,3.3f,4.4);
        System.out.println(q);
    }
}
