import java.util.Objects;

public class Vote {
    private Person person;
    private String date;
    public Vote(Person person, String date){
        this.person = person;
        this.date = date;
    }

    public Person getPerson() {
        return person;
    }

    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vote)) return false;
        Vote vote = (Vote) o;
        return getPerson().equals(vote.getPerson()) &&
                getDate().equals(vote.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPerson(), getDate());
    }
}
