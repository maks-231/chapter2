package com.thoughtmechanix.licenses.services;

import com.thoughtmechanix.licenses.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public Person getPerson() {
        return Person.builder().id(1).name("John").lastName("Smith").build();
    }
}
