package strings;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    public String toString(){
        return "InfiniteRecursion "+this;
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v=new ArrayList<InfiniteRecursion>();
        for (int i=0; i<10; i++){
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}

/**
 * При попытке создать объект InfiniteRecursion получим длинную последовательность
 * исключенией. Проблема возникает из за автоматического преобразования типов
 * для String.
 * Обратить внимание на выражение:
 * "InfiniteRecursion" + this
 * Компилятор видит объект String и оператор + и нечто, не являющееся строкой. Он
 * пытается преобразовать this в String. Для этого он вызывает метод String,
 * порождающий рекурсивный вызов.
 * Для вывода адреса объекта используется метод toString класса Object.
 * Поэтому вместо this используется выражение super.toString()
 */