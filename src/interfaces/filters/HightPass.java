package interfaces.filters;

public class HightPass extends Filter {
    double cutoff;
    public HightPass(double cutoff){
        this.cutoff=cutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
