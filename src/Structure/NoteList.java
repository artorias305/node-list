package Structure;

public class NoteList {
    private Node head;
    private UndoStack undostack;
    private RedoStack redostack;

    public NoteList() {
        this.head = null;
        this.undostack = new UndoStack();
        this.redostack = new RedoStack();
    }

    public void addNote(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        redostack.clear();
    }

    public void printNotes() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public void undo() {
        if (head == null) {
            System.out.println("Nothing to undo.");
            return;
        }

        if (head.next == null) {
            redostack.push(head.data);
            undostack.push(head.data);
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        undostack.push(current.next.data);
        redostack.push(current.next.data);
        current.next = null;
    }

    public void redo() {
        if (redostack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }

        String redoData = redostack.pop();

        addNote(redoData);

        undostack.push(redoData);
    }
}
