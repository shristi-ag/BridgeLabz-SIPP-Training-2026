import java.util.*;
public class Booth {
    int age;
    int vote;
    public boolean checkEligibility() {
        return age >= 18;
    }
    public void recordVote() {
        if (vote == 1) {
            System.out.println("Vote recorded for Candidate 1");
        } else if (vote == 2) {
            System.out.println("Vote recorded for Candidate 2");
        } else if (vote == 3) {
            System.out.println("Vote recorded for Candidate 3");
        } else {
            System.out.println("Invalid Vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter Age (-1 to Exit): ");
            int ageInput = sc.nextInt();
            if (ageInput == -1) {
                System.out.println("Polling Closed!");
                break;
            }
            Booth voter = new Booth();
            voter.age = ageInput;
            if (voter.checkEligibility()) {
                System.out.println("Eligible to Vote");
                System.out.println("1. Candidate 1");
                System.out.println("2. Candidate 2");
                System.out.println("3. Candidate 3");
                System.out.print("Enter Your Vote: ");
                voter.vote = sc.nextInt();
                voter.recordVote();
            } else {
                System.out.println("Not Eligible to Vote");
            }
        }

        sc.close();
    }
}