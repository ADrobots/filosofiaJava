package chapter11.question15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class Question15 {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<Character>();
        char[] chars="+U+n+c---+e+r+--+a-+i-+n+t+--+ -+r+u--+l+e+s---".toCharArray();

        LinkedList<Character> linkedListChars=new LinkedList<Character>();
        for (Character c:chars) {
            linkedListChars.add(c);
        }

        for (int i=0; i<linkedListChars.size(); i++){
            switch (linkedListChars.get(i)){
                case '+':break;
                case '-':System.out.print(stack.pop());
                break;
                default:stack.push(linkedListChars.get(i));
                break;

            }
        }

        /*System.out.print(linkedListChars);*/
        /*System.out.println();

        while(!stack.empty()){
            System.out.print(stack.pop());
        }*/
    }

}
