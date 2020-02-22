package strings;

public class Replasing {

    static String s=Splitting.knights+" found";

    public static void main(String[] args) {

        /**
         * Операция замены первого совпадения
         */
        System.out.println(s);
        System.out.println(s.replaceFirst("f\\w+", "located"));
            //заменяется только первое найденной совпадение

        /**
         * Операция замены всех совпадений
         */
        System.out.println(s.replaceAll("f\\w+","located"));
        System.out.println(s.replaceAll("shrubbery|tree|herring", "bsnsns"));

    }
}
