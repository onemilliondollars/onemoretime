package com.oleg.onemoretime.service;

import com.oleg.onemoretime.bean.Person;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class PersonService {
    private Person person;

    public PersonService(Person person) {
        this.person = person;
    }

    public int checkPersonAge(){
        Logger logger = LoggerFactory.getLogger(PersonService.class);
        int personAge = person.getAge();
        logger.info("checkPersonAge: returned " +personAge);
        return personAge;
    }
}
