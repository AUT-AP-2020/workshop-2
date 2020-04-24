import ir.huri.jcal.JalaliCalendar;

import java.util.*;

/**
 * @author Sina
 *
 */
public class Vote  {
    private Person voter;
    // esme kesi ke entkhb krdn (be tor koli dar porose be karmon naiomde ama method namaysh ray shakhsi ham ezafe shde)
    private String chosen;
    private JalaliCalendar Date =new JalaliCalendar();
    public Vote(Person voter,String chosen)
    {
        this.chosen=chosen;
        this.voter=voter;
    }

    /**
     *
     * @param date declares the time
     */
    public void setDate(JalaliCalendar date) {
        Date = date;
    }

    /**
     *
     * @return  hejri shamsi
     */
    public JalaliCalendar getDate() {
        return Date;
    }

    /**
     *
     * @return its the people who voted
     */
    public Person getVoter() {
        return voter;
    }

    /**
     *
     * @return it is the chosen one
     */
    public String getChosen() {
        return chosen;
    }

    /**
     *
     * @param chosen will be the chosen one
     */
    public void setChosen(String chosen) {
        this.chosen = chosen;
    }

    /**
     *
     * @param voter the person who is going to vote
     */
    public void setVoter(Person voter) {
        this.voter = voter;
    }


    public void print()
    {
        System.out.println("the "+voter.getName()+" "+voter.getLastName()+" has been chosen "+chosen);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vote)) return false;
        Vote vote = (Vote) o;
        return getVoter().equals(vote.getVoter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVoter(), getChosen(), getDate());
    }
}
