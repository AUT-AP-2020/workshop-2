package com.company;

public class Person {
    //First name of the person
    private String firstName;
    //Last name of the person
    private String lastName;

    /**
     * Constructor with 2 paramters
     * @param firstName First name of the person
     * @param lastName Last name of the person
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Gets first name of the person
     * @return First name of the person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets last name of the person
     * @return Last name of the person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns an string containing person's name
     * @return Person's name
     */
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
