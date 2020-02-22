package strings;

public class Concatenation {
    public static void main(String[] args) {
        String mango="mango";
        String s="abs"+mango+"def"+47;
        System.out.println(s);
    }
}
/**
 * Объект String "abc" может содержать метод append(), который
 * создает новый объект String из подстроки "abc", объединенный с
 * содержимым mango. Полученный объект String создает новый объект
 * к которому добавляется подстрока "def"
 */
