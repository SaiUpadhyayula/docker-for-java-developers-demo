package com.programming.techie;

import jakarta.persistence.*;

@Entity
@Table(name = "greeting")
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String greeting;

    public Greeting() {
    }

    public Greeting(String message) {
        this.greeting = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
