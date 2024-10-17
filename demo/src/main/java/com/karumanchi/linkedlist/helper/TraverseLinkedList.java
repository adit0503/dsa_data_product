package com.karumanchi.linkedlist.helper;

import java.util.ArrayList;
import java.util.List;

public class TraverseLinkedList {
    
    public static void traverse(Node head) {
        Node node = head;
        while(node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public static int[] traverseLL(ListNode head) {
        List<Integer> ans = new ArrayList<>();
        
        ListNode node = head;
        while(node != null) {
            // System.out.println(node.val);
            ans.add(node.val);
            node = node.next;
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
    
}
