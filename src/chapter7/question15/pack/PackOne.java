package chapter7.question15.pack;

public class PackOne {
    private String s="Hello";
    public PackOne(){
        s="Hello";
    }
    protected void pechat(String c){
        s=c;
    }
    public void pechat1(){
        System.out.println(s);
    }
}
