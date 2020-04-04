package com.myPack;

import java.util.Objects;

/**
 * the class of person contains the information of a voter
 * it keeps the voter name and last name and some method to
 * access them
 */
public class Person {
    //The voter first name
    private String firstName;
    //The voter last name
    private String lastName;

    /**
     * the constructor of the person class
     * @param firstName voter first name
     * @param lastName voter last name
     */
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * the getter method for last name of voter
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * the getter method for first name of voter
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * an override of toString method for voter
     * information
     * @return a single string as voter information
     */
    @Override
    public String toString() {
        return "Person : " + "First Name = " + getFirstName() + " , Last Name = " + getLastName();
    }

    /**
     * an overriding of equals method to check if a person had vote before
     * @param o the instance of person class
     * @return true or false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    /**
     * the hashcode for fast search
     * @return the number of instance in hashtable
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
