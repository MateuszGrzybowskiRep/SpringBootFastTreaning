package com.spring.boot.SpringBootFastTreaning;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PeopleContlorer {

    @Autowired
    private PeopleService peopleService;

    @RequestMapping("/people")
    public List<People> getAllPeople(){
       return peopleService.getPeoplee();
    }
    @RequestMapping("/people/{id}")
    public People getPeople(@PathVariable String id){
        return peopleService.getPeople(id);
    }
    @RequestMapping(method = RequestMethod.POST, value ="/people/up")
    public void addPeople(@RequestBody People people){
        peopleService.addPerson(people);
    }
    @RequestMapping(method = RequestMethod.PUT, value ="/people/{id}")
    public void updadtePeople(@RequestBody People people, @PathVariable String id){
        peopleService.updatePerson(id, people);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/people/del/{id}")
    public void delatePeople(@RequestBody People people, @PathVariable String id){
         peopleService.delatePerson(id);
    }
}

