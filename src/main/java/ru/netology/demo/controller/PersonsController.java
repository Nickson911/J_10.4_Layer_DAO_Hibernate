package ru.netology.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import ru.netology.demo.entity.Persons;
import ru.netology.demo.repository.PersonsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonsController {

    @Autowired
    private PersonsRepository personsRepository;

    @GetMapping("/persons/by-city")
    public List<Persons> getPersons(@RequestParam String city) {
        return personsRepository.getPersonsByCity(city);
    }
}