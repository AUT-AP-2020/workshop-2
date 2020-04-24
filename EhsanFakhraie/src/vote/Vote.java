package vote;

import java.util.Objects;

public class Vote {

    private Person person;

    private String date;

    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(person, vote.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person);
    }
}
