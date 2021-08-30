package com.datastructure;
import java.util.LinkedList;

public class Dequeue<T> {
    Node<T> front;
    Node<T> rear;
    int count = 0;

    class Node<T> {
        // constructor
        Node<T> front;
        Node<T> rear;
        Node<T> next = null;
        T data;

        Node(T data) {
            this.data = data;
        }
    }

    LinkedList<Character> l;

    public  Dequeue() {
        l = new LinkedList<Character>();
        front = null;
        rear = null;

    }

    public void add(T item) {
        Node<T> node = new Node<T>(item);
        l.add((Character)item);
    }

    public void addFront(T item) {
        Node<T> node = new Node<T>(item);
        if (rear == null) {
            front = node;
            rear = node;
            count++;
        } else {
            node.next = front;
            front = node;
            count++;
        }
    }

    public void addRear(T item) {
        Node<T> node = new Node<T>(item);
        if (rear == null) {
            front = node;
            rear = node;
            count++;
        } else {
            rear.next = node;
            rear = node;
            count++;
        }
    }

    public T removeFront() {
        Node<T> temp = front;
        front = front.next;
        count--;
        return temp.data;

    }

    public Node<T> removeRear() {
        Node<T> temp = front;
        Node<T> prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        count--;
        return temp;

    }

    public boolean isEmpty() {
        if (front == null)
            return true;
        else
            return false;
    }

    public int size() {
        return count;
    }

    public void display() {
        Node<T> temp = front;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Dequeue<Integer> dequeue = new  Dequeue<Integer>();
        dequeue.addRear(14);
        dequeue.addRear(20);
        dequeue.addRear(10);
        dequeue.display();
        dequeue.size();
        System.out.println();
        int result = dequeue.size();
        System.out.println(result);

        dequeue.removeFront();
        dequeue.display();
        System.out.println();
        dequeue.removeRear();
        dequeue.display();

    }
}
