package interfaces;

import java.util.Random;

interface RandVal{
    Random RANDOM=new Random(5);
    int RAND_VALUE_INT=RANDOM.nextInt();
    char RAND_VALUE_CHAR=(char)RANDOM.nextInt(2);
}

public class TestRandVal implements RandVal{
    public static void main(String[] args) {
        System.out.println(TestRandVal.RAND_VALUE_INT);
        System.out.println(TestRandVal.RAND_VALUE_CHAR);
    }

    //Поля в интерфейсах должны быть определены и могу инициализироваться не константными значениями
    //Так как поля являяются статическими, они инициализируются при первой загрузке класса, котороя происходит при первом
    //обращении к любому из полей интерфейса
}
