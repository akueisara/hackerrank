/* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;

*/

static Node Insert(Node root, int value) {
    if (root == null) {
        Node n = new Node();
        n.data = value;
        return n;
    }
    Node curr = root;
    int comp = value - curr.data;
    while (comp < 0 && curr.left != null || comp > 0 && curr.right != null) {
        if (comp < 0) {
            curr = curr.left;
        } else {
            curr = curr.right;
        }
        comp = value - curr.data;
    }

    // curr points to the last node
    if (comp < 0) {
        Node newLeft = new Node();
        newLeft.data = value;
        curr.left = newLeft;
    } else if (comp > 0) {
        Node newRight = new Node();
        newRight.data = value;
        curr.right = newRight;
    } else {

    }
	
    return root;
}