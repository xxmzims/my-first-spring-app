package ru.ugrinovich.SpringMVCApp.DAO;

import org.springframework.stereotype.Component;
import ru.ugrinovich.SpringMVCApp.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private List<Person> people;
    private static int PEOPLE_COUNT;
    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Maks"));
        people.add(new Person(++PEOPLE_COUNT, "Dima"));
        people.add(new Person(++PEOPLE_COUNT, "Dasha"));
        people.add(new Person(++PEOPLE_COUNT, "Vitya"));
    }
    public List<Person> index(){
        return people;
    }
    public Person show(int id){
        for(Person person: people){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public void save(Person person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }
    public void update(int id, Person updatedPerson){
        Person personToBeUpdated = show(id);

        personToBeUpdated.setName(updatedPerson.getName());
    }
    public void delete(int id){
        people.removeIf(person -> person.getId() == id);
    }
}
