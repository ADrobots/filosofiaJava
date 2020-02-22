package chapter11.question24;

import java.util.*;

public class Question24 {
    public static void main(String[] args) {
        /*//1й вариант
        //Создание Map для хранениея
        Map<String, String> karta=new LinkedHashMap<String, String>();

        //Заполняем коллекцию Map
        karta.put("2","Odin");
        karta.put("3","Two");
        karta.put("1","Three");
        System.out.println("karta: "+karta);

        //Сортируем коллекцию Map по ключу
        List<String> sortKey=new ArrayList<String>(karta.keySet());
        System.out.println("До сортировки: "+sortKey);
        Collections.sort(sortKey);
        System.out.println("После сортировки: "+sortKey);

        //Вставляем в коллекцию Map объекты в отсортированном по ключу значению
        Map<String, String> kartaSort=new LinkedHashMap<String, String>();
        for (String s:sortKey) {
            kartaSort.put(s,karta.get(s));
        }
        System.out.println("Втсавка в kartaSort в отсортированном виде: "+kartaSort);
        karta.clear();
        System.out.println("Отчистили karta: "+karta);
        karta=new LinkedHashMap<>(kartaSort);
        System.out.println("Вставили в karta из kartaSort: "+karta);*/

        //2 вариант
        Map<String, String> karta=new LinkedHashMap<String, String>();
        karta.put("6","Six");
        karta.put("2","Two");
        karta.put("4","Four");
        karta.put("1","One");
        karta.put("3", "Three");
        karta.put("5","Five");
        System.out.println("Первоначальная karta: "+karta);

        Set<String> key=new TreeSet<>(karta.keySet());
        System.out.println("Отсортированные ключи key: "+key);

        for (String s:key) {
            String res=s;
            String resValue=karta.get(s);
            karta.remove(s);
            karta.put(res, resValue);
        }
        System.out.println("Отсортированная karta: "+karta);


    }

    
}
