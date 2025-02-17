import java.util.*;

public class LinkedList {
    public static class Node {
        int data;
        Node next;
        Public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // Step 1: Create a new Node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step 2: link node to another node
        newNode.next = head;

        //  Step 3: head = newNode

        head = newNode;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}