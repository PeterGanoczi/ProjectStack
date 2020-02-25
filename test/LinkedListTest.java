import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sk.itsovy.ganoczi.linkedlist.LinkedList;
import sk.itsovy.ganoczi.linkedlist.Node;

import javax.sql.rowset.BaseRowSet;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getSizeTest() {
        LinkedList linkedList = new LinkedList();
        assertEquals(0, linkedList.getSize(), "Has to be 0");
        Node<String> node1 = new Node<>("Test node 1");
        Node<String> node2 = new Node<>("Test node 2");
        Node<String> node3 = new Node<>("Test node 3");
        linkedList.addToFront(node1);
        assertEquals(1, linkedList.getSize(), "Has to be 1");
        linkedList.addToFront(node2);
        assertEquals(2, linkedList.getSize(), "Has to be 2");
        linkedList.addToFront(node3);
        assertEquals(3, linkedList.getSize(), "Has to be 3");
        linkedList.remove(node1);
        assertEquals(2, linkedList.getSize(), "Has to be 2 after remove");
        linkedList.removeAll();
        assertEquals(0, linkedList.getSize(), "Has to be 0");
    }

    @Test
    void addTest() {
        LinkedList linkedList = new LinkedList();

        Node<String> nodeNull = new Node<>(null);
        Node<String> node1 = new Node<>("Test node 1");
        Node<String> node2 = new Node<>("Test node 2");
        Node<String> node3 = new Node<>("Test node 3");
        Node<String> nodeEmpty = new Node<>("");
        Node<Integer> nodeInt = new Node<>(10);
        Node<Date> nodeDate = new Node<>(new Date());
        Node<String> node4 = new Node<>("Test node 4");
        Node<String> node5 = new Node<>("Test node 5");
        Node<String> node6 = new Node<>("Test node 6");

        assertEquals(0, linkedList.getSize(), "has to be 0");
        linkedList.addToFront(node1);
        assertNotNull(linkedList.findByName("Test node 1"));
        assertNull(linkedList.findByName("Test node 2"));
        linkedList.addToFront(null);
        linkedList.addToIndex(null, 1);
        linkedList.addToEnd(null);
        assertEquals(1, linkedList.getSize(), "Has to be 1");
        linkedList.addToFront(node4);
        assertEquals(node4, linkedList.getHead());
        linkedList.addToFront(node3);
        assertNotEquals(node4, linkedList.getHead());

        linkedList.addToEnd(node5);
        Node temp = linkedList.getHead();
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        assertEquals(node5, temp);
        linkedList.addToEnd(node6);

        temp = linkedList.getHead();
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        assertNotEquals(node5, temp);
        assertEquals(node6, temp);
        Node<String> node11 = new Node<>("Test node 11");
        Node<String> node12 = new Node<>("Test node 12");
        Node<String> node13 = new Node<>("Test node 13");
        Node<String> node14 = new Node<>("Test node 14");
        Node<String> node15 = new Node<>("Test node 15");
        Node<String> node16 = new Node<>("Test node 16");

        linkedList.removeAll();
        assertNull(linkedList.getHead());
        linkedList.addToFront(node11);
        linkedList.addToFront(node12);
        linkedList.addToIndex(node13, 0);
        assertEquals(node13, linkedList.getHead());
        linkedList.addToIndex(node14, -1354613616);
        assertEquals(node14, linkedList.getHead());
        linkedList.addToIndex(node15, 153184);
        temp = linkedList.getHead();
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        assertEquals(node15, temp);
        linkedList.addToIndex(node16, 2);
        assertEquals(node16, linkedList.getHead().getNext().getNext());
    }

    @Test
    void removeTest() {
        LinkedList list=new LinkedList();
        Node<String> node1=new Node<>("Test node 1");
        Node<String> node2=new Node<>("Test node 2");
        Node<String> node3=new Node<>("Test node 3");
        Node<String> node4=new Node<>("Test node 4");
        Node<String> node5=new Node<>("Test node 5");
        Node<String> node6=new Node<>("Test node 6");
        Node<String> node7=new Node<>("Test node 7");

        list.addToFront(node1);
        list.addToFront(node2);
        list.addToFront(node3);
        assertEquals(3,list.getSize());
        list.remove(node2);
        assertEquals(2,list.getSize());
        list.remove(node2);
        assertEquals(2,list.getSize());


        list.removeAll();
        assertEquals(0,list.getSize());
        assertEquals(null,list.getHead());
        list.removeAll();
        assertEquals(0,list.getSize());
        assertEquals(null,list.getHead());
        list.remove(null);
        assertEquals(0,list.getSize());


    }

}