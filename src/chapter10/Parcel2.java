package chapter10;

//Возврат ссылки на внутренний класс
public class Parcel2 {
    class Content{
        private int i=11;
        public int value(){return i;}
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label=whereTo;
        }
        String readLabel(){return label;}
    }

    public Destination to(String s){
        return new Destination(s);
    }
    public Content content(){
        return new Content();
    }

    public void ship(String dest){
        Content c=content();
        Destination d=to(dest);
        d.readLabel();
    }

    public static void main(String[] args) {
        Parcel2 p=new Parcel2();
        p.ship("Танзания");

        //Определение ссылок на внутренние классы
        Parcel2 p2=new Parcel2();
        Parcel2.Content c=p2.content();
        Parcel2.Destination d=p2.to("Папуа Новая-Гвинея");
    }
}
