package chapter11.question4;

import java.util.*;

public class GeneratorClass {
    List<String> brackingBad= Arrays.asList("Уолт", "Джеси", "Скайлер", "Хэнк", "Лидия", "Густаво");

    private int i=0;
    public String next(){
            String result = brackingBad.get(i);
            i++;
            if (i==brackingBad.size())i=0;
            return result;
    }

    public Collection fill(Collection c, int n){
        for(int i=0; i<=n; i++){
            c.add(next());

        }
        return c;
    }

    public static void main(String[] args) {
        GeneratorClass gc=new GeneratorClass();
       /* Collection list=new ArrayList();
        Collection linkedList=new LinkedList();
        Map hashMap=new HashMap();
        Map linkedHashSet=new LinkedHashMap();
        Set treeSet=new TreeSet();*/

            /*list.add(gc.next());
            linkedList.add(gc.next());
            hashMap.put(i,gc.next());
            linkedHashSet.put(i,gc.next());
            treeSet.add(gc.next());
            gc.i++;*/
        System.out.println(gc.fill(new ArrayList(),10));
        System.out.println(gc.fill(new LinkedList(), 10));
        System.out.println(gc.fill(new HashSet(),10 ));
        System.out.println(gc.fill(new LinkedHashSet(), 10));
        System.out.println(gc.fill(new TreeSet(), 10));

//fill - заполнить

        /*System.out.println(list);
        System.out.println(linkedList);
        System.out.println(hashMap);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);*/

    }
}
