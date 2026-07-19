import java.util.ArrayList;

public class Subsets {

    static void generateSubsets(int[] arr, int index,
                                ArrayList<Integer> current) {

        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Exclude current element
        generateSubsets(arr, index + 1, current);

        // Include current element
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current);

        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        generateSubsets(arr, 0, new ArrayList<>());
    }
}
