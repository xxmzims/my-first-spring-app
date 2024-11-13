package ru.ugrinovitch.springApp;

public class TestBean {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public TestBean(String name) {
        this.name = name;
    }
}
