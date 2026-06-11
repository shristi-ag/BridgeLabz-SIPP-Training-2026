package Array1;

import java.util.*;

public class StudentVoting {
    int[] ages = new int[10];
    public void Voting(){
        for(int i =0;i<ages.length;i++){
            if(ages[i]<0){
                System.out.println("Invalid age");
            }
            else if(ages[i]>=18){
                System.out.println("You can vote");
            }else{
                System.out.println("Cannot vote");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentVoting student = new StudentVoting();
        System.out.println("Enter 10 students age:");
        for(int i = 0; i < student.ages.length; i++) {
            student.ages[i] = sc.nextInt();

        }
        student.Voting();
        sc.close();


    }
}
