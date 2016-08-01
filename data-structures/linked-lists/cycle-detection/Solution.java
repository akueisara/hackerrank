/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node fast = head;
    Node slow = head;
	
    while(fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if(slow.equals(fast)) {
            return true;
        }
    }
    return false;
}

/* Alternative way: using HashMap 
boolean hasCycle(Node head) {
    HashMap<Node, Integer> map = new HashMap<Node, Integer>();
    Node n = head;
    int i = 0;
    while(n != null) {
        if(!map.containsKey(n)) {
            map.put(n, i);
            i++;
        }
        else
            return true;
        n = n.next;
    }
    return false;
}
*/