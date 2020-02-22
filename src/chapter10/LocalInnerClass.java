package chapter10;

//ЛОКАЛЬНЫЕ ВНУТРЕННИЕ КЛАССЫ

interface Counter{
    int next();
}

public class LocalInnerClass {
    private int count=0;

    Counter getCounterInner(final String name){

        //ЛОКАЛЬНЫЙ ВНУТРЕННИЙ КЛАСС
        class LocalCounter implements Counter{

            //локальный внутренний класс может иметь конструктор
            public LocalCounter(){
                System.out.println("LocalCounter()");
            }
            public int next(){
                System.out.println(name+count);
                return count++;
            }
        }

        return new LocalCounter();
    }

    //ЛОКАЛЬНЫЙ АНОНИМНЫЙ ВНУТРЕННИЙ КЛАСС
    Counter getCounterInnerAnonimys(final String name){
        return new Counter(){
            //Анонимный внутренний класс не может иметь именованного
            //конструктора, только инициализатор экземпляра
            {
                System.out.println("Counter()");
            }

            public int next(){
                System.out.println(name+count);
                return count++;
            }
        };
    }


    public static void main(String[] args) {
        LocalInnerClass localInnerClass=new LocalInnerClass();
        Counter counter1=localInnerClass.getCounterInner("Локальный ");
        Counter counter2=localInnerClass.getCounterInnerAnonimys("Анонимный ");

        for (int i=0; i<5; i++){
                counter1.next();
                counter2.next();
        }
    }
}
