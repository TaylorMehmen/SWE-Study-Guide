package SinglyLinkedList;

public class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public int size = 0;

    // O(1)
    public void push(int data) {
        head = new SinglyLinkedListNode(data, head);
        this.size++;
    }

    // O(n)
    public int accessAt(int idx) {
        SinglyLinkedListNode node = head;
        if (idx > this.size) {
            throw new IllegalArgumentException("invalid index");
        }
        else {
            for (int i = 1; i <= idx; i++) {
                node = node.next;
            }
            return node.data;
        }
    }

    // O(1)
    // Must determine edge case null
    public void insert(int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data, null);

        if (head == null) {
            head = node;
        }
        else {
            SinglyLinkedListNode pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = node;
        }
        this.size++;
    }

    // O(1)
    public void deleteAt(int idx) {
        SinglyLinkedListNode node = head;
        if (idx > this.size) {
            throw new IllegalArgumentException("invalid index");
        }
        else {
            for (int i = 0; i < idx-1; i++) {
                node = node.next;
            }
            node.next = node.next.next;
        }
        this.size--;
    }
}
