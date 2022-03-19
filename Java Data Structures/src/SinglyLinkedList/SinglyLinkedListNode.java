package SinglyLinkedList;

public class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data, SinglyLinkedListNode next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "SinglyLinkedListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
