package com.karumanchi.linkedlist;

public class CreateLinkedList {
    
    public static ListNode createLL(int[] nums) {
        if(nums.length < 1) {
            return null;
        }
        ListNode curr = new ListNode(nums[0]);
        ListNode head = curr;

        for(int i=1; i<nums.length; i++) {
            ListNode n = new ListNode(nums[i]);
            curr.next = n;
            curr = n;
        }
        return head;
    }

    public static Node create(int[] nums) {

        if(nums.length < 1) {
            return null;
        }

        Node curr = new Node(nums[0]);
        Node head = curr;

        for(int i=1;i<nums.length;i++) {
            Node n = new Node(nums[i]);
            curr.setNext(n);
            curr = n;
        }
        return head;
    }

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

    public static void main(String[] args) {
        int[] nums = {1};
        // Node head = create(nums);
        // traverse(head);

        ListNode head = createLL(nums);
        traverseLL(head);


    }
}
