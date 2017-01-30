 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2) {
       // Base case
        if (root == null)
            return null;
    
        // If either n1 or n2 matches with root's key, report
        // the presence by returning root (Note that if a key is
        // ancestor of other, then the ancestor key becomes LCA
        if (root.data == v1 || root.data == v2)
            return root;
    
        // Look for keys in left and right subtrees
        Node left_lca = lca(root.left, v1, v2);
        Node right_lca = lca(root.right, v1, v2);
 
        // If both of the above calls return Non-NULL, then one key
        // is present in once subtree and other is present in other,
        // So this node is the LCA
        if (left_lca!=null && right_lca!=null)
            return root;
 
        // Otherwise check if left subtree or right subtree is LCA
        return (left_lca != null) ? left_lca : right_lca;
}