package chapter11.question5;

import chapter11.typeinfo.pets.*;

import java.util.*;

public class ListFeature {

    public static List<Integer> getInteger(int size, int value){
        Random random=new Random();

         List<Integer> result=new ArrayList<Integer>();

         for (int i=0; i<size; i++){
             result.add(random.nextInt(value));
         }
         return result;
    }

    public static void main(String[] args) {
        Random random=new Random();
        List<Pet> pets=Pets.arrayList(7);

        List<Integer> integers1=ListFeature.getInteger(15,7);
        System.out.println("1: "+pets);
        System.out.println("1 integer: "+integers1+"\n");

        Hamster h=new Hamster();
        Integer i=new Integer(random.nextInt(10));
        pets.add(h);//с автоматическим изменением размера
        integers1.add(i);
        System.out.println("2: "+pets);
        System.out.println("2 integer: "+integers1+"\n");


        System.out.println("3: "+pets.contains(h));
        System.out.println("3 integer: "+integers1.contains(i));// ????????
        System.out.println(integers1+"\n");

        pets.remove(h);//удаление заданного обыекта
        integers1.remove(i);
        System.out.println("Удаление добавленного объекта");
        System.out.println(integers1+"\n");

        Pet p=pets.get(2);
        Integer i2=integers1.get(2);
        System.out.println("4: "+p+" "+pets.indexOf(p));
        System.out.println("4 integer: число "+i2+" индекс "+integers1.indexOf(i2));
        System.out.println(integers1+"\n");



        Pet cymric=new Cymric();
        Integer i3=new Integer(random.nextInt(10));
        System.out.println("5: "+pets.indexOf(cymric));
        System.out.println("5 integer:число "+i3+" индекс "+integers1.indexOf(i3));
        System.out.println(integers1+"\n");

        System.out.println("6: "+pets.remove(cymric));
        //Удаление заданного объекта:
        System.out.println("6 integer: "+integers1.remove(i3)); //2
        System.out.println(integers1+"\n");

        System.out.println("7: "+pets.remove(p));
        System.out.println("7 integer: "+integers1.remove(i2));//число 3 индекс 2
        System.out.println(integers1+"\n");

        System.out.println("8: "+pets);
        System.out.println("8 integer: "+integers1+"\n");

        pets.add(3, new Mouse());//Добавить по индексу
        integers1.add(0, 7);
        System.out.println("9: "+pets);
        System.out.println("9 integer: "+integers1);
        System.out.println(integers1+"\n");


        List<Pet> sub=pets.subList(1,4);
        List<Integer> integersSub=integers1.subList(0,4);
        System.out.println("Частичный список "+sub);
        System.out.println("Частичный сипсок integers "+integersSub+"\n");

        System.out.println("10: "+pets.containsAll(sub));
        System.out.println("10 integers: "+integers1.containsAll(integersSub)+"\n");

        Collections.sort(sub);//Сортировка на месте
        Collections.sort(integersSub);
        System.out.println("После сортировки "+sub);
        System.out.println("После сортировки integers "+integersSub+"\n");


        System.out.println("11: "+pets.containsAll(sub));//длч containsAll порядок не важен
        System.out.println("11 integer: "+integers1.containsAll(integersSub)+"\n");

        Collections.shuffle(sub, random);//перемешивание
        Collections.shuffle(integersSub, random);
        System.out.println("После перемешивания "+sub);
        System.out.println("После перемешивания "+integersSub+"\n");


        System.out.println("12: "+pets.containsAll(sub));
        System.out.println("12 integers: "+pets.containsAll(sub)+"\n");

        List<Pet> copy=new ArrayList<Pet>(pets);
        List<Integer> integerCopy=new ArrayList<Integer>(integers1);
        sub= Arrays.asList(pets.get(1), pets.get(4));
        integersSub=Arrays.asList(integers1.get(1), integers1.get(3));
        System.out.println("sub: "+sub);
        System.out.println("integerSub: "+integersSub+"\n");

        copy.retainAll(sub);
        integerCopy.retainAll(integersSub);
        System.out.println("13: "+copy);
        System.out.println("13 integers: "+integerCopy+"\n");

        copy=new ArrayList<Pet>(pets);//Копирование
        integerCopy=new ArrayList<Integer>(integers1);

        copy.remove(2);//удаление по индексу
        integerCopy.remove(2);

        System.out.println("14: "+copy);
        System.out.println("14 integer: "+integerCopy+"\n");

        copy.removeAll(sub);//удаление заданных объектов
        integerCopy.removeAll(integersSub);

        System.out.println("15: "+copy);
        System.out.println("15 integer: "+integerCopy+"\n");

        copy.set(1, new Mouse());//замена элемента
        int newInteger=9;
        integerCopy.set(0,newInteger);
        System.out.println("16: "+copy);
        System.out.println("16 integer: "+integerCopy+"\n");

        copy.addAll(2,sub);//вставка списка в середину
        integerCopy.addAll(2,integersSub);
        System.out.println("17: "+copy);
        System.out.println("17 integer: "+integerCopy+"\n");

        System.out.println("18: "+pets.isEmpty());
        System.out.println("18 integer: "+integers1.isEmpty()+"\n");

        pets.clear();//удаление всех элементов
        integers1.clear();
        System.out.println("19: "+pets);
        System.out.println("19 integer: "+integers1+"\n");

        System.out.println("20: "+pets.isEmpty());
        System.out.println("20 integer: "+integers1.isEmpty()+"\n");

        pets.addAll(Pets.arrayList(4));
        integers1=ListFeature.getInteger(7,15);

        Object[] o=pets.toArray();
        System.out.println("21: "+pets);
        System.out.println("21 integer: "+Arrays.toString(integers1.toArray())+"\n");

        System.out.println("22: "+o[3]);
        System.out.println("22 integers: "+integers1.toArray()[3]+"\n");

        Pet[] pa=pets.toArray(new Pet[0]);
        Object[] integers4=integers1.toArray(new Object[0]);

        System.out.println("23: "+pa[3].id());
        System.out.println("23 integer: "+integers4[2]);









    }
}
