package sk.itsovy.ganoczi.linkedlist;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToFront(Node node) {
        if (node == null) {
            return;
        }
        if (head == null) {
            head = node;
            node.setNext(null);
        } else {
            node.setNext(head);
            head = node;
        }
    }

    public void addToEnd(Node node) {
        if (node == null) {
            return;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(node);
    }

    public void addToIndex(Node node, int position) {
        if (node == null)
            return;

        if (position <= 0) {
            addToFront(node);
        } else if (position > getSize()) {
            addToEnd(node);
        } else {
            Node temp = head;
            for (int i = 1; i < position; i++) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty, no item to print !");
        } else {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.getData());
                tmp = tmp.getNext();
            }
        }
    }

    public boolean remove(Node node) {
        if (head==null || node==null){
            return false;
        }
        if (head==node){
            head=node.getNext();
            return true;
        }
        Node temp=head;
        while(temp.getNext()!=node) {
            temp = temp.getNext();
            if (temp == null) {
                return false;
            }
        }
            temp.setNext(temp.getNext().getNext());
            return true;


    }

    public void removeAll() {
        head=null;
    }

    public Node findByName(String name) {
        if (name==null || head==null){
            return null;
        }
        Node temp=head;
        while(temp!=null){
            if (temp.getData().equals(name)){
                return temp;
            }
            temp=temp.getNext();
        }
        return null;

    }

    public int getSize() {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            temp = temp.getNext();
            count++;
        }
        return count;
    }
}
