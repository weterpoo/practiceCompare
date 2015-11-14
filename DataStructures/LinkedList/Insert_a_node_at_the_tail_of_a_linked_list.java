/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method.
    Node header = head;
    while(true) {
        if(head == null) {
            head = new Node();
            head.data = data;
            return head;
        }
        else {
            if(head.next == null) {
                head.next = new Node();
                head.next.data = data;
                break;
            }
        }
        head = head.next;
    }
    return header;
}
