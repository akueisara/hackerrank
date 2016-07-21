/*
  Merge two sorted lists A and B as one linked list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* MergeLists(Node *headA, Node* headB)
{
  // This is a "method-only" submission. 
  // You only need to complete this method 
    if(headA == NULL && headB == NULL)
         return NULL;
    else if (headA == NULL)
         return headB;
    else if (headB == NULL) {
         return headA;
    }
    else if (headA->data <= headB->data){
        headA->next = MergeLists(headA->next, headB);
        return headA;
    } else {
        headB->next = MergeLists(headA, headB->next);
        return headB;
    }    
}