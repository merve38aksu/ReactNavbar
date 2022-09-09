package com.dao;

import com.model.Person;

import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);
}
