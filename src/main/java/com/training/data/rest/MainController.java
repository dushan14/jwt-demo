package com.training.data.rest;

import com.training.data.entity.Person;
import com.training.data.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewPerson(@RequestParam String name, @RequestParam int age){

        Person person=new Person();
        person.setName(name);
        person.setAge(age);
        personRepository.save(person);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    List<Person> getAllPersons(){
        return personRepository.findAll();
    }


}
