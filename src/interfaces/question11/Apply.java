package interfaces.question11;

import java.util.Arrays;

class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){return input;}
}

class Upcase extends Processor {
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class Downcase extends Processor {
    String process(Object i){
        return ((String)i).toLowerCase();
    }
}

class Splitter extends Processor {
    String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}

class Reverce{
    String process(String s){
        char[] s1=new char[s.length()];
        char[] s2=s.toCharArray();

        int j=0;
        String res="";
        for (int i=s2.length-1; i>=0; i--){

            s1[j]=s2[i];

            /*System.out.println(s1[j]);*/

            j++;
        }
        for (char x: s1) {
            /*System.out.println(x);*/
            res+=""+x;
        }

        return res;

    };
}

class ReverseAdapter extends Processor{     //применяется паттер проектирования Адаптер - вы пишите код который получает
    Reverce reverce;                         //имеющийся интерфейс и создаете тот интерфейс который вам нужен
    public ReverseAdapter(Reverce reverce){
        this.reverce=reverce;
    }
    String process(Object input){
        return reverce.process((String)input);
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
        process(new ReverseAdapter(new Reverce()),s);

        //Решение при котором поведение метода изменяется в зависимости о переданного
        //объекта объекта-аргумента называется паттерном "Стратегия"
        //Метод содержит фиксированную часть алгоритма, а объект стратегии - переменнаую часть
        //Объект стратегии - это передаваемый объек которвый содержит
        //выполняемый код

        //Processor является объектом стратегии, а в методе main три разные
        //стратегии, применяемые к String s
    }
}
