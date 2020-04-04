package com.myPack;

import java.util.Objects;

/**
 * the vote class contains a single vote that keeps
 * a vote information like date and the person who vote
 */
public class Vote {
    //An instance of person class
    private Person person;
    //The date that user voted
    private String date;

    /**
     * the constructo of vote class
     * @param person an instance of person class
     * @param date the voting date
     */
    public Vote(Person person,String date){
        this.date = date;
        this.person = person;
    }

    /**
     * simple getter method for getting the person
     * @return instance of person class in this vote
     */
    public Person getPerson() {
        return person;
    }

    /**
     * simple getter method for getting the date
     * of the vote
     * @return vote date as a string
     */
    public String getDate() {
        return date;
    }

    /**
     * and override of equals method for checking votes
     * @param o the vote
     * @return if it is new or not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return person.equals(vote.person) &&
                date.equals(vote.date);
    }

    /**
     * the override hashcode for faster search
     * @return the number in hashTable
     */
    @Override
    public int hashCode() {
        return Objects.hash(person, date);
    }
}
