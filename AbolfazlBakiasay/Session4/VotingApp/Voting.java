import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;


public class Voting {
	private int type;
	private String question;
	private ArrayList<Person> voters;
	private HashMap<String, HashSet<Vote>> polls;
	private Random rnd;
	
	public Voting(int type, String question) {
		this.type = type;
		this.question = question;
		voters = new ArrayList<>();
		polls = new HashMap<>();
		rnd = new Random();
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void createPoll(String poll) {
		if(!polls.containsKey(poll))
			polls.put(poll, new HashSet<Vote>());
	}
	
	public void vote(Person person, ArrayList<String> options) {
		if(voters.contains(person)) return;
		voters.add(person);
		switch (type) {
			case 0:
				if(options.size()>0 && polls.containsKey(options.get(0)))
					polls.get(options.get(0)).add(new Vote(person, new JalaliCalendar().toString()));	
			break;
			case 1:
				for(String s:options) if(polls.containsKey(s))
					polls.get(s).add(new Vote(person, new JalaliCalendar().toString()));
			break;
			default: break;
		}
	}
	
	public void randomVote(Person person) {
		if(type == 1 || polls.isEmpty()) return;
		int ind = rnd.nextInt(polls.size());
		String poll = (String) polls.keySet().toArray()[ind];
		polls.get(poll).add(new Vote(person, new JalaliCalendar().toString()));
	}
	
	public void getVoters() {
		for(Person p:voters)
			System.out.println(p);
	}
	
	public void printVotes() {
		for(String poll:polls.keySet()) {
			System.out.println(poll);
			for(Vote vote:polls.get(poll))
				System.out.println("  " + vote);
		}
	}
	
	public ArrayList<String> getPolls() {
		ArrayList<String> res = new ArrayList<>();
		Collections.addAll(res, (String[]) polls.keySet().toArray());
		return res;
	}
}












