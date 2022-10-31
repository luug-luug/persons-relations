package com.relationalnetworks.personsrelations.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAllPersons() {
        List<Person> persons = new ArrayList<>();
        personRepository.findAll().forEach(persons::add);
        return persons;
    }

    public void addPerson(Person person) {
        personRepository.save(person);
    }

    public Person findPerson(UUID id) {
        return personRepository.findById(id).orElse(null);
    }

    public void deletePerson(UUID id) {
        personRepository.deleteById(id);
    }

    public void updatePerson(Person person) {
        personRepository.save(person);
    };

}
