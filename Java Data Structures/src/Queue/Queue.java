package Queue;

import java.util.NoSuchElementException;

public class Queue<T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T value) {
            this.data = value;
        }
    }
    private QueueNode<T> first;
    private QueueNode<T> last;

    public void enqueue(T data) {
        QueueNode<T> t = new QueueNode<>(data);
        //if last node exists point at new one
        if (last != null) {
            last.next = t;
        }
        //set new to last
        last = t;
        //if no first, last is also first
        if (first == null) {
            first = last;
        }
    }
    public T dequeue() {
        //if not first queue is empty
        if (first == null) {
            throw new NoSuchElementException();
        }
        //get data from first node
        T data = first.data;
        //move front pointer to next
        first = first.next;
        //if queue is now empty set last to null
        if (first == null) {
            last= null;
        }
        return data;
    }

    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public Boolean isEmpty() {
        return first == null;
    }
}
