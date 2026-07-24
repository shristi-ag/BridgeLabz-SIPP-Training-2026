package LinkedList;

public class Middle {
    int data;
    Middle next;
    Middle(int data){
        this.data=data;
        this.next=null;
    }

    public Middle findMiddleServer(Middle head) {

        Middle slow = head;
        Middle fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}