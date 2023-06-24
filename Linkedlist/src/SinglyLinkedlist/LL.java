package SinglyLinkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    //Inserting at the first index
    public void insertFirst(int val) {
        Node node1 = new Node(val);
        node1.next = head;
        head = node1;

        if (tail == null) tail = head;
        size += 1;
    }

    //Inserting from the end
    public void insertEnd(int val) {
        Node node1 = new Node(val);
        if (tail == null) insertFirst(val);
        tail.next = node1;
        node1 = tail;
        size += 1;


    }

    //Inserting at any point in the linked list

    public void insertIndex(int val,int index){


        if(index==0){
            insertFirst(val);
            return;
        }

        if(index==size){
            insertEnd(val);
            return;
        }

        //if postion in given then run the loop for n-1 time or else run for n times
        Node temp= head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }

        Node node=new Node(val,temp.next);
        temp.next=node;
         size+=1;

    }

    //Deletion the first index;

    public int deleteFirst(){
        int deleted_val=head.val;
        if(head==null)
            tail=null;
        head=head.next;
        size-=1;
        return deleted_val;
    }
    //get index method
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++)
            node=node.next;
        return node;
    }

    //Deleting the last index from linked list

    public int deleteEnd(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.val;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    //Deleting at the particular index

    public int deleteIndex(int index){
        if(index==0){
            return deleteFirst();
        }

        if(index== size-1)
            return deleteEnd();

        Node prev=get(index-1);

        int val=prev.next.val;
        prev.next=prev.next.next;
        return val;
    }



    //Displaying the linked list
    public void displayLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
