package com.openclassrooms.safetynet.dao;

import com.openclassrooms.safetynet.model.Person;

import java.util.List;

public interface PersonDAO {

    List<Person> getAllPersons();

    void setAllPersons(List<Person> listPerson);

    List<Person> findPersonByAdress(String address);

    Boolean deletePerson(String firstName, String lastName);

    Person addPerson(Person person);

    List<Person> findPersonByFirstNameAndLastName(String firstName, String lastName);

    Person modifyPerson(Person person);
}
