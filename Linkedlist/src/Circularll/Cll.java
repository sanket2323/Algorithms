package Circularll;

public class Cll {

    private Node head;
    private Node tail;

    public Cll() {
        this.head = null;
        this.tail = null;
    }

    //inserting the element in the circular linked list

    public void insert(int val){
        Node node =new Node(val);
        if(head == null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;

    }

    //Display the circular linked list

    public void display(){
        Node temp=head;
        if(head != null){
            do{
                System.out.print(temp.val + "->");
                temp=temp.next;

            }while (temp != head);
        }
        System.out.println();
    }

    class Node{
        private int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
