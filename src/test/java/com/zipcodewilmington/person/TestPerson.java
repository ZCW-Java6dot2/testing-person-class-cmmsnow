package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFeetTall() {
        // Given
        Person person = new Person();
        Integer expected = 6;

        // When
        person.setFeetTall(expected);

        // Then
        Integer actual = person.getFeetTall();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNumOfToes() {
        // Given
        Person person = new Person();
        Integer expected = 12;

        // When
        person.setNumOfToes(expected);

        // Then
        Integer actual = person.getNumOfToes();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNumOfEars() {
        // Given
        Person person = new Person();
        Integer expected = 2;

        // When
        person.setNumOfEars(expected);

        // Then
        Integer actual = person.getNumOfEars();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFingernails() {
        // Given
        Person person = new Person();
        Integer expected = 9;

        // When
        person.setFingernails(expected);

        // Then
        Integer actual = person.getFingernails();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testScars() {
        // Given
        Person person = new Person();
        Integer expected = 16;

        // When
        person.setScars(expected);

        // Then
        Integer actual = person.getScars();
        Assert.assertEquals(expected, actual);
    }
}
