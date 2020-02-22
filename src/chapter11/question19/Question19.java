package chapter11.question19;

import java.util.*;

public class Question19 {
    public static void main(String[] args) {
        Map<String, String> list=new HashMap<String, String>();
        list.put("Odin","One");
        list.put("Dva","Two");
        list.put("Tri","Three");
        list.put("Chetire","Thour");
        list.put("Piat","Five");
        System.out.println(list);

        //сортировка(вариант из книги)
        Set<String> sortList=new TreeSet<>(list.keySet());
        System.out.println(sortList+" - вариант из книги");

        Set<String> sortListSet=new LinkedHashSet<>(list.keySet());
        System.out.println(sortListSet+" -вариант из книги");

        //вставка в отсортированом виде(вариант из книги
        Map<String, String> mapListSort=new LinkedHashMap<>();
        for (String s:sortList) {
            mapListSort.put(s,list.get(s));
        }
        System.out.println("Вариант из книги");
        System.out.println(mapListSort);
    }
}
