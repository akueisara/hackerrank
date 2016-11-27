/*
struct node
{
    int data;
    node* left;
    node* right;
};

*/

void top_view(node * root)
{
    node* curr = root;
    stack<int> stack;   
    while(curr != NULL) {
        stack.push(curr->data);
        curr = curr->left;
    }
    while(!stack.empty()) {
        cout << stack.top() << " ";
        stack.pop();
    }
    curr = root;
    while(curr->right != NULL) {
        curr = curr->right;
        cout << curr->data << " ";
    }  
  
}