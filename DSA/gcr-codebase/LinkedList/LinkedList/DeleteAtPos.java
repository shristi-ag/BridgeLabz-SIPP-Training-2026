package LinkedList;

public class DeleteAtPos {
    int data;
    DeleteAtPos next;
    DeleteAtPos(int data){
        this.data=data;
        this.next=null;
    }

    public DeleteAtPos removeTask(DeleteAtPos head, int taskId) {

        if (head == null)
            return null;

        if (head.data == taskId)
            return head.next;

        DeleteAtPos prev = head;
        DeleteAtPos curr = head.next;

        while (curr != null && curr.data != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;

        return head;
    }
}