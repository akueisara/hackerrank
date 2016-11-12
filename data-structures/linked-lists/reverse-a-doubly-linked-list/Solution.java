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

Node Reverse(Node head) {
    Node temp = null;
    Node current = head;
 
    /* swap next and prev for all nodes of 
    doubly linked list */
    while (current != null) {
        temp = current.prev;
        current.prev = current.next;
        current.next = temp;
        current = current.prev;
    }
 
    /* Before changing head, check for the cases like empty 
    list and list with only one node */
    if (temp != null) {
       head = temp.prev;
    }
    return head;
}