import java.util.*;

/**
 * This class save fields relative to every vote
 * @author Mohamad Hasannejadi
 * @version 1.0
 */

public class Vote{
    private Person person;
    private String date;

    /**
     * equals method override
     * @param object vote we want to compare
     * @return if two votes are equal return true 
     */
    @Override
    public boolean equals(Object object) {
        if (this == object){ 
            return true;
        }
        if (object == null || getClass() != object.getClass()){
            return false;
        } 
        Vote vote = (Vote) object;
        return (date.equals(vote.date) && person.equals(vote.person)) ;
    }

    /**
     * hashCode override
     * @return hash number
     */
    @Override
    public int hashCode() {
        return Objects.hash(person, date);
    }
    
	public Vote(Person voter, String date){
        person = voter;
        this.date = date; 
    }

    /**
     * getter of person
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * getter of date
     * @return the date
     */
    public String getDate() {
        return date;
    }
    
    
}