import ir.huri.jcal.JalaliCalendar;

public class Vote {

    Person person;
    String date;

    public Vote (Person person, String date){
        this.person = person;
        this.date = date;
    }

    public Person getPerson() {return person;}

    public String getDate() {return date;}

    public boolean equals(Vote vote){
        if (vote.getDate().equals(date) && vote.getPerson().equals(person))
            return true;
        return false;
    }


}
