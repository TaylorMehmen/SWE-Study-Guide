package SinglyLinkedList;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.push(25);
        System.out.println(list.head);
        list.insert(23);
        list.insert(2);
        System.out.println(list.head);
        list.deleteAt(1);
        System.out.println(list.head);
    }
}
