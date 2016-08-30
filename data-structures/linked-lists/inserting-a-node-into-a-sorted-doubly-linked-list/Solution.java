/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) {
    Node n = new Node();
    n.data = data;

    if(head == null){
        head = n;
        return head;    
    }
    
    if(head.data > data){
        n.next = head;
        head.prev = n;
        head = head.prev;
        return head;
    }

    Node hnext = head.next;
    Node h = head;

    while(hnext != null){
        if(data < hnext.data){
            h.next = n;
            n.prev= h;
            n.next = hnext;
            hnext.prev = n;
            return head;
        }
        hnext = hnext.next;
        h = h.next;
    }

    h.next = n;
    n.prev = h;

    return head;
}
