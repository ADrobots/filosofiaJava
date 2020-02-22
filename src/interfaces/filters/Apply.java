package interfaces.filters;

public class Apply {
    public static void process(FilterAdapter r, Object s){
        System.out.println(r.name());
        System.out.println(r.process((Waveform) s));
    }
    public static String s= "Disagrement with belief is by definition incorrect";

}
