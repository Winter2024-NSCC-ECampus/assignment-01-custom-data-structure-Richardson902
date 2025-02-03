# DataStructure Project

This project implements a simple linked list data structure in Java.

## Files

- `src/LLNode.java`: Defines the `LLNode` class, which represents a node in the linked list.
- `src/DataStructure.java`: Defines the `DataStructure` class, which implements various operations on the linked list.
- `src/Main.java`: Contains the `main` method to test the `DataStructure` class.

## Classes

### LLNode

Represents a node in the linked list.

- `int data`: The data stored in the node.
- `LLNode next`: The reference to the next node in the list.

### DataStructure

Implements a linked list with the following methods:

- `void append(int value)`: Adds a new node to the end of the list.
- `void prepend(int value)`: Adds a new node to the top of the list.
- `int size()`: Returns the total number of nodes in the list.
- `int head()`: Returns the data of the first node in the list.
- `int tail()`: Returns the data of the last node in the list.
- `int at(int index)`: Returns the data of the node at the given index.
- `int pop()`: Removes and returns the last element from the list.
- `boolean contains(int x)`: Returns true if the passed value is in the list, otherwise false.
- `int find(int value)`: Returns the index of the node containing the value.

### Main

Contains the `main` method to test the `DataStructure` class.

## Usage

To run the project, compile and execute the `Main` class. The `Main` class contains test cases to demonstrate the functionality of the `DataStructure` class.

```sh
javac src/Main.java
java src/Main
