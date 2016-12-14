#include <queue> 
/*
struct node
{
    int data;
    node* left;
    node* right;
}*/

void LevelOrder(node * root)
{
    std::queue<node*> q;       
    q.push(root);
    while(!q.empty()) {
        node * curr = q.front();
        q.pop();
        if(curr != NULL) {
            std::cout << curr->data << " ";
            q.push(curr->left);
            q.push(curr->right);
        }
    }
}
