package typeInformations;

import typeInformations.Person;

public class Position {
    private String title;
    private Person person;

    public Position(String jobTitle, Person employee){
        this.title=jobTitle;
        this.person=employee;
        if (person == null) {
            person=Person.NULL;
        }
    }

    public Position(String jobTitle){
        title=jobTitle;
        person=Person.NULL;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String newTitle){
        title=newTitle;
    }

    public Person getPerson(){
        return person;
    }
    public void setPerson(Person newPerson){
        person=newPerson;
        if (person==null){
            person=Person.NULL;
        }
    }

    public String toString(){
        return "Position "+title+" "+person;
    }
}

/**
 * Для Position использовать null-объекты не нужно, существует Person.NULL - который
 * подразумевае что вакансия свободна.
 */
