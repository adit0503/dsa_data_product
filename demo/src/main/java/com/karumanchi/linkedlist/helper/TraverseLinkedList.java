package com.karumanchi.linkedlist.helper;

public class TraverseLinkedList {
    
    public static void traverse(Node head) {
        Node node = head;
        while(node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public static void traverseLL(ListNode head) {
        ListNode node = head;
        while(node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
    
}
