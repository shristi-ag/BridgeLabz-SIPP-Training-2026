import java.util.*;

public class Football {
    double[] heights = new double[11];
    double sum = 0;
    public double calculateMean() {
        for(int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }
        double mean = sum / heights.length;
        return mean;
    }
    public void displayMean(double mean) {
        System.out.println("Total Height = " + sum);
        System.out.println("Mean Height of Team = " + mean);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Football player = new Football();
        System.out.println("Enter height of 11 players:");
        for(int i = 0; i < player.heights.length; i++) {
            player.heights[i] = sc.nextDouble();
        }
        player.displayMean(player.calculateMean());
        sc.close();
    }
}