package strings;

import java.util.Scanner;

public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner("12, 25, 46,   89");
        scanner.useDelimiter("\\s*,\\s*");

        while (scanner.hasNextInt()){
            System.out.println(scanner.nextInt());
        }
    }
}
/**
 * В качестве разделителя используется запятая(,) окруженная произвольным количеством пропусков.
 * Такой же способ может использоваться для чтения из файлов, разделеных запятыми
 * Итого
 * useDelimiter() - метод назначающий шаблон разделитель
 * delimiter() - метод возвращает объект Pattern, служащий разделителем
 */
