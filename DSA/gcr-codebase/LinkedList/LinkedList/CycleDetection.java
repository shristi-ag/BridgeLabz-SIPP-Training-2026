package LinkedList;

import LinkedListExample.Node;

public class CycleDetection {
    int data;
    Node next;
    CycleDetection(int data){
        this.data=data;
        this.next=null;
    }
    public boolean hasRedirectLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }
}