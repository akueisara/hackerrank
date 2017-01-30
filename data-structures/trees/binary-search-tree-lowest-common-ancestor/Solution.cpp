/*
Node is defined as 

typedef struct node
{
   int data;
   node * left;
   node * right;
}node;

*/

node * lca(node * root, int v1,int v2) {
    
    // Base case
    if (root == NULL) return NULL;
 
    // If either n1 or n2 matches with root's key, report
    // the presence by returning root (Note that if a key is
    // ancestor of other, then the ancestor key becomes LCA
    if (root->data == v1 || root->data == v2)
        return root;
 
    // Look for keys in left and right subtrees
    node *left_lca  = lca(root->left, v1, v2);
    node *right_lca = lca(root->right, v1, v2);
 
    // If both of the above calls return Non-NULL, then one key
    // is present in once subtree and other is present in other,
    // So this node is the LCA
    if (left_lca && right_lca)  return root;
 
    // Otherwise check if left subtree or right subtree is LCA
    return (left_lca != NULL)? left_lca: right_lca; 
}