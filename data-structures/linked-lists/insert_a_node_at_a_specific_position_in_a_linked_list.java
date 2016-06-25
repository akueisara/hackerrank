/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
       Node n = head;
    if (head == null && position !=0) {
        return head;
    }
    else if (position ==0) {
        n = new Node();
        n.data = data;
        n.next = head;
        return n;
    }
    else{
        int p=0;
        while (p!=position-1) {
            n = n.next;
            p++;
        }
        Node i = n.next;
        n.next = new Node();
        n.next.data = data;
        n.next.next = i;
        return head;
    }
}
