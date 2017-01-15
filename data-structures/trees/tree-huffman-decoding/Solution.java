/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
        Node curr = root;
        for(char c: S.toCharArray()) {
            if(c == '0') {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
            if(curr.data != '\0') {
                System.out.print(curr.data);
                curr = root;
            }
        }       
    }
