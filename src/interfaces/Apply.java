package interfaces;

import java.util.Arrays;

class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){return input;}
}

class Upcase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class Downcase extends Processor{
    String process(Object i){
        return ((String)i).toLowerCase();
    }
}

class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply {

    public static void process(Processor p, Object input){
        System.out.println("Используем Processor "+p.name());
        System.out.println(p.process(input));
    }

    public static String s="Disagrement with belief is by definititon incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(),s );

        //Решение при котором поведение метода изменяется в зависимости о переданного
        //объекта объекта-аргумента называется паттерном "Стратегия"
        //Метод содержит фиксированную часть алгоритма, а объект стратегии - переменнаую часть
        //Объект стратегии - это передаваемый объек которвый содержит
        //выполняемый код

        //Processor является объектом стратегии, а в методе main три разные
        //стратегии, применяемые к String s
    }
}
