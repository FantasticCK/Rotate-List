package com.CK;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

// Time: O(N), Space: O(1)
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        int size = 0;
        ListNode curr = head, prev = head;
        while (curr != null) {
            size++;
            if (curr.next == null) {
                curr.next = head;
                break;
            } else
                curr = curr.next;
        }

        if (k % size == 0) {
            curr.next = null;
            return head;
        }
        int shift = size - k % size;
        curr = head;
        for (int s = 0; s < shift; s++) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
        return curr;
    }
}