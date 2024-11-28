package ru.ugrinovich.SpringMVCApp.DAO;

import org.springframework.stereotype.Component;
import ru.ugrinovich.SpringMVCApp.models.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    // URL нашей базы данных
    private static final String URL = "jdbc:postgresql://localhost:5432/first_db";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "bnm11091";

    // поле connection для подключения к базе данных
    private static Connection connection;

    static {
        try {
            // подгружаем драйвер на всякий случай(обычно подгружается автоматически)
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            // подключаемся к нашей бд, указывая необходимые данные
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static int PEOPLE_COUNT;

    public List<Person> index() {
        List<Person> people = new ArrayList<>();

        try {
            // создаем стейтмент, в его параметры передаем SQl запрос и получаем на выход объект класса ResultSet
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM Person";
            ResultSet resultSet = statement.executeQuery(SQL);
            //Используем цикл для того, чтобы перебрать все поля полученной таблицы из resultSet
            while (resultSet.next()) {
                Person person = new Person();
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));
                person.setAge(resultSet.getInt("age"));
                person.setEmail(resultSet.getString("email"));

                people.add(person);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return people;
    }

    public Person show(int id) {
//        for(Person person: people){
//            if (person.getId() == id){
//                return person;
//            }
//        }
        return null;
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
//        people.add(person);

        try {
            Statement statement = connection.createStatement();
            String SQL = String.format("INSERT INTO Person VALUES('%d', '%s', '%d', '%s')",
                    person.getId(), person.getName(), person.getAge(), person.getEmail());
            // вставляем наш объект
            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);

        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }

    public void delete(int id) {
//        people.removeIf(person -> person.getId() == id);
    }
}

