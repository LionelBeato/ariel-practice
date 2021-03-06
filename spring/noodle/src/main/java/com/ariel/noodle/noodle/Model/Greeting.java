package com.ariel.noodle.noodle.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String content; 

    // public Greeting(long id, String content) {
    //     this.id = id;
    //     this.content = content; 
    // }

    public Greeting(String content) {
        this.content = content; 
    }

    public String getContent() {
        return content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Greeting [content=" + content + ", id=" + id + "]";
    }

    public Greeting() {

    }


}
