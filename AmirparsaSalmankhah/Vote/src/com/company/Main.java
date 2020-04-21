package com.company;

import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        Person p1 = new Person("Amirparsa","Salmankhah");
        Person p2 = new Person("Ali","Ansari");
        Person p3 = new Person("Parham","Moonesi");
        ArrayList<String> choices1 = new ArrayList<>();
        choices1.add("Messi");
        ArrayList<String> choices2 = new ArrayList<>();
        choices2.add("Ronaldo");
        ArrayList<String> choices3 = new ArrayList<>();
        choices3.add("Messi");
        choices3.add("Ronaldo");
        vs.createVoting("Who is the best player?",0);
        vs.getVoting(1).createChoice("Messi");
        vs.getVoting(1).createChoice("Ronaldo");
        vs.vote(1,p1,choices1);
        vs.vote(1,p1,choices1);
        vs.vote(1,p2,choices2);
        vs.vote(1,p3,choices3);
        vs.printResult(1);
        System.out.println("\n\n\n\n");
        vs.createVoting("Who is your favourite player?",1);
        vs.getVoting(2).createChoice("Messi");
        vs.getVoting(2).createChoice("Ronaldo");
        vs.getVoting(2).createChoice("Neymar");
        vs.vote(2,p1,choices1);
        vs.vote(2,p2,choices2);
        vs.vote(2,p3,choices3);
        vs.printResult(2);
        System.out.println("\n\n\n\n");
        vs.printListOfVotings();
        System.out.println();
        vs.printResult(1);
        System.out.println();
        vs.printResult(2);

    }
}
