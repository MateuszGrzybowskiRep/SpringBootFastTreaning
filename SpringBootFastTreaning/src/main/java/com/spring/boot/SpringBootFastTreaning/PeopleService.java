package com.spring.boot.SpringBootFastTreaning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PeopleService {
    @Autowired
    private PeopleRepository peopleRepository;

    public List<People> peoplee = new ArrayList<>(Arrays.asList(
                new People("spring", "Mateusz", "Programer"),
                new People("sprgng", "Tomasz", "Programer"),
                new People("a", "Tomasz", "Programer")


        ));
    public List<People> getAllPeople() {
        List<People> peoplee = new ArrayList<>();
        peopleRepository.findAll().forEach(peoplee::add);
        return peoplee;
    }

    public List<People> getPeoplee(){
        return peoplee;
    }
    public People getPeople(String id){
        return peoplee.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addPerson(People people) {
        peopleRepository.save(people);
    }

    public void updatePerson(String id, People people) {
        for (int i =0;i<peoplee.size();i++){
            People p = peoplee.get(i);
            if (p.getId().equals(id)){
                peoplee.set(i,people);
            }
        }
    }
    public void delatePerson(String id) {
        peoplee.removeIf(t->t.getId().equals(id));
    }
}
