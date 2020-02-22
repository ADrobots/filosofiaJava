package chapter11.question6;

import chapter11.typeinfo.pets.*;

import java.util.*;

public class ListFeature {
    static public String name[]={"Petya", "Vasya", "Kolya", "Nikolai", "Valentin", "Anton", "Vladilen", "Vadim", "Ivan"};

    public String randomStringName() {
        Random rand=new Random();
        int n = rand.nextInt(name.length);
            return name[n];
    }
    public String[] createArrayName(int size) {
        String[] result = new String[size];
        for(int i = 0; i < size; i++)
            result[i] = randomStringName();
        return result;
    }
    public ArrayList<String> arrayList(int size) {
        ArrayList<String> result = new ArrayList<String>();
        Collections.addAll(result, createArrayName(size));
        return result;
    }



    public static void main(String[] args) {

        Random random=new Random(47);
        List<Pet> pets= Pets.arrayList(7);
        List<String> strings=new ListFeature().arrayList(7);

        System.out.println("1: "+pets);
        System.out.println("1 string: "+strings+"\n");

        Hamster h=new Hamster();
        String s=new String(new ListFeature().name[new Random().nextInt(name.length)]);
        pets.add(h);//с автоматическим изменением размера
        strings.add(s);
        System.out.println("2: "+pets);
        System.out.println("2 string: "+strings+"\n");

        System.out.println("3: "+pets.contains(h));
        System.out.println("3 string: "+strings.contains(s)+"\n");

        pets.remove(h);//удаление заданного обыекта
        strings.remove(s);

        Pet p=pets.get(2);
        String s1=strings.get(2);
        System.out.println("4: "+p+" "+pets.indexOf(p));
        System.out.println("4 string: срока "+s1+" индекс "+strings.indexOf(s1)+"\n");

        Pet cymric=new Cymric();
        String s2=new String("Vasia");
        System.out.println("5: "+pets.indexOf(cymric));
        System.out.println("5 string: "+strings.indexOf(s2)+"\n");

        System.out.println("6: "+pets.remove(cymric));
        System.out.println("6 string: "+strings.remove(s2)+"\n");

        //Удаление заданного объекта:
        System.out.println("7: "+pets.remove(p));
        System.out.println("7 string: "+strings.remove(s1)+"\n");

        System.out.println("8: "+pets);
        System.out.println("8 string: "+strings+"\n");

        pets.add(3, new Mouse());//Добавить по индексу
        strings.add(3, new String(ListFeature.name[1]));

        System.out.println("9: "+pets);
        System.out.println("9 string: "+strings+"\n");

        List<Pet> sub=pets.subList(1,4);
        List<String> subString=strings.subList(0,3);
        System.out.println("Частичный список "+sub);
        System.out.println("Частичный список "+subString+"\n");

        System.out.println("10: "+pets.containsAll(sub));
        System.out.println("10 string: "+strings.containsAll(subString)+"\n");

        Collections.sort(sub);//Сортировка на месте
        Collections.sort(subString);

        System.out.println("После сортировки "+sub);
        System.out.println("После сортировки "+subString+"\n");

        System.out.println("11: "+pets.containsAll(sub));//длч containsAll порядок не важен
        System.out.println("11 string: "+strings.containsAll(subString)+"\n");

        Collections.shuffle(sub, random);//перемешивание
        Collections.shuffle(subString, new Random());

        System.out.println("После перемешивания "+sub);
        System.out.println("После перемешивания "+subString+"\n");

        System.out.println("12: "+pets.containsAll(sub));
        System.out.println("12 string: "+strings.containsAll(subString)+"\n");

        List<Pet> copy=new ArrayList<Pet>(pets);
        List<String> copyString=new ArrayList<String>(strings);

        sub= Arrays.asList(pets.get(1), pets.get(4));
        subString=Arrays.asList(strings.get(1), strings.get(4));
        System.out.println("sub: "+sub);
        System.out.println("subString: "+subString+"\n");

        copy.retainAll(sub);
        copyString.retainAll(subString);
        System.out.println("13: "+copy);
        System.out.println("13 string: "+copyString+"\n");

        copy=new ArrayList<Pet>(pets);//Копирование
        copyString=new ArrayList<String>(strings);

        copy.remove(2);//удаление по индексу
        copyString.remove(2);

        System.out.println("14: "+copy);
        System.out.println("14 string: "+copyString+"\n");

        copy.removeAll(sub);//удаление заданных объектов
        copyString.retainAll(subString);

        System.out.println("15: "+copy);
        System.out.println("15 string: "+copyString+"\n");

        copy.set(1, new Mouse());//замена элемента
        copyString.set(1, new String("new Petya"));

        System.out.println("16: "+copy);
        System.out.println("16 string: "+copyString+"\n");


        copy.addAll(2,sub);//вставка списка в середину
        copyString.addAll(1,subString);
        System.out.println("17: "+copy);
        System.out.println("17 string: "+copyString+"\n");

        System.out.println("18: "+pets.isEmpty());
        System.out.println("18 string: "+strings.isEmpty()+"\n");

        pets.clear();//удаление всех элементов
        strings.clear();

        System.out.println("19: "+pets);
        System.out.println("19 string: "+strings+"\n");

        System.out.println("20: "+pets.isEmpty());
        System.out.println("20 string: "+strings.isEmpty()+"\n");

        pets.addAll(Pets.arrayList(4));
        strings.addAll(new ListFeature().arrayList(4));


        System.out.println("21: "+pets);
        System.out.println("21 string: "+strings+"\n");

        Object[] o=pets.toArray();
        Object[] o1=strings.toArray();

        System.out.println("22: "+o[3]);
        System.out.println("22 strring: "+o1[2]+"\n");

        Pet[] pa=pets.toArray(new Pet[0]);
        String[] str=strings.toArray(new String[0]);

        System.out.println("23: "+pa[3].id());
        System.out.println("23 string: "+str[3]);









    }
}
