#Body
"""
 Compare two linked list
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 return back the head of the linked list in the below method.
"""

def CompareLists(headA, headB):
    nA = headA
    nB = headB
    while(nA != None and nB != None):
        if(nA.data != nB.data):
            return 0
        nA = nA.next
        nB = nB.next
    if(nA == None and nB == None):
        return 1
    else:
        return 0