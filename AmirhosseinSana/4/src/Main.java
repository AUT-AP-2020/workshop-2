import java.util.ArrayList;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();

        ArrayList<String> polls = new ArrayList<>();
        polls.add(":)");
        polls.add(":(");
        polls.add(":/");
        polls.add(":|");
        vs.createVoting("?", 0, polls);

        ArrayList<String> x = new ArrayList<>();
        x.add(":)");

        vs.vote(0, new Person("a", "b"), x);

        vs.getResult(0);
    }
}
