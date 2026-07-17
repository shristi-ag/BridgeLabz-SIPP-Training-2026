package HashSet;

import java.util.HashSet;
import java.util.Set;

public class DuplicateTokenDetection {
    public static boolean hasDuplicateToken(String[] tokens) {
        Set<String> seen = new HashSet<>();

        for (String token : tokens) {
            if (!seen.add(token)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] tokens = {"abc123", "xyz456", "abc123", "pqr789"};

        System.out.println(hasDuplicateToken(tokens));
    }

}