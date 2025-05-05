import Structure.NoteList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NoteList notes = new NoteList();
        Scanner getInput = new Scanner(System.in);
        String input = "";
        while (!"exit".equals(input)) {
            System.out.println("Insert a note (or type 'undo' / 'exit'): ");
            input = getInput.nextLine();

            if (input.equals("undo")) {
                notes.undo();
            } else if (input.equals("redo")) {
                notes.redo();
            } else if (!input.equals("exit")) {
                notes.addNote(input);
            }

            System.out.println("Current notes:");
            notes.printNotes();
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}
