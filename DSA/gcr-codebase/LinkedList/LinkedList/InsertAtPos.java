package LinkedList;
public class InsertAtPos {
    int data;
    InsertAtPos next;
    InsertAtPos( int data){
        this.data=data;
        this.next=null;
    }
    public void insertAfter(InsertAtPos current, int trackId) {
        if (current == null)
            return;

        InsertAtPos newNode = new InsertAtPos(trackId);

        newNode.next = current.next;
        current.next = newNode;
    }
}