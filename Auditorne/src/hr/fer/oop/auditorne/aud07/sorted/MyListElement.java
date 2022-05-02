package hr.fer.oop.auditorne.aud07.sorted;

public class MyListElement<T> {
    private T content;
    private MyListElement<T> next;

    public MyListElement(T content) {
        this.content = content;
    }

    public MyListElement(T content, MyListElement<T> next) {
        this.content = content;
        this.next = next;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public MyListElement<T> getNext() {
        return next;
    }

    public void setNext(MyListElement<T> next) {
        this.next = next;
    }
}
