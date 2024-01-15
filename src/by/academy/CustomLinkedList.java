package by.academy;

public class CustomLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    private int size;

    public void add(T value) {

        if (tail == null) {
            Node<T> newNode = new Node<>(value, null, null);
            head = newNode;
            tail = newNode;
            size++;

            return;
        }
        Node<T> newNode = new Node<>(value, null, tail);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void remove(int index) {

        if (index < 0 || index >= size) {
            System.err.println("Index out of bound exception");
        }

        if (index == 0) {
            removeHead();
        } else if (index == size - 1) {
            removeTail();
        } else {
            Node<T> current = getNode(index);
            if (current == null) {
                System.err.println("Index out of bound exception. Size: " + size + " " + "Index: " + index);
                return;
            }
            Node<T> prev = current.prev;
            Node<T> next = current.next;

            prev.next = next;
            next.prev = prev;

            current.next = null;
            current.prev = null;
            current = null;
            size--;
        }
    }

    public void removeHead() {

        if (size > 0) {
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                Node<T> c = head.next;
                c.prev = null;
                head.next = null;
                head = c;
            }
            size--;
        }
    }

    public void removeTail() {

        if (size > 0) {
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                Node<T> c = tail.prev;
                c.next = null;
                tail.prev = null;
                tail = c;
            }
            size--;
        }
    }

    public int getSize() {
        return size;
    }


    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    private Node<T> getNode(int index) {
        if (index < 0 || index >= size) {
            System.err.println("Index out of bound exception. Size: " + size + " " + "Index: " + index);
            return null;
        }
        int counter = 0;
        Node<T> current = head;

        do {
            if (index == counter) {
                return current;
            }
            current = current.next;
            counter++;

        } while (current != null);

        return null;
    }

    public T get(int index) {
        Node<T> node = getNode(index);
        return node != null ? node.value : null;
    }


    public class Node<T> {

        T value;
        Node<T> next;
        Node<T> prev;

        public Node(T val, Node<T> next, Node<T> prev) {
            this.next = next;
            this.prev = prev;
            this.value = val;
        }
    }
}


