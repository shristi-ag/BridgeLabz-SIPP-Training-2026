package LinkedList;

public class ReversedLinkedList {
    int data;
    ReversedLinkedList next;

    ReversedLinkedList(int data) {
        this.data = data;
        this.next = null;
    }


    public ReversedLinkedList reverseHistory(ReversedLinkedList head) {

        ReversedLinkedList prev = null;
        ReversedLinkedList curr = head;

        while (curr != null) {
            ReversedLinkedList next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }
}