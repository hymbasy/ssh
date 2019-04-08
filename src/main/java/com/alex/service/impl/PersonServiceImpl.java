package com.alex.service.impl;

import com.alex.entity.Person;
import com.alex.repository.PersonRepository;
import com.alex.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;


    @Override
    public Long savePerson() {
        Person person = new Person();
        person.setUsername("alex");
        person.setPhone("15555555555");
        person.setAddress("beijing");
        person.setRemark("test save");
        return personRepository.save(person);
    }
    @Override
    public List<Person> findAll(){
        return personRepository.findAll();
    }
}
