package org.spring.demo.bean;

import org.spring.demo.validation.NameValidation;

public class Foo {
    private Long id;
    @NameValidation
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
