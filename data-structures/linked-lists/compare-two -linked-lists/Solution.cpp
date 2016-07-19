/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
int CompareLists(Node *headA, Node* headB)
{
  // This is a "method-only" submission. 
  // You only need to complete this method 
    Node *nA = headA, *nB = headB;
    while(nA!=NULL && nB!=NULL) {
        if(nA->data != nB->data) {
            return 0;
        }
        nA = nA->next;
        nB = nB->next;
    }
    if(nA == NULL && nB == NULL)
        return 1;
    else 
        return 0;
}