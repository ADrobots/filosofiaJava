
//подсчет экземпляров семейства типов
package net.mindview.util;

import java.util.HashMap;
import java.util.Map;

public class TypeCounter extends HashMap<Class<?>,Integer> {
    private Class<?> baseType;
    public TypeCounter(Class<?> baseType){
        this.baseType=baseType;
    }

    public void count(Object obj){
        Class<?> type=obj.getClass();
        if (!baseType.isAssignableFrom(type)){
            throw new RuntimeException(obj+ " неправильный тип: "+type+", должен быть подтипом "+baseType);
        }
        countClass(type);
    }

    private void countClass(Class<?> type){
        Integer quantity=get(type);
        put(type,quantity==null?1:quantity+1);
        Class<?> superClass=type.getSuperclass();
        if(superClass!=null && baseType.isAssignableFrom(superClass)){
            countClass(superClass);
        }
    }

    public String toString(){
        StringBuilder result=new StringBuilder("{");
        for (Map.Entry<Class<?>,Integer> pair:entrySet()) {
            result.append(pair.getKey().getSimpleName());
            result.append("=");
            result.append(pair.getValue());
            result.append(", ");

        }
        result.delete(result.length()-2,result.length());
        result.append("}");

        return result.toString();
    }
}

/**
 * Метод count() получает объект Class в виде аргумента и с помощью метода isAssignableFrom()
 * проверяет объект, который должен принадлежать нужной иерархии.
 *
 * Метод countClass() сначала подсчитывает экземпляр реального типа класса, затем если baseType()
 * допускает присваивание из суперкласса, то countCLass выpывается рекурсивно
 * из суперкласса:
 *          {@link typeInformations.PetCount4}
 */
