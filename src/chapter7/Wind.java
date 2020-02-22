package chapter7;
//Насследование и восходящее наследование


class Instrument{
    public void play(){}
    static  void tune(Instrument i){
        i.play();
    }
}

public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind guitare=new Wind();
        Instrument.tune(guitare);//восходящее преобразование
    }
}
