package com.akudrin.code.leetcode;

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {

		if (head == null) {
			return true;
		}

		ListNode slow = head;
		ListNode fast = head;

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		ListNode secondHalfHead = reverse(slow.next);
		ListNode firstHalfHead = head;

		while (secondHalfHead != null && firstHalfHead != null) {
			if (firstHalfHead.val != secondHalfHead.val) {
				return false;
			}
			secondHalfHead = secondHalfHead.next;
			firstHalfHead = firstHalfHead.next;
		}

		return true;
	}

	private ListNode reverse(ListNode head) {
		ListNode newHead = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}

}
