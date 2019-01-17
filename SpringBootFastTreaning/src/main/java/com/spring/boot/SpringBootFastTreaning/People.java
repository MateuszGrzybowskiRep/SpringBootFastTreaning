package com.spring.boot.SpringBootFastTreaning;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class People {
    @Id
    private String id;
    private String name;
    private String decription;

    public People(){

    }

    public People(String id, String name, String decription) {
        this.id = id;
        this.name = name;
        this.decription = decription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
