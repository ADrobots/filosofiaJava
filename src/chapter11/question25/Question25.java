package chapter11.question25;

import net.mindview.util.TextFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question25 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> words=new HashMap<>();

        List<String> list=new ArrayList<>(new TextFile("src//chapter11//question25//words.txt","\\W+"));

        for (int i=0; i<list.size(); i++){
            String s=list.get(i);
            if (!words.keySet().contains(s)){
                ArrayList<Integer> arrayList=new ArrayList<>();
                arrayList.add(0, i);
                words.put(s,arrayList);
            }else {
                words.get(s).add(i);
                words.put(s, words.get(s));
            }
        }
        System.out.println(words);


    }
}
