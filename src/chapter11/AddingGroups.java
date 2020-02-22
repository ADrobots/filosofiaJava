package chapter11;

//Добавление групп элементов

import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts={6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection, 11,12,13,14,15);
        Collections.addAll(collection, moreInts);
        //Создает список на базе массива:
        List<Integer> list=Arrays.asList(16,17,19,20);
        list.set(1,99);//возможно изменить элемент
        list.add(21);//ошибка времени исполнения, так как размер массива
        //изменить нельзя

    }
}

/**
Вспомогательные методы классво Arrays и Collections:
Arrays.asList() - получает массив или список жлементов(с использованием списка аргументов переменной длины)
, который преобразуется в объект List
Collections.addAll - получает массив либо список, разделенных запятыми,
и добавляет элементы в Collections

Метод Collections.addAll(), в отличии от Arrays.asList(), может получать  в аргументе
только другой объект Collection

Arrays.asList() можно использовать непосредственно как List, но базовы представлением
данных в этом случае являеся массив, не поддерживающий изменение массива

 @see chapter11.AsListInterface *next
*/
