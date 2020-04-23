import java.util.Date;

public class Vote {

    private Person personInformation;
    private String dateOfVote;

    /**
     * the constructor of vote class
     * @param person an instance of person class
     */
    public Vote (Person person){

        personInformation = person;

        JalaliCalendar jDate = new JalaliCalendar();
        Date date = new Date();

        dateOfVote = jDate.getYear()+"/"+jDate.getMonth()+"/"+jDate.getDay()+"  "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds() ;

    }

    /**
     * simple getter method for getting the person
     * @return instance of person class in this vote
     */
    public Person getPersonInformation() {
        return personInformation;
    }

    /**
     * simple getter method for getting the date
     * of the vote
     * @return vote date as a string
     */
    public String getDateOfVote() {
        return dateOfVote;
    }

    /**
     * the override hashcode for faster search
     * @return the number in hashTable
     */
    @Override
    public String toString(){
        return personInformation.toString()+" "+dateOfVote;
    }

    /**
     * and override of equals method for checking votes
     * @param o the vote
     * @return if it is new or not
     */
    @Override
    public boolean equals(Object o) {

        if (o == null) {
            return false;
        } else if (this == o) {
            return true;
        } else return personInformation.toString().equals(o.toString());

    }

}
