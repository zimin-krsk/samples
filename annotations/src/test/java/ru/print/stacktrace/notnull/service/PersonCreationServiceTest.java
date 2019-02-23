package ru.print.stacktrace.notnull.service;

import org.junit.BeforeClass;
import org.junit.Test;
import ru.print.stacktrace.notnull.model.Person;

import java.util.Collections;

public class PersonCreationServiceTest {

    private static PersonCreationService creationService;

    @BeforeClass
    public static void init() {
        creationService = new PersonCreationService();
    }

    @Test(expected = IllegalArgumentException.class)
    public void CreatePersonWithNullName() {
        Person actualPerson = creationService.create(null, 30, Collections.emptyList());
    }

    @Test(expected = IllegalArgumentException.class)
    public void CreatePersonWithNullAge() {
        Person actualPerson = creationService.create("User", null, Collections.emptyList());
    }
}