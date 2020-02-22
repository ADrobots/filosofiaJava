package strings;

import java.util.Random;

public class UsingStringBuilder {
    public static Random random=new Random(47);
    public String toString(){
        StringBuilder result=new StringBuilder("[");
        for (int i=0; i<25; i++){
            result.append(random.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length()-2,result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usb=new UsingStringBuilder();
        System.out.println(usb);
    }
}
/**
 * Если попытаемся использвать вызов вида append(a+": "+c) то компилятор снова
 * начнет создавать дополнительные объекты StringBuilder. Для выбора способа следует
 * исплользовать для проверки javap.
 */
