//Измените иерархию Coffe в главе 15 так, чтобы в ней сипользовалась
//регитсрация фабрик

package typeInformations.question16;

public class RegisteredCoffeeFactories {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println(Coffee16.createRandom());
        }
    }
}
