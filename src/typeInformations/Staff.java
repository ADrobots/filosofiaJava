package typeInformations;

import java.util.ArrayList;
import java.util.List;

public class Staff extends ArrayList<Position> {
    public void add(String title, Person person){
        add(new Position(title,person));
    }

    public void add(String... titles){
        for (String title:titles) {
            add(new Position( title));
        }
    }

    public Staff(String... titles){
        add(titles);
    }

    public boolean positionAvailable(String title){
        //available - имеется в наличии
        for (Position position: this) {
            if (position.getTitle().equals(title) && position.getPerson()==Person.NULL){
                return true;
            }
        }
        return false;
    }

    public void fillPosition(String title, Person hire){
        for (Position position: Staff.this) {
            if(position.getTitle().equals(title) && position.getPerson()==Person.NULL){
                position.setPerson(hire);
                return;
            }
        }

        throw new RuntimeException("Position "+title+" no available");
    }

    public static void main(String[] args) {
        Staff staff=new Staff("President", "CTO", "Marketing Manager", "Product manager", "Project Lead", "Software Engeneer", "Software Engeneer", "Software Engeneer", "Test engeneer", "Technical writer");
        staff.fillPosition("President", new Person("Anna","Covalchuk", "top"));

        staff.fillPosition("Software Engeneer", new Person("Tony","Gibson", "family man"));
        System.out.println(staff);
    }


}

