package generics;

public class TwoTuple<A,B> {
    public final A first;
    public final B second;

    public TwoTuple(A first, B second){
        this.first=first;
        this.second=second;
    }

    public String toString(){
        return "("+first+", "+second+")";
    }
}
/**
 * Конструктор сохраняет объекты в кортеже, а метод toString выводит значение
 * из списака. Кортеж неявно поддерживает порядок элементов.
 *
 * Данное решение  не нарушает основные принципы безопасности. Так как объект
 * может быть прочитан или вызван, но не возможно просвоить first и second другое
 * значение.
 *
 * Безопаснее оставить решение в этой форме и заставить клиента создать новый объект TwoTuple
 * если ему потребуется изменить его элемент.
 */
