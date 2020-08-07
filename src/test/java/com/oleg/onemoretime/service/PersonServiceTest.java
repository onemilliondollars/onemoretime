package com.oleg.onemoretime.service;

import com.oleg.onemoretime.bean.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonServiceTest {

    @Test
    public void checkPersonAge() {
        Person andrey = new Person();
        andrey.setAge(18);

        PersonService personService = new PersonService(andrey);
        int expectedResult = 18;
        int actualResult = personService.checkPersonAge();
        assertEquals(expectedResult,actualResult);
    }
}