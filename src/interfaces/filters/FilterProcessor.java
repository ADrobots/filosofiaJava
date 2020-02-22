package interfaces.filters;

public class FilterProcessor {

    public static void main(String[] args) {
        Waveform w=new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),w);
        Apply.process(new FilterAdapter(new HightPass(1.0)),w);
        Apply.process(new FilterAdapter(new BandPass(1.0,1.0)), w);
        //Паттерн проектирования Адаптер - пишем код, который олучает имеющийся интерфейс
        //и сосзадете тот интерфейс, который нужен

    }
}
