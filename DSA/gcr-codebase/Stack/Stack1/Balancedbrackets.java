package Stack1;

import java.util.*;

public class Balancedbrackets {
    public static boolean isValidConfig(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {

                if (stack.isEmpty() || stack.pop() != map.get(ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isValidConfig("()[]{}"));
        System.out.println(isValidConfig("([{}])"));
        System.out.println(isValidConfig("(]"));
    }
}