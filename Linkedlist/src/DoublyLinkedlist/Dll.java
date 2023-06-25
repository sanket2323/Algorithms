package DoublyLinkedlist;

public class Dll {

    Node head;

    //insertion on the first index
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) head.prev = node;
        head = node;
        size++;
    }

    //Inserting last

    public void insertLast(int val) {
        Node temp = head;
        Node node = new Node(val);
        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }


        while (temp.next != null) {
            temp = temp.next;
        }


        temp.next = node;
        node.prev = temp;

    }

    //Inserting at the specific index



    //Display the Doubly linked list

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.val + "->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");

        //display the dll in reverse order

        while (last != null) {
            System.out.print(last.val + "<-");
            last = last.prev;
        }
        System.out.println("start");

    }


    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }

    int size = 0;
}
