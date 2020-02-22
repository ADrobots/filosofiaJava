package chapter11.question27;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Command {

    public String str;
    public void operation(){
        System.out.print(str+" ");
    }
}

class AddComand {

    //Первый вариант
    /*public static Queue<Command> addComand(Queue commands) {
        for (int i = 0; i < 10; i++) {
            Command com = new Command();
            com.str = "Command # " + i;
            commands.add(com);

        }
        return commands;
    }*/

    //Вариант из книги
    public static Queue<Command> addComand(){
        Queue<Command> commands=new LinkedList<>();
        for (int i=0; i<10; i++){
            Command c=new Command();
            c.str="Command #"+i;
            commands.offer(c);
        }

        return commands;
    }
}

public class MainClass{
    //Вариант из книги
    public static void commandEater(Queue<Command> qc){
        while (qc.peek()!=null){
            qc.poll().operation();
        }
    }

    public static void main(String[] args) {
        //Первый вариант
        /*Queue<Command> commands=new LinkedList<Command>();
        AddComand o=new AddComand();
        o.addComand(commands);
        for (Command c:commands) {
            c.operation();
        }*/

        //Вариант из книги
        AddComand addComand=new AddComand();
        commandEater(addComand.addComand());


    }
}
