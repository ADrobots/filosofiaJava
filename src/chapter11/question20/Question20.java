package chapter11.question20;

import chapter11.net.mindview.util.TextFile;

import java.util.*;

public class Question20 {
    static void vowesCount(Set<String> st) {
        Set<Character> vowes = new TreeSet<Character>();
        Collections.addAll(vowes, 'a', 'o', 'y', 'e', 'u', 'i');

        Map<Character, Integer> vowes1=new TreeMap<Character, Integer>();

        int allVowes = 0;
        for (String s : st) {
            for (Character c : s.toCharArray()) {
                if (vowes.contains(c)) {
                        Integer count=vowes1.get(c);
                        vowes1.put(c, count==null? 1 : count+1);
                    allVowes++;
                    }

                }
            }
        System.out.println("Vowels: "+vowes1);
        System.out.println("Total vowes: " + allVowes);
    }

    public static void main(String[] args) {
        Set<String> vowes_letter_set = new TreeSet<String>(new TextFile("src\\chapter11\\question16\\vowes.txt", "\\W+"));
        System.out.println(vowes_letter_set);
        vowesCount(vowes_letter_set);


    }
}
