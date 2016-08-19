"""
 Find the node at which both lists merge and return the data of that node.
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 
"""

def FindMergeNode(headA, headB):
    if (headA == None and headB == None):
        return -1
    else:
        currentA = headA
        currentB = headB
        while(currentA != currentB):
            if(currentA.next == None):
                currentA = headB
            else:
                currentA = currentA.next
            if(currentB.next == None):
                currentB = headA
            else:
                currentB = currentB.next
        return currentA.data