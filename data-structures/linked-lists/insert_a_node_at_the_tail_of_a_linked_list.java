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
    Node n = head;
    if (n == null) {
        n = new Node();
        n.data = data;
        return head;
    }
    Node end = new Node();
    end.data = data;
    while (n.next!=null) {
        n = n.next;
    }
    n.next = end;
    return head;
}
