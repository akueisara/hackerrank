/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    Node nA = headA, nB = headB;
    while(nA!=null && nB!=null) {
        if(nA.data != nB.data) {
            return 0;
        }
        nA = nA.next;
        nB = nB.next;
    }
    if(nA == null && nB == null)
        return 1;
    else 
        return 0;
}