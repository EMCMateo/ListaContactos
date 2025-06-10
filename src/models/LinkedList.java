package models;

public class LinkedList <T> {
    private Node <T> head;
    private Node <T> tail;
    private int size;








    

    public LinkedList(Node<T> head, Node<T> tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = 0;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }



    public void appendToTail(T value){
        Node<T> newNode = new Node<>(null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public T findByValue(T value){
        Node<T> current = head;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null; 

    }

    public void deleteByValue(T value){
        if(head != null){
            
        }
    }

    
}