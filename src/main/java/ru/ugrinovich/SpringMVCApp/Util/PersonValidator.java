package ru.ugrinovich.SpringMVCApp.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.ugrinovich.SpringMVCApp.DAO.PersonDAOWithHibernate;
import ru.ugrinovich.SpringMVCApp.models.Person;

@Component
public class PersonValidator implements Validator {
    private final PersonDAOWithHibernate personDAOWithHibernate;

    @Autowired
    public PersonValidator(PersonDAOWithHibernate personDAOWithHibernate) {
        this.personDAOWithHibernate = personDAOWithHibernate;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }
    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;
        // смотрим есть ли человек с таким же email'ом в БД


    }
}       
