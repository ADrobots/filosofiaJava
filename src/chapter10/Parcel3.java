package chapter10;

public class Parcel3 {
    class Content{
        private int i=3;
        public int values(){return i;}
    }
    class Destination{
        private String label;
        Destination(String des){
            label=des;
        }
        String readLable(){
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 p3=new Parcel3();
        Parcel3.Content c=p3.new Content();
        Parcel3.Destination d=p3.new Destination("Нью-Йорк");
    }
}
