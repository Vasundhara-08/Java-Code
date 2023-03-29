package Linked_List;

public class Linked {

    // we need to define the head and tail of the node
    private Node head;
    private Node tail;

    // here we show what internal node contains
 class Node {
        int val;
        Node next;

        // we created a constructor here to store the value
        Node(int data) {
            this.val =data;
            this.next =null;

        }

        // Insertion at first place of linked list
        public void addFirst(int data){

            Node newnode = new Node(data);    /// if linked list is empty we use this condition
            if(head==null){
                head = newnode;
                return;
            }
             else {
                newnode.next = head;
                head = newnode;
            }

        }

        public void main(String[] args) {
            // now to innitialize the link list we need to call our class by an object
            // initializing Node class with an object
            Linked list = new Linked();
//            list.addFirst(2);
       }


    }
}
