package strings;

public class Immutable {
    public static String upcase(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q="howdy";
        //howdy - zdorovo
        System.out.println(q);
        String qq=upcase(q);
        System.out.println(q);
        System.out.println(qq);
    }
}
/**
 * при передаче q методу upcase() передается копия ссылки на q. Физически местонахождение
 * ссылки не изменяется. ССылка копируется при передаче.
 * ПОлученная ссылка s в upcase() существует во время выполнения. После завершения
 * метода upcase() ссылка s пропадает. Метод upcase() возвращает исходную строку,
 * все символы которой преобразованы в верхний регистр(в действительности возвращает
 * ссылку на результат). Но оказывается, что возвращаемая ссылка указывает на новый объект.
 * Объект q остается в прежнем виде
 */
