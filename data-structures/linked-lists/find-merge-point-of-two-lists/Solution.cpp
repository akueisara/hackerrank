/*
   Find merge point of two linked lists
   Node is defined as
   struct Node
   {
       int data;
       Node* next;
   }
*/
int FindMergeNode(Node *headA, Node *headB)
{
    // Complete this function
    // Do not write the main method. 
    if(headA == NULL && headB == NULL)
        return -1;
    else {
        Node *currentA = headA;
        Node *currentB = headB;
        while(currentA != currentB) {
            if(currentA->next == NULL)
                currentA = headB;
            else
                currentA = currentA->next;
            if(currentB->next == NULL)
                currentB = headA;
            else
                currentB = currentB->next;
        }
        return currentA->data;
    }
}