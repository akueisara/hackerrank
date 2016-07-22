/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    Node p = head;
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(p.data);
    while(p.next != null) {
        p = p.next;
        list.add(p.data);
    }
    return list.get(list.size()-n-1);
}