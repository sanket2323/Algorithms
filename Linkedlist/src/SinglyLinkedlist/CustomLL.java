package SinglyLinkedlist;

public class CustomLL {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(235);
        list.insertFirst(243);
        list.insertFirst(223);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertEnd(2455);
        list.displayLL();
        System.out.println("Insert into any index");
        list.insertIndex(89,3);
        list.displayLL();
        System.out.println("Deleting the item from linked list");
        list.deleteFirst();
//        list.displayLL();
//
        System.out.println("Deleting the last element from the linked list");
        System.out.println(list.deleteEnd());
        list.displayLL();

        System.out.println("Deleting from the specfic index");
        list.deleteIndex(3);
        list.displayLL();


    }
}
