import ir.huri.jcal.JalaliCalendar;

import java.util.*;

public class Lab4 {

}

/**
 * VotingSystem
 *
 * this class manage all voting machines , make them and give their questions
 * and options ,etc
 */
class VotingSystem {
    private static ArrayList<Voting> votingMachines;// list of active VotingMachines

    public static void main(String[] args) {
        votingMachines = new ArrayList<Voting>();
        makeVoteMachine();
        vote();

    }

    /**
     * make a voting machine
     */
    private static void makeVoteMachine() {
        Scanner fScanner = new Scanner(System.in);
        System.out.println("Enter the name of Voting Machine :");// get the name of machine
        String name = fScanner.next();
        System.out.println("Tell me the Question :");
        String qustion = fScanner.next();
        String[] options = optionTaker();
        System.out.println("People can choose more than 1 option or not ?(1=Yes,0=No)");
        boolean multivote;
        while (true) {// get the multivote situation
            int temp = fScanner.nextInt();
            if (temp == 0) {
                multivote = false;
                break;
            }
            if (temp == 1) {
                multivote = true;
                break;
            }
            System.out.println("That's not Valid");
        }
        Voting voting = new Voting(multivote, name, qustion, options);
        votingMachines.add(voting);// add the maden machine to arraylist
    }

    /**
     * get the options of a votingMachine
     */
    private static String[] optionTaker() {
        Scanner fScanner = new Scanner(System.in);
        int i = 0;// number of options
        while (true) {// get the number of the options
            System.out.println("Please enter the number of the Options:");
            i = fScanner.nextInt();
            if (i >= 2) {
                break;
            }
            System.out.println("at least you must tell me 2 options !");
        }

        String[] options = new String[i];
        for (int j = 0; j < i; j++) {// get the options
            System.out.printf("Enter the option number %d : ", j + 1);
            options[j] = fScanner.next();
        }
        return options;
    }

    /**
     * print all active voting machines
     */
    private static void showMachines() {
        Iterator<Voting> it = votingMachines.iterator();
        int i = 1;// to show the index;
        while (it.hasNext()) {// print all machines
            System.out.println("[" + i + "] :" + it.next().getName());
            i++;
        }
    }

    private static void deleteMachine() {
        Scanner fScanner = new Scanner(System.in);
        showMachines();// print machines
        int i = 0;// the index of machine
        while (true) {// get the index
            System.out.println("Enter the index of the Machine to delete it");
            i = fScanner.nextInt();
            if (i > 0 && i <= votingMachines.size()) {// check the entered number
                break;
            }
            System.out.println("That's not vaild");
        }
        votingMachines.remove(i - 1);

    }

    private static void vote() {
        Scanner fScanner = new Scanner(System.in);
        showMachines();
        int i = 0;// index of the machine
        while (true) {// get the index and check it value
            System.out.println("Please Choose one of Voting Machnes :");
            i = fScanner.nextInt();
            if (i > 0 && i <= votingMachines.size()) {
                break;
            }
            System.out.println("That's not Valid");
        }
        Voting tempVoting = votingMachines.get(i - 1);
        tempVoting.vote();
        tempVoting.printResult();
    }
}

/**
 * This is a voting machine has a question and give some options to vote
 */
class Voting {
    private boolean multivote;// type of Vote multi or single
    private String name;// name of the voting
    private HashMap<String, JalaliCalendar> voters;// name of people who vote
    private String qustion;// the qustion of voting
    private HashMap<String, Integer> options;// the options of the voting and its values
    private int totalVote;

    /**
     * Counstructor
     *
     * @param multivote
     * @param name
     * @param qustion
     * @param options
     */
    public Voting(boolean multivote, String name, String qustion, String... options) {
        this.multivote = multivote;
        this.name = name;
        this.qustion = qustion;
        totalVote = 0;
        voters = new HashMap<String, JalaliCalendar>();
        this.options = new HashMap<String, Integer>();
        for (int i = 0; i < options.length; i++) {

            this.options.put(options[i], 0);

        }
    }

    /**
     * the method to vote
     */
    public void vote() {
        Scanner fScanner = new Scanner(System.in);

        System.out.println("Please Enter Your name");
        if (!voterCheck(fScanner.next())) {// get the name and check the name
            return;
        }
        System.out.println(qustion + " ?");// print the question
        String[] optionStrings = showOptions();// print the options
        if (multivote) {
            System.out.println("You can Choose more than 1 option.");
            int i = 0;
            int n=0;//times of vote
            int[] choise = new int[options.size()];
            do {
                n++;//add to time of voting
                while (true) {
                    System.out.println("Enter the index of the option (-1=End,0=Random)");
                    i = fScanner.nextInt();
                    if (i < -1 || i > options.size()) {
                        System.out.println("That's not Valid");
                        continue;
                    }
                    break;
                }
                if (i == -1) {
                    System.out.println("That's Ok");

                } else if (i == 0) {// Random
                    for (int j = 0; j < choise.length; j++) {
                        choise[randomVote(choise)]++;
                    }
                    break;

                } else {
                    choise[i - 1]++;
                }

            } while (i != -1 && n<options.size());
            for (int j = 0; j < choise.length; j++) {
                if (choise[j] != 0) {

                    options.put(optionStrings[j], options.get(optionStrings[j]) + 1);
                }
            }
        } else {

            int i;
            while (true) {// get the i
                System.out.println("Enter the index of the option (0=Random)");
                i = fScanner.nextInt();
                if (i >= 0 && i <= options.size()) {
                    break;
                }
                System.out.println("That's not Valid");
            }
            if (i == 0) {// random
                Random random = new Random();
                options.put(optionStrings[random.nextInt(options.size())],
                        options.get(optionStrings[random.nextInt(options.size())]) + 1);

            } else {
                options.put(optionStrings[i - 1], options.get(optionStrings[i - 1]) + 1);
            }
        }
        JalaliCalendar currentTime=new JalaliCalendar(new GregorianCalendar());
        voters.put(name,currentTime );
    }

    public void printResult() {
        Set<String> names = options.keySet();
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String temp = it.next();
            System.out.println(temp + " : " + options.get(temp));
        }
    }

    /**
     * make random vote
     *
     * @return the index of option
     */
    private int randomVote(int... choise) {
        Random random = new Random();
        int i;
        while (true) {
            i = random.nextInt(options.size());
            if (choise[i] != 0) {
                continue;
            }
            break;
        }
        return i;
    }

    /**
     * check the voter in voters arrayList
     *
     * @return true if the voter Could Vote
     */
    private boolean voterCheck(String name) {
        Set<String> voterNames=voters.keySet();
        Iterator<String> it = voterNames.iterator();
        while (it.hasNext()) {
            if (it.next().equals(name)) {
                System.out.println("You Voted Before !");
                return false;
            }
        }
        return true;
    }

    /**
     * This method print all options for the Voter and put options in order ;
     *
     * @return options in order
     */
    private String[] showOptions() {
        String[] optionName = new String[options.size()];
        Set<String> names = options.keySet();
        Iterator<String> it = names.iterator();
        int i = 0;
        while (it.hasNext()) {
            String temp = it.next();
            System.out.printf("[%d] %s\n", i + 1, temp);
            optionName[i] = temp;
            i++;
        }

        return optionName;
    }

    public String getName() {
        return name;
    }

    public HashMap<String,JalaliCalendar> getVoters() {
        return voters;
    }

    public int getTotalVote() {
        return totalVote;
    }

    public HashMap<String, Integer> getOptions() {
        return options;
    }
}
