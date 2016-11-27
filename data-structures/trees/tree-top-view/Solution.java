/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
{
    Node curr = root;
    Stack<Integer> stack = new Stack<Integer>();
    while(curr != null) {
        stack.add(curr.data);
        curr = curr.left;
    }
    while(!stack.empty()) {
        System.out.print(stack.pop() + " ");
    }
    curr = root;
    while(curr.right != null) {
        curr = curr.right;
        System.out.print(curr.data + " ");
    }  
}
