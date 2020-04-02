package typeInformations.question26;

import typeInformations.question26.musicalDevices.Moushpiece;

public class Wind implements Instrument{
    private String name;
    public Wind(String nameInstrument){
        this.name=nameInstrument;
    }

    @Override
    public void unCover() {
        System.out.println("Расчехлить "+name);
    }

    @Override
    public void tune() {
        System.out.println("Настроить "+name);
    }

    @Override
    public void convenientToInstall() {
        System.out.println("Установить "+name+" в удобное положение");

    }

    public void clearMoushepiece(){
        Moushpiece.clearSplitValve(name);
    }


}

class Dudca extends Wind{

    public Dudca(String nameInstrument) {
        super(nameInstrument);
    }

    @Override
    public void unCover() {
        super.unCover();
    }

    @Override
    public void tune() {
        super.tune();
    }

    @Override
    public void convenientToInstall() {
        super.convenientToInstall();
    }

    @Override
    public void clearMoushepiece() {
        super.clearMoushepiece();
    }
}

class Suks extends Wind{

    public Suks(String nameInstrument) {
        super(nameInstrument);
    }

    @Override
    public void unCover() {
        super.unCover();
    }

    @Override
    public void tune() {
        super.tune();
    }

    @Override
    public void convenientToInstall() {
        super.convenientToInstall();
    }

    @Override
    public void clearMoushepiece() {
        super.clearMoushepiece();
    }
}
