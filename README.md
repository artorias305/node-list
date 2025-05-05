# Node List - Java Practice Project

This is a basic java project for practicing **linked lists**, **undo/redo
stacks**, and simple data structures.

## Features

- Add notes to a list
- Undo the last note added
- Redo a previously undone note
- Console-based interaction

## How to Run

1. Clone the repository:
```bash
git clone https://github.com/artorias305/node-list.git
```
2. Open the project in your favorite IDE (like IntelliJ IDEA).
3. Run the `Main` class.

## Structure
- `NoteList`: Manages notes as a singly linked list.
- `UndoStack` & `RedoStack`: Custom stack implementations using linked nodes.
- `Main`: Entry point for user interaction.

## Example

```text
Insert a note: hello
Insert a note: world
Insert a note: undo
> Last note removed
Insert a note: redo
> Last note restored
```

## Purpose

This project is for learning and experimenting with data structures in Java.
It's not production-grade -- just practice!
