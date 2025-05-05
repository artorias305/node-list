package Structure;
public class UndoStack {
    Node head;

    UndoStack() { this.head = null; }

    boolean isEmpty() {
        return head == null;
    }

    void push(String data) {
        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;
    }
    void pop() {
        if (isEmpty()) {
            System.out.println("UndoStack Underflow");
            return;
        } else {
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }
    String peek() {
        if (!isEmpty()) {
            return head.data;
        } else {
            System.out.println("UndoStack is empty");
            return "Error";
        }
    }
}
