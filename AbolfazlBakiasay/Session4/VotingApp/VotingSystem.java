import java.util.ArrayList;


public class VotingSystem {
	
	private ArrayList<Voting> votingList;
	
	public VotingSystem() {
		votingList = new ArrayList<>();
	}
	
	public void createVoting(String question, int type, ArrayList<String> polls) {
		Voting voting = new Voting(type, question);
		for(String poll:polls)
			voting.createPoll(poll);
		votingList.add(voting);
	}
	
	public ArrayList<Voting> getVotingList() {
		return votingList;
	}
	
	public Voting getVoting(int index) {
		if(index<0 || index>=votingList.size()) return null;
		return votingList.get(index);
	}

	public void vote(int index, Person person, ArrayList<String> options) {
		Voting voting = getVoting(index);
		if(voting == null) return;
		voting.vote(person, options);
	}
	
	public void randomVote(int index, Person person) {
		Voting voting = getVoting(index);
		if(voting == null) return;
		voting.randomVote(person);
	}
	
	public void getResult(int index) {
		Voting voting = getVoting(index);
		if(voting == null) return;
		System.out.println("");
		System.out.println(voting.getQuestion());
		voting.printVotes();
		System.out.println("");
	}
}
