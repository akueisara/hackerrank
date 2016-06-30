import sys

class Node:
    def __init__(self,data):
        self.right=self.left=None
        self.data = data
		
class Solution:
    def insert(self,root,data):
        if root==None:
            return Node(data)
        else:
            if data<=root.data:
                cur=self.insert(root.left,data)
                root.left=cur
            else:
                cur=self.insert(root.right,data)
                root.right=cur
        return root

	def levelOrder(self,root):
  	     #Write your code here
         if root != None:
            q = [root]
            while q:
                currentNode = q.pop()
                print currentNode.data ,
                if (currentNode.left != None):
                    q.insert(0,currentNode.left)
                if (currentNode.right != None):
                    q.insert(0,currentNode.right)    

T=int(raw_input())
myTree=Solution()
root=None
for i in range(T):
    data=int(raw_input())
    root=myTree.insert(root,data)
myTree.levelOrder(root)					