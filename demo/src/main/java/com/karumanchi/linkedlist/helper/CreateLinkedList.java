package com.karumanchi.linkedlist.helper;

public class CreateLinkedList {

    public static ListNode createLL(int[] nums) {
        if (nums.length < 1) {
            return null;
        }
        ListNode curr = new ListNode(nums[0]);
        ListNode head = curr;

        for (int i = 1; i < nums.length; i++) {
            ListNode n = new ListNode(nums[i]);
            curr.next = n;
            curr = n;
        }
        return head;
    }

    public static Node create(int[] nums) {

        if (nums.length < 1) {
            return null;
        }

        Node curr = new Node(nums[0]);
        Node head = curr;

        for (int i = 1; i < nums.length; i++) {
            Node n = new Node(nums[i]);
            curr.setNext(n);
            curr = n;
        }
        return head;
    }

}
