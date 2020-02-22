package chapter11.question21;

import net.mindview.util.TextFile;

import java.util.*;

public class Question21 {
    public static void main(String[] args) {

        //Мой вариант
        //Map<String, Integer> words=new HashMap<String, Integer>(new TextFile("src\\chapter11\\SetOperations.java", "\\W+"),count++);
        /*List<String> words=new ArrayList<>(new TextFile("src\\chapter11\\SetOperations.java", "\\W+"));
        System.out.println(words);

        Map<String, Integer> wordsMap=new HashMap<String, Integer>();


        for (String s:words) {
            Integer count=wordsMap.get(s);
            wordsMap.put(s,count==null?1:count+1);
        }
        System.out.println(wordsMap);

        Set<String> sortList=new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for (String ss:wordsMap.keySet()) {
            sortList.add(ss);
        }
        System.out.println(sortList);

        Map<String, Integer> wordsSortMap=new LinkedHashMap<>();
        for (String s:sortList) {
            wordsSortMap.put(s, wordsMap.get(s));
        }
        System.out.println(wordsSortMap);*/

        //Вариант из книги
        List<String> words=new ArrayList<String>(new TextFile("src\\chapter11\\SetOperations.java", "\\W+"));
        System.out.println("Words: "+words);
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted words: "+words);

        Map<String, Integer> wordsMap=new LinkedHashMap<String, Integer>();
        for (String s:words) {
            Integer count=wordsMap.get(s);
            wordsMap.put(s,count==null?1:count+1);
        }
        System.out.println("Sorted Words and Count: "+wordsMap);


    }
}
