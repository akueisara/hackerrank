   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
      Queue<Node> q = new LinkedList<Node>();
      q.add(root);
      while(!q.isEmpty()) {
        Node curr = q.remove();
        if(curr != null) {
          System.out.print(curr.data + " ");
          q.add(curr.left);
          q.add(curr.right);
        }
      }
    }
