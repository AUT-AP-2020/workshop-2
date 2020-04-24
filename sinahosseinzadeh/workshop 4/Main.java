import javax.print.DocFlavor;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

/**
 * @author Sina
 */
public class Main {
    public static void main(String[] args)
    {
        //baraye in ke be tor koli tarif shode bashe va tedad ray har shakhs ro in be nahvi moshakhas mikone !
        int type1 = 0;
        ArrayList<Person> check= new ArrayList<>();
        Scanner in = new Scanner(System.in);
        ArrayList<String> candidates = new ArrayList<>();
        VotingSystem persianKind = new VotingSystem();
        ArrayList<String> code = new ArrayList<>();
       int tempor = 1;
        System.out.println("create vote please ");

        while ((persianKind.getOnGoingVote().isEmpty()) ||( tempor ==1 ))
            {
                System.out.println("what will be the question ?" );
                String temp = in.nextLine();
                System.out.println("each person has how many votes  ? ");
                 type1 = in.nextInt();
                System.out.println("how many candidates it will have ?");
                int many = in.nextInt();
                if (type1>=many)
                {
                    //brye in rokh mide ke har shakhs age bekhad masaln 6 hagh ray dashte bashe va koln 3 ta bashe 3 tash misoze !
                    System.out.println("this poll is not possible to create due to votes !");
                    continue;
                }
                in.nextLine();
                for(int k=0 ; k<many;k++)
                {
                    System.out.println("who is the candidate ?");
                    String IndividualCandidate = in.nextLine();
                    System.out.println("what the code for choosing this candidate ?" );
                    String SeparateCode = in.next();
                    candidates.add(IndividualCandidate);
                    code.add(SeparateCode);
                    in.nextLine();
                }
                persianKind.CreateVoting(temp,type1,candidates,code);
                System.out.println("do you want to still create polls ?(y/n) ");
                String changer = in.next();
                if (changer.equals("n"))
                    break;
            }
        persianKind.GetVotingList();
        //tamam method hash test shode ama dar inja be nzr monsb nmirsid brye run grftn
        // vali mitonin test knin 
        System.out.println("which one do you choose?");
        int index = in.nextInt();
        Voting OnSystem =persianKind.getOnGoingVote().get(index-1);
        System.out.println("how many voter are here ?");
        int amount = in.nextInt();
        //inkaro anjam midim baraye inke type1 ghrr azash kam she va ma nemidonim dge to in poll harkas chndta hagh ray dsht !
        final int emergency=type1;
        while(amount>0) {
            amount--;
            System.out.println("what is your name ?");
            String name = in.next();
            System.out.println("what is your last name ?");
            String lastname = in.next();
            Person temp = new Person(name, lastname);
            //sakht ye shkhs ba tavajoh be info ke grftim
            OnSystem.ShowChoice();
            type1=emergency;
            type1++;
            while (type1 > 1)
            {

                    String chosen=null ;
                if (check.contains(temp))
                    {System.out.println("which one do you choose ?");
                     chosen = in.next();
                    System.out.println("this person has voted to this candidate already !");
                    }
                else
                    {
                    OnSystem.setVoters(new Vote(temp, chosen));
                    OnSystem.voting(new Vote(temp, chosen));
                    }
                type1--;
            }
            // dar inja add mishe ke be moshkl nakhorim va chizi ke aval dare kar mikone inja be moshkl bokhore !
            check.add(temp);
            System.out.println("thanks for helping to your society! ");
        }
            OnSystem.ShowPercentage();
            OnSystem.ShowVoters();
    }
}
