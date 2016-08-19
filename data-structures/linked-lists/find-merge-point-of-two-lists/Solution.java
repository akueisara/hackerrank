/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    if (headA == null && headB == null)
        return -1;
    else {
        Node currentA = headA;
        Node currentB = headB;

        while(currentA != currentB) {
            if(currentA.next == null)
                currentA = headB;
            else 
                currentA = currentA.next;
            
            if(currentB.next == null)
                currentB = headA;
            else 
                currentB = currentB.next;
        }
        return currentA.data;
    }
}