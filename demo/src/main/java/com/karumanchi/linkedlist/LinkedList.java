package com.karumanchi.linkedlist;

import com.karumanchi.linkedlist.helper.CreateLinkedList;
import com.karumanchi.linkedlist.helper.ListNode;
import com.karumanchi.linkedlist.helper.Node;
import com.karumanchi.linkedlist.helper.TraverseLinkedList; 


public class LinkedList {

    public static int[] traverse_ll(int[] nums) {

        ListNode headLL = CreateLinkedList.createLL(nums);
        return TraverseLinkedList.traverseLL(headLL);
    }
    
    public static void main(String[] args) {
        
        int[] nums = {1,2,3};
        Node head = CreateLinkedList.create(nums);
        TraverseLinkedList.traverse(head);
    }
}
