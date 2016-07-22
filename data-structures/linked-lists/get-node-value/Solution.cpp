/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
int GetNode(Node *head,int positionFromTail)
{
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Node *ptr1 = head;
    Node *ptr2 = head;
    int count = 0;
    while(ptr1->next != NULL) {
        ptr1 = ptr1->next;
        count++;
        if(count > positionFromTail) {
            ptr2 = ptr2->next;  
        }
    }
    return ptr2->data;
}