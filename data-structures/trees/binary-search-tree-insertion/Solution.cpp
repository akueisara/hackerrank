/*
Node is defined as 

typedef struct node
{
   int data;
   node * left;
   node * right;
}node;

*/


node * insert(node * root, int value)
{
    if (root == NULL) {
        root = (node *)malloc(sizeof(node));
        root->data = value;
        return root;
    }
    node * curr = root;
    int comp = value - curr->data;
    while(comp < 0 && curr->left != NULL || comp > 0 && curr->right != NULL) {
        if(comp < 0) {
            curr = curr->left;
        } else {
            curr = curr->right;
        }
        comp = value - curr->data;
    }
    
    // curr points to the last node
    if(comp < 0) {
        node * newLeft = (node *)malloc(sizeof(node));
        newLeft->data = value;
        curr->left = newLeft;
    } else if(comp > 0) {
        node * newRight = (node *)malloc(sizeof(node));
        newRight->data = value;
        curr->right = newRight;
    } else {
        
    }
    
    return root;
}
