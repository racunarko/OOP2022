package hr.fer.oop.auditorne.aud07.list;

public class MyList<T> {

    private MyListElement<T> head;

    public int add(T item) {
        int index = 0;

        if(head == null) {
            head = new MyListElement<>(item);
            return index;
        }

        MyListElement<T> current = head;

        while (current.getNext() != null) {
            current = current.getNext();
            index++;
        }
        current.setNext(new MyListElement<>(item));
        return index + 1;
    }

    public void removeAt(int index) {
        if (index == 0) {
            if (head != null) {
                head = head.getNext();
            }
            return;
        }

        MyListElement<T> current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }

        if (current != null && current.getNext() != null) {
            current.setNext(current.getNext().getNext());
        }
    }

    public T elementAt(int index) {
        MyListElement<T> current = head;

        for (int i = 0; i < index && current != null; i++) {
            current = current.getNext();
        }

        return current == null ? null : current.getContent();
    }

    public int size() {
        int count = 0;
        MyListElement<T> current = head;
        while (current != null) {
            current = current.getNext();
            count++;
        }
        return count;
    }

    void print() {
        MyListElement<T> current = head;
        while (current != null) {
            System.out.printf(" ---> %s", current.getContent().toString());
            current = current.getNext();
        }
        System.out.println();
    }
}
