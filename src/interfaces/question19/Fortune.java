package interfaces.question19;

import java.util.Random;

interface ToStartPlaying{
    String getThrow();
}
interface ToStartPlayingFactory{
    ToStartPlaying getToStartPlaying();
}

class Coin implements ToStartPlaying{

    public String[] coinSide=new String[]{"орел", "решка"};
    public String getThrow(){
        return "Сторона монеты: "+coinSide[new Random().nextInt(coinSide.length)];
    }
}
class CoinFactory implements ToStartPlayingFactory{
    public ToStartPlaying getToStartPlaying(){
        return new Coin();
    }
}

class Dice implements ToStartPlaying{
    public int[] diceOne=new int[]{1,2,3,4,5,6};
    public int[] diceTwo=new int[]{1,2,3,4,5,6};
    public String getThrow(){

        return "Первый кубик "+diceOne[new Random().nextInt(diceOne.length)]+", Второй кубик "+diceTwo[new Random().nextInt(diceTwo.length)];
    }
}
class DiceFactory implements ToStartPlayingFactory{
    public ToStartPlaying getToStartPlaying(){
        return new Dice();
    }
}

public class Fortune {
    public static void playGame(ToStartPlayingFactory games){
        ToStartPlaying tsp=games.getToStartPlaying();
        System.out.println(tsp.getThrow());
    }

    public static void main(String[] args) {
        playGame(new CoinFactory());
        playGame(new DiceFactory());



        /*Coin c1=new Coin();
        System.out.println(c1.getThrow());

        Dice d1=new Dice();
        System.out.println(d1.getThrow());*/
    }
}
