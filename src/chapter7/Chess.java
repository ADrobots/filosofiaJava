package chapter7;

class Game{
    Game(int i){
        System.out.println("Конструктор Game");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("Конструктор BordGame");
    }
}
public class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println("Конструктор Chess");
    }

    public static void main(String[] args) {
        Chess chess=new Chess();
    }
}
