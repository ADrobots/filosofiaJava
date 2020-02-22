package exceptions;

//Multiple - множественные
//return - возврат
public class MultipleReturns {
    public static void f(int i){
        System.out.println("Инициализация, требует завершения");
        try{
            System.out.println("Точка 1");
            if(i==1) return;
            System.out.println("Точка 2");
            if (i==2) return;
            System.out.println("Точка 3");
            if (i==3) return;
            System.out.println("Конец");
            if (i==4) return;
        }finally {
            System.out.println("Завершающие действия");
        }
    }

    public static void main(String[] args) {
        for (int i=1; i<=4; i++){
            f(i);
        }
    }
}

/*
Из выходных данные видно, что завершающие действия выполняются независимо  от того,
какая из команд return вернула управление в классе с finally
 */
