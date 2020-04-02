package typeInformations.question26;

public class Play {
    public static void main(String[] args) {
        Instrument[] orchestr=new Instrument[]{new Guitar("гитара"), new Dudca("дудка"), new Suks("саксофон"), new Skripka("трамбон")};

        for (Instrument instr:orchestr) {
            instr.unCover();
            instr.tune();
            instr.convenientToInstall();
            if (instr instanceof Wind){
                ((Wind)instr).clearMoushepiece();
            }
        }


    }
}
