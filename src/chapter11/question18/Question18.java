package chapter11.question18;

import java.util.*;

public class Question18 {
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

        //сортировка по ключу(мой вариант)
        List<String> listKeySort=new ArrayList<>(list.keySet());
        Collections.sort(listKeySort);
        System.out.println(listKeySort+" - мой вариант");

        //вставка в отсортированом виде(вариант из книги
        Map<String, String> mapListSort=new LinkedHashMap<>();
        for (String s:sortList) {
            mapListSort.put(s,list.get(s));
        }
        System.out.println("Вариант из книги");
        System.out.println(mapListSort);

        //вставка в отсортированом виде(мой вариант)
        Map<String, String> listSort=new LinkedHashMap<>();
        listSort.put(listKeySort.get(0), list.get(listKeySort.get(0)));
        for (int i=0; i<list.size(); i++) {
            listSort.put(listKeySort.get(i), list.get(listKeySort.get(i)));
        }
        System.out.println("Мой вариант");
        System.out.println(listSort);

        //еще один вариант сортировки(из книги)
        Map<String, String> sort2=new TreeMap<>(list);
        System.out.println("Еще один вариант сортировки из книги");
        System.out.println(sort2);
    }
}
