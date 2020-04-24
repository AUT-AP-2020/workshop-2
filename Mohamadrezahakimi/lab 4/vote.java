public class vote {
    private person person;
    private String date;
    public vote(person person,String date){
        this.date=date;
        this.person=person;
    }

    public person get_person() {
        return person;
    }

    public String getDate() {
        return date;
    }

    public boolean equals(vote object){
        if(object.get_person().to_string().equalsIgnoreCase(person.to_string())){
            return true;
        }
        else return false;
    }
}
