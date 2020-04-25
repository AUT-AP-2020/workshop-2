
/**
 * this class represent a vote in voting class
 * 
 * @author sevda imany
 * @version 0.0
 */
public class Vote {
    //the voter
   private Person person;
   //the date of vote
   private String date;

   /**
    * creat a new vote 
    * @param person
    * @param date
    */
    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;
    }

    
    /** 
     * get person
     * @return 
     */
    public Person getPerson() {
        return person;
    }


    
    /** 
     * get date
     * @return 
     */
    public String getDate() {
        return date;
    }

    
    /** 
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((person == null) ? 0 : person.hashCode());
        return result;
    }

    
    /** 
     *  equality of two object
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vote other = (Vote) obj;
        if (person == null) {
            if (other.person != null)
                return false;
        } else if (!person.equals(other.person))
            return false;
        return true;
    }

 

}