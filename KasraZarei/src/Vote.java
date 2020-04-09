/**
 * Vote class
 *
 * @param date to save jalali date of vote
 * @param sumVotes to save number of votes
 */

import ir.huri.jcal.JalaliCalendar;

public class Vote {
    static JalaliCalendar date;
    static int sumVotes = 0;

    public Vote() {
        this.date = new JalaliCalendar();
        sumVotes++;
    }
}
