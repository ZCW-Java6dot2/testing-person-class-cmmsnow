package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int feetTall;
    private int numOfToes;
    private int numOfEars;
    private int fingernails;
    private int scars;


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        //this.feetTall
        //this.numOfToes
        //this.numOfEars
        //this.fingernails
        //this.scars
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setFeetTall(Integer feetTall) {
        this.feetTall = feetTall;
    }

    public Integer getFeetTall() {
        return feetTall;
    }

    public void setNumOfToes(Integer numOfToes) {
        this.numOfToes = numOfToes;
    }

    public Integer getNumOfToes() {
        return numOfToes;
    }

    public void setNumOfEars(Integer numOfEars) {
        this.numOfEars = numOfEars;
    }

    public Integer getNumOfEars() {
        return numOfEars;
    }

    public void setFingernails(Integer fingernails) {
        this.fingernails = fingernails;
    }

    public Integer getFingernails() {
        return fingernails;
    }

    public void setScars(Integer scars) {
        this.scars = scars;
    }

    public Integer getScars() {
        return scars;
    }
}
