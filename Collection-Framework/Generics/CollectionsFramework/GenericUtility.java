package CollectionsFramework;

import java.util.List;

public class GenericUtility {

    // 1. Generic Method with Bounded Type Parameter
    public static <T extends Comparable<T>> T findMax(T[] arr) {

        if (arr == null || arr.length == 0) {
            return null;
        }

        T max = arr[0];

        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return max;
    }

    // 2. Wildcard (List<?>)
    public static void printList(List<?> list) {

        System.out.println("Printing List:");

        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    // 3. Upper Bounded Wildcard (? extends Number)
    public static double sum(List<? extends Number> list) {

        double total = 0;

        for (Number n : list) {
            total += n.doubleValue();
        }

        return total;
    }

    // 4. Lower Bounded Wildcard (? super Integer)
    public static void addNumbers(List<? super Integer> list) {

        list.add(100);
        list.add(200);
        list.add(300);
    }
}