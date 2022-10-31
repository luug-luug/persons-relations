package com.relationalnetworks.personsrelations.Person;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID id;
    private String name;
    private int age;
    @ManyToMany
    private Set<Person> friends;

    public Person() {}

    public Person(String name, int age) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.age = age;
        this.friends = new HashSet<>();
    }

    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Set<Person> getFriends() {
        return friends;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setFriends(Set<Person> friends) {
        this.friends = friends;
    }
}
