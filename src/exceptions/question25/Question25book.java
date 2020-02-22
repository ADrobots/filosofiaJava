package exceptions.question25;

class OneException extends Exception{}
class TwoException extends OneException{}
class ThreeException extends TwoException{}

class Aa{
    void getException() throws OneException{
        throw new OneException();
    }
}
class Bb extends Aa{
    @Override
    void getException() throws TwoException {
        throw new TwoException();
    }
}

class Cc extends Bb{
    @Override
    void getException() throws ThreeException {
        throw new ThreeException();
    }
}

public class Question25book {
    public static void main(String[] args) {
        Aa result=new Aa();

        try{
            result.getException();
        }catch (ThreeException the){
            System.out.println("ThreeException from Cc");
        }catch (TwoException te){
            System.out.println("TwoException from Bb");
        }catch (OneException oe){
            System.out.println("OneException from Aa");
        }
    }
}
