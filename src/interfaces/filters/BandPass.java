package interfaces.filters;

public class BandPass extends Filter {
    double lowCutoff,hightCutoff;
    BandPass(double lowCutoff, double hightCutoff){
        this.lowCutoff=lowCutoff;
        this.hightCutoff=hightCutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
