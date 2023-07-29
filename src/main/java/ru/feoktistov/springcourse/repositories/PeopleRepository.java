package ru.feoktistov.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.feoktistov.springcourse.models.Person;

import java.util.List;

public interface PeopleRepository extends JpaRepository<Person, Integer> {
    List<Person> findByName(String name);

    List<Person> findByNameOrderByAge(String age);

    List<Person> findByEmail(String email);

    List<Person> findByNameStartingWith(String startingWith);

    List<Person> findByNameOrEmail(String name, String email);
}
