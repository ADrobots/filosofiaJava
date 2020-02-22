package interfaces;

import java.util.Arrays;

interface Processor1{
    String name();
    Object process(Object input);
}

class Apply1 {
    public static void process(Processor1 p, Object s){
        System.out.println("Using processor "+p.name());
        System.out.println(p.process(s));
    }
}

public abstract class StringProcessor implements Processor1{
    public String name(){
        return getClass().getSimpleName();
    }
    public abstract String process(Object input);
    public static String s="If she weight as a duck, she's made of wood";


    public static void main(String[] args) {
        Apply1.process(new Upcase1(),s);
        Apply1.process(new Downcase1(), s);
        Apply1.process(new Splitter1(),s );
    }
}


class Upcase1 extends StringProcessor{

    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class Downcase1 extends StringProcessor{
    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter1 extends StringProcessor{
    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}