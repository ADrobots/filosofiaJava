package typeInformations.question26;

public class Strings implements Instrument {

    private String name;
    public Strings(String nameInstrument){
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
}

class Guitar extends Strings{

    public Guitar(String nameInstrument) {
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
}

class Skripka extends Strings{

    public Skripka(String nameInstrument) {
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
}