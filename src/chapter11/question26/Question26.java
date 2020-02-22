package chapter11.question26;

import chapter11.question25.Question25;
import net.mindview.util.TextFile;
//import org.omg.CORBA.INTERNAL;

import java.util.*;

public class Question26 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> words=new HashMap<>();

        List<String> list=new ArrayList<>(new TextFile("src//chapter11//question25//words.txt","\\W+"));
        System.out.println("List: "+list);

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
        System.out.println("Words: "+words);

        //1й вариант(не рабочий)
        /*Map<String, Integer> newWords=new LinkedHashMap<>();
        int count=0;
        for (int i=0; i<list.size(); i++){
            for (String s:words.keySet()) {

                if (s.contains(list.get(i))){
                    ArrayList<Integer> l=new ArrayList<Integer>(words.get(s));
                    if (newWords.containsKey(s)){
                        newWords.put(s+i,l.get(++count));

                    }
                    newWords.put(s,l.get(0));
                }
            }
        }*/

        //2й вариант
        /*ArrayList<Integer> arr=words.get(0);
        System.out.println(arr);
        System.out.println(words.get("Eliot"));*/
        Map<Integer, String> newWords1=new HashMap<>();


            //получение ключа
            for (String s:words.keySet()) {
                ArrayList<Integer> arr1=words.get(s);
                /*System.out.println(arr1);*/
                for (int j=0; j<arr1.size();j++){
                    newWords1.put(arr1.get(j),s);
                }
            }

        System.out.println(newWords1);




    }

}
