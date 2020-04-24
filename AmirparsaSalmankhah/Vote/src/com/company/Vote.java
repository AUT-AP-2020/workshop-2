package com.company;

import java.util.Objects;

/**
 * Represents a vote
 * @author Amirparsa Salmankhah
 * @version 1.0.0
 */
public class Vote {
    //Person
    private Person person;
    //Date
    private String date;

    /**
     * Constructor with 2 parameters
     * @param person Person
     * @param date Date
     */
    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;
    }

    /**
     * Person getter
     * @return Person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Date getter
     * @return Date
     */
    public String getDate() {
        return date;
    }

    /**
     * Checks equality between the vote and another object.
     * @param o Another object
     * @return true if they are equal and false if not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return person.equals(vote.person);
    }

    /**
     * Calculates hash of the vote.
     * @return Vote object's hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(person, date);
    }

}
