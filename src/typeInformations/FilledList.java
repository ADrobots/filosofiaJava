/**
 * В примере сохраняется ссылка на класс.
 * Потом создается контейнер List с объектами,
 * сгенерированными методом newInstance()
 */
package typeInformations;

import java.util.ArrayList;
import java.util.List;

class CountedInteger{
    private static long counter;
    private final long id=counter++;
    public String toString(){
        return Long.toString(id);
    }
}

public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type){this.type=type;}
    public List<T> create(int nElements){
        List<T> result=new ArrayList<>();
        try {
            for (int i=0; i<nElements; i++){
                result.add(type.newInstance());
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> f1=new FilledList<CountedInteger>(CountedInteger.class);
        System.out.println(f1.create(12));
    }
}
/**
 * Класс предполагает, что любой тип, с которым он работает, имеет конструктор по
 * умолчанию(вызываемый без исключения). Если условие нарушается, возникает исключение.
 * Компилятор не выдает предупреждений в программе.
 * Метод newInstance() возвращает точный тип объекта вместо базового типа Object
 * как в примере {@link typeInformations.GenericClassReferences}
 */
