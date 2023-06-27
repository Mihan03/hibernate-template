package ru.feoktistov.springcourse.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.transaction.annotation.Transactional;
import ru.feoktistov.springcourse.models.Person;


import java.util.List;
/**
 * @author Neil Alishev
 */
@Component
public class PersonDAO {
    private final SessionFactory sessionFactory;

    @Autowired
    public PersonDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public List<Person> index() {
        Session session = sessionFactory.openSession();

        // this is usually hibernate code here
        List<Person> people = session.createQuery("select p from Person p", Person.class)
                .getResultList();

//        Person person = session.get(Person.class, 1);
        System.out.println(people);
        return people;
    }

    public Person show(int id) {
        return null;
    }

    public void save(Person person) {

    }

    public void delete(int id) {

    }

    public void update(int id, Person updatedPerson) {

    }
}