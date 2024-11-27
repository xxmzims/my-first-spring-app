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
        people.add(new Person(++PEOPLE_COUNT, "Maks", 21, "xxmzims@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Dima", 22, "dima@yandex.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Dasha", 17, "dariavolkova@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Vitya", 19, "it6@bipexpert.com"));
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
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }
    public void delete(int id){
        people.removeIf(person -> person.getId() == id);
    }
}
