package Structure;
public class RedoStack {
    Node head;

    RedoStack() { this.head = null; }

    boolean isEmpty() {
        return head == null;
    }

    void push(String data) {
        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;
    }
    String pop() {
        if (isEmpty()) {
            System.out.println("RedoStack Underflow");
            return null;
        } else {
            Node temp = head;
            head = head.next;
            String data = temp.data;
            temp = null;
            return data;
        }
    }
    String peek() {
        if (!isEmpty()) {
            return head.data;
        } else {
            System.out.println("RedoStack is empty");
            return "Error";
        }
    }
    public void clear() {
        head = null;
    }
}
