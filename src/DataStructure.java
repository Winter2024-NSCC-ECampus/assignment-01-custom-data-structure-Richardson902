import java.util.NoSuchElementException;

public class DataStructure {

    LLNode head, tail;

    DataStructure() {
        head = null;
        tail = null;
    }

    // Adds new node to end of list
    void append(int value) {
        LLNode newNode = new LLNode(value);

        if (tail == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Adds new node to top of list
    void prepend(int value) {
        LLNode newNode = new LLNode(value);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = newNode;
        }
    }

    // Returns total number of nodes in the list
    int size() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }

        LLNode current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // Returns the first node in the list
    int head() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        else {
            return head.data;
        }
    }

    // Returns last node in the list
    int tail() {
        if (tail == null) {
            throw new NoSuchElementException("List is empty");
        }
        else {
            return tail.data;
        }
    }

    // Returns node at the given index
    int at(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        LLNode current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index is beyond the size of the list");
    }

    // Remove last element from the list
    int pop() {

        // Check if empty
        if (tail == null) {
            System.out.println("Underflow");
            return -1;

            // Check if only one element
        } else if (head == tail) {
            int value = tail.data;
            head = tail = null;
            return value;

            // Remove the last element
        } else {
            LLNode current = head;
            while (current.next != tail) {
                current = current.next;
            }
            int value = tail.data;
            tail = current;
            tail.next = null;
            return value;
        }

    }

    // Returns true if passed value is in the list, otherwise false
    boolean contains(int x) {
        LLNode current = head;
        while (current != null) {
            if (current.data == x) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Returns index of the node containing value
    int find(int value) {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }

        LLNode current = head;
        int index = 0;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        throw new NoSuchElementException("Value not found in list");
    }
}
