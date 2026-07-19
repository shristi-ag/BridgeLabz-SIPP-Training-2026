import java.util.*;

public class Friends {
    String[] names = {"Amar", "Akbar", "Anthony"};
    int[] ages = new int[3];
    double[] heights = new double[3];
    public void findYoungest() {
        int youngestIndex = 0;
        for(int i = 1; i < ages.length; i++) {
            if(ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        System.out.println("Youngest Friend -> "
                + names[youngestIndex]);
    }
    public void findTallest() {
        int tallestIndex = 0;
        for(int i = 1; i < heights.length; i++) {
            if(heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("Tallest Friend -> "
                + names[tallestIndex]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Friends friend = new Friends();
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter details of "
                    + friend.names[i]);
            System.out.print("Age: ");
            friend.ages[i] = sc.nextInt();
            System.out.print("Height: ");
            friend.heights[i] = sc.nextDouble();
        }
        friend.findYoungest();
        friend.findTallest();
        sc.close();
    }
}