/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Node n = head;
    while(n.next != null) {
        if(n.data==n.next.data)
        {
            Node t = n.next;
            n.next= t.next;
        }
        else
            n = n.next;
    }
    return head;
}