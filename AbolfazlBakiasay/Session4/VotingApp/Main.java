import java.util.ArrayList;
import java.util.Arrays;



public class Main {
	
	
	public static void main(String[] args) {
		
		VotingSystem vs = new VotingSystem();

		Person p1 = new Person("Mahdi", "Kashefi");
		Person p2 = new Person("Ali", "Amiri");
		Person p3 = new Person("Mohamad", "Sadeghi");
		Person p4 = new Person("Reza", "Mohammadi");
		Person p5 = new Person("Sepehr", "Abbasi");
		Person p6 = new Person("Alireza", "Moradi");
		Person p7 = new Person("Morteza", "Pashayi");
		
		
		vs.createVoting("How often do you code?", 0, new ArrayList<String>(Arrays.asList(
			"Almost Always",
			"Most of the times",
			"Sometimes",
			"Often",
			"Never"
		)));
		
		
		vs.vote(0, p1, new ArrayList<>(Arrays.asList("Often")));
		vs.vote(0, p2, new ArrayList<>(Arrays.asList("Almost Always")));
		vs.vote(0, p3, new ArrayList<>(Arrays.asList("Never")));
		vs.vote(0, p4, new ArrayList<>(Arrays.asList("Often")));
		vs.vote(0, p5, new ArrayList<>(Arrays.asList("Sometimes")));
		vs.randomVote(0, p6);
		vs.randomVote(0, p7);
		
		vs.getResult(0);
		
		

		vs.createVoting("Which counteries have you been to?", 1, new ArrayList<String>(Arrays.asList(
			"Iran",
			"Turkey",
			"Finland",
			"Germany",
			"Japan",
			"Italy"
		)));
		
		
		vs.vote(1, p1, new ArrayList<>(Arrays.asList("Iran", "Italy")));
		vs.vote(1, p2, new ArrayList<>(Arrays.asList("Turkey", "Japan")));
		vs.vote(1, p3, new ArrayList<>(Arrays.asList("Italy", "Finland", "Iran")));
		vs.vote(1, p4, new ArrayList<>(Arrays.asList("Japan")));
		vs.vote(1, p5, new ArrayList<>(Arrays.asList("Germany", "Iran")));
		vs.vote(1, p6, new ArrayList<>(Arrays.asList("Finland", "Iran", "Japan")));
		
		vs.getResult(1);
		
		
		
	}
	
	
}
