"""
 Delete duplicate nodes
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 return back the head of the linked list in the below method.
"""

def RemoveDuplicates(head):
    n = head
    while (n.next != None):
        if(n.data==n.next.data):
            t = n.next
            n.next= t.next
        else:
            n = n.next
    return head