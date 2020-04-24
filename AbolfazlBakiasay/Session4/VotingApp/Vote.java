
public class Vote {
	private Person person;
	private String date;
	
	public Vote(Person person, String date) {
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
	public boolean equals(Object obj) {
		if(obj == this)
			return true;
		if(!(obj instanceof Vote))
			return false;
		Vote vote = (Vote) obj;
		return (
			vote.getPerson().getFirstName().equals(person.getFirstName()) &&
			vote.getPerson().getLastName().equals(person.getLastName()) &&
			vote.getDate().equals(date)
		);
	}

	@Override
	public int hashCode() {
		long hashBase = 257;
		long hashMax = (long) (1e9+7);
		long res = 0;
		for(byte c:person.getFirstName().getBytes())
			res = (res * hashBase + c) % hashMax;
		for(byte c:person.getLastName().getBytes())
			res = (res * hashBase + c) % hashMax;
		for(byte c:date.getBytes())
			res = (res * hashBase + c) % hashMax;
		return (int) res;
	}
	
	@Override
	public String toString() {
		return person.toString() + " " + date;
	}
}
