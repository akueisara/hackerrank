"""
 Insert a node into a sorted doubly linked list
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None, prev_node = None):
       self.data = data
       self.next = next_node
       self.prev = prev_node

 return the head node of the updated list 
"""
def SortedInsert(head, data):
    n = Node()
    n.data = data

    if(head == None):
        head = n
        return head 
    
    if(head.data > data):
        n.next = head
        head.prev = n
        head = head.prev
        return head

    hnext = head.next
    h = head

    while(hnext != None):
        if(data < hnext.data):
            h.next = n
            n.prev= h
            n.next = hnext
            hnext.prev = n
            return head
        hnext = hnext.next
        h = h.next

    h.next = n
    n.prev = h

    return head