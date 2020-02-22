package chapter11.question7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NewClass {
    private static int id;
    private final int count=id++;
    public int id(){
        return count;
    }
    public NewClass(){
        id();
    }

    @Override
    public String toString() {
        return String.valueOf("NewClass "+count);
    }

    public static void main(String[] args) {
        NewClass[] newClassArray={new NewClass(), new NewClass(), new NewClass(), new NewClass(), new NewClass(), new NewClass(), new NewClass()};

        List<NewClass> newClassList=new ArrayList<NewClass>();
        Collections.addAll(newClassList, newClassArray);

        System.out.println("List: "+newClassList+"\n");

        List<NewClass> subNewClassList=newClassList.subList(1,4);

        System.out.println("SubList: "+subNewClassList+"\n");

        newClassList.removeAll(subNewClassList);

        System.out.println("List-SubList: "+newClassList+"\n");
    }

}
