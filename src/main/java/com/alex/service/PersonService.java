package com.alex.service;

import com.alex.entity.Person;

import java.util.List;

public interface PersonService {
    Long savePerson();

    List<Person> findAll();
}
