package sk.itsovy.ganoczi.main;

import sk.itsovy.ganoczi.linkedlist.LinkedList;
import sk.itsovy.ganoczi.linkedlist.Node;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList=new LinkedList();
        Node<String> node1=new Node<>("Fifo");
        Node <String> node2=new Node<>("Pepo");
        Node <String> node3=new Node<>("Marko");
        Node <String> node4=new Node<>("At the end");
        linkedList.addToFront(node1);
        linkedList.addToFront(node2);
        linkedList.addToFront(node3);

        linkedList.addToEnd(node4);
        linkedList.print();
        System.out.println(linkedList.getSize());
        Node node5=new Node("At index");
        linkedList.addToIndex(node5,1);
        System.out.println();
        linkedList.print();
        System.out.println();
        linkedList.remove(node1);
        linkedList.print();

        System.out.println();
        System.out.println(linkedList.findByName("Pepo").getData());

        linkedList.remove(linkedList.findByName("Pepo"));
        System.out.println();
        linkedList.print();

        Node<Integer> node8=new Node<>(52);
        linkedList.addToFront(node8);
        linkedList.print();



        /*
        Stack<Integer> stack=new Stack<>(3);
        try {
            stack.push(17);
            stack.push(17);
            stack.push(54);

            System.out.println(stack.top());
        } catch (StackOverflowException e) {
            e.printStackTrace();
        }*/
    }
}
