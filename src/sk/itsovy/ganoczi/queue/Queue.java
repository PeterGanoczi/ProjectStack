package sk.itsovy.ganoczi.queue;

import sk.itsovy.ganoczi.exception.QueueOverflowException;
import sk.itsovy.ganoczi.exception.QueueUnderflowException;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

    private int capacity;
    private int size = 0;
    private List<T> list;

    public Queue(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(T obj) throws QueueOverflowException {
        if (obj == null) {
            return;
        }
        if (!isFull() && obj != null) {
            list.add(obj);
            size++;
        } else throw new QueueOverflowException("Queue is full");

    }

    public T getFront() {
        if (isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    public void dequeue() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("Queue is empty");
        } else {
            list.remove(0);
            size--;
        }

    }

    public T frontAndDequeue() throws QueueUnderflowException {
        T temp=getFront();
        dequeue();
        return temp;
    }

    public void empty() {
        list.clear();
    }
}
