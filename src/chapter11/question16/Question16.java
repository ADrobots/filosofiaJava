package chapter11.question16;

import chapter11.net.mindview.util.TextFile;

import java.io.*;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import java.io.*;
import java.util.*;

public class Question16 {
    static void vowesCount(Set<String> st) {
        Set<Character> vowes = new TreeSet<Character>();
        Collections.addAll(vowes, 'a', 'o', 'y', 'e', 'u', 'i');

        int allVowes = 0;
        for (String s : st) {
            int count = 0;
            for (Character c : s.toCharArray()) {
                if (vowes.contains(c)) {
                    count++;
                    allVowes++;
                }
            }
            System.out.println(s + ": " + count);
        }
        System.out.println("Total vowes: " + allVowes);
    }

    public static void main(String[] args) {
        Set<String> vowes_letter_set = new TreeSet<String>(new TextFile("src\\chapter11\\question16\\vowes.txt", "\\W+"));
        System.out.println(vowes_letter_set);
        vowesCount(vowes_letter_set);


    }
}
