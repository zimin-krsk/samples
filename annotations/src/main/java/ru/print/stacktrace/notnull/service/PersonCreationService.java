package ru.print.stacktrace.notnull.service;

import ru.print.stacktrace.notnull.model.Person;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class PersonCreationService {

    // Suppress constant condition warning because we are have not
    // warranty that code client is follow of our advice.
    // And required parameters are really will be is not null.
    @SuppressWarnings({"ConstantConditions"})
    public Person create(
            @Nonnull String name,
            @Nonnull Integer age,
            @Nullable List<String> addresses) {
        Person person = new Person(name, age);
        person.setAddresses(addresses);

        if (name == null) {
            throw new IllegalArgumentException("Name is required field of Person");
        }
        if (age == null) {
            throw new IllegalArgumentException("Age is required field of Person");
        }

        return person;
    }
}
