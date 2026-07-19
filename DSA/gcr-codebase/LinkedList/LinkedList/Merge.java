package LinkedList;

public class Merge{
    int data;
    Merge next;
    Merge(int data){
        this.data=data;
        this.next=null;
    }

    public Merge mergeLogStreams(Merge a, Merge b) {

        Merge dummy = new Merge(0);
        Merge tail = dummy;

        while (a != null && b != null) {

            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        if (a != null)
            tail.next = a;
        else
            tail.next = b;

        return dummy.next;
    }
}