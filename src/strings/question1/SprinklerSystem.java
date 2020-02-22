package strings.question1;

class WaterSource{
    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s="сконструирован";
    }
    public String toString(){return s;}
}

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source=new WaterSource();
    private int i;
    private float f;
    public String toString(){
        StringBuilder result=new StringBuilder();
        result.append("valve1 = "+valve1+" ");
        result.append("valve2 = "+valve2+" ");
        result.append("valve3 = "+valve3+" ");
        result.append("valve4 = "+valve4+"\n");
        result.append("i = "+i+" ");
        result.append("f = "+f+" ");
        result.append("sourse = "+source);

        return result.toString();
        /*return
        "valve1 = "+valve1+" "+
        "valve2 = "+valve2+" "+
        "valve3 = "+valve3+" "+
        "valve4 = "+valve4+"\n"+
        "i = "+i+" "+
        "f = "+f+" "+
        "sourse = "+source;*/
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem=new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
}
