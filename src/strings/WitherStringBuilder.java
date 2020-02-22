package strings;

import java.util.Arrays;

public class WitherStringBuilder {
    public String implicit(String[] fields){
        //implicit - неявный
        String result="";
        for (int i=0; i<fields.length; i++){
            result+=fields[i];
        }
        return result;
    }

    public String explicit(String[] fields){
        //explici - явный
        StringBuilder result=new StringBuilder();
        for (int i=0; i<fields.length; i++){
            result.append(fields[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        WitherStringBuilder one=new WitherStringBuilder();
        String[] arr={"one", "two", "three"};
        one.implicit(arr);
        one.explicit(arr);
    }

    /**
     * public java.lang.String implicit(java.lang.String[]);
     *     Code:
     *        0: ldc           #2                  // String
     *        2: astore_2
     *        3: iconst_0
     *        4: istore_3
     *        5: iload_3
     *        6: aload_1
     *        7: arraylength
     *        8: if_icmpge     38
     *       11: new           #3                  // class java/lang/StringBuilder
     *       14: dup
     *       15: invokespecial #4                  // Method java/lang/StringBuilder."<init>"
     * :()V
     *       18: aload_2
     *       19: invokevirtual #5                  // Method java/lang/StringBuilder.append:(
     * Ljava/lang/String;)Ljava/lang/StringBuilder;
     *       22: aload_1
     *       23: iload_3
     *       24: aaload
     *       25: invokevirtual #5                  // Method java/lang/StringBuilder.append:(
     * Ljava/lang/String;)Ljava/lang/StringBuilder;
     *       28: invokevirtual #6                  // Method java/lang/StringBuilder.toString
     * :()Ljava/lang/String;
     *       31: astore_2
     *       32: iinc          3, 1
     *       35: goto          5
     *       38: aload_2
     *       39: areturn
     *
     *       Строки 8 и 25 образуют цикл. В строке 8 выполняется целочеисленная операция
     *       сравнения "больше или равно" с операндами в стеке, а при завершении цикла происходит переход
     *       к строке 38. Строка 35 содержит команду перехода к началу цикла 5.
     *       Конструирование StringBuelder выполняется внутри цикла, т.е. StringBuilder
     *       создается при каждом прохождении цикла
     */

    /**
     * public java.lang.String explicit(java.lang.String[]);
     *     Code:
     *        0: new           #3                  // class java/lang/StringBuilder
     *        3: dup
     *        4: invokespecial #4                  // Method java/lang/StringBuilder."<init>"
     * :()V
     *        7: astore_2
     *        8: iconst_0
     *        9: istore_3
     *       10: iload_3
     *       11: aload_1
     *       12: arraylength
     *       13: if_icmpge     30
     *       16: aload_2
     *       17: aload_1
     *       18: iload_3
     *       19: aaload
     *       20: invokevirtual #5                  // Method java/lang/StringBuilder.append:(
     * Ljava/lang/String;)Ljava/lang/StringBuilder;
     *       23: pop
     *       24: iinc          3, 1
     *       27: goto          10
     *       30: aload_2
     *       31: invokevirtual #6                  // Method java/lang/StringBuilder.toString
     * :()Ljava/lang/String;
     *       34: areturn
     *
     *       Цикл не только стал короче и проще, но и метод создает только один
     *       объект StringBuilder. Явное создание StringBuilder позволяет заранее
     *       выделить объект нужного размера, чтобы избеэать многократных повторных
     *       выделений памяти для буфера.
     */
}
