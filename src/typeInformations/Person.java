package typeInformations;

public class Person {
    public final String firstName;
    public final String lastName;
    public final String address;

    public Person(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String toString(){
        return "Person "+firstName+" "+lastName+" "+address;
    }

    public static class NullPerson extends Person implements Null{
        private NullPerson(){
            super("none","none","none");
        }

        public String toString() {
            return "NullPerson";
        }

    }

    public static final Person NULL=new NullPerson();
}

/**
 * null-объект -будет одиночным объектом(синглетоном) и статически неизменяемым экземпляром.
 * Объект Person не модифицируется, возможно только записать значение в конструкторе и прочитать их,
 * но не можем изменить.
 * Для того чтобы изменить NullPerson мы можем заменить его новым объектом Person.
 * Используя instanceofe можем обнаружить интерфейс Null или конкретный класс, NullPerson.
 * Для обнаружения одиночного объекта можем воспользоваться equals() или == для сравнения с Person.NULL
 */
