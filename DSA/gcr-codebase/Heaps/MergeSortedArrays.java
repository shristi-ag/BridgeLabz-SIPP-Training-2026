package Heaps;

import java.util.*;

public class MergeSortedArrays {
    static class Node {

        int value;
        int arrayIndex;
        int elementIndex;

        Node(int value, int arrayIndex, int elementIndex) {
            this.value = value;
            this.arrayIndex = arrayIndex;
            this.elementIndex = elementIndex;
        }
    }

    static List<Integer> merge(int[][] arrays) {

        PriorityQueue<Node> minHeap =
                new PriorityQueue<>((a, b) -> a.value - b.value);

        for (int i = 0; i < arrays.length; i++) {

            if (arrays[i].length > 0) {
                minHeap.offer(new Node(arrays[i][0], i, 0));
            }
        }

        List<Integer> result = new ArrayList<>();

        while (!minHeap.isEmpty()) {

            Node current = minHeap.poll();

            result.add(current.value);

            if (current.elementIndex + 1 < arrays[current.arrayIndex].length) {

                minHeap.offer(new Node(
                        arrays[current.arrayIndex][current.elementIndex + 1],
                        current.arrayIndex,
                        current.elementIndex + 1
                ));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] arrays = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        System.out.println(merge(arrays));
    }
}