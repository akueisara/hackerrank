/*
    Insert Node in a doubly sorted linked list 
    After each insertion, the list should be sorted
   Node is defined as
   struct Node
   {
     int data;
     Node *next;
     Node *prev;
   }
*/
Node* SortedInsert(Node *head,int data)
{
    // Complete this function
   // Do not write the main method. 
    Node* n = (Node*)malloc(sizeof(Node));
    n->data = data;

    if(head == NULL){
        head = n;
        return head;   
    }
    
    if(head->data > data){
        n->next = head;
        head->prev = n;
        head = head->prev;
        return head;
    }

    Node* hnext = head->next;
    Node* h = head;

    while(hnext != NULL){
        if(data < hnext->data){
            h->next = n;
            n->prev= h;
            n->next = hnext;
            hnext->prev = n;
            return head;
        }
        hnext = hnext->next;
        h = h->next;
    }

    h->next = n;
    n->prev = h;

    return head;
}