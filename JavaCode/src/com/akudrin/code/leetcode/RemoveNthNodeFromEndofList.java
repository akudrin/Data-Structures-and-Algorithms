package com.akudrin.code.leetcode;

public class RemoveNthNodeFromEndofList {

	public ListNode removeNthFromEnd(ListNode head, int n) {

		// set dummy node to point to head of the list
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		// set up walker and runner to start at the dummy node
		ListNode runner = dummy;
		ListNode walker = dummy;

		// advance runner so that the distance between is n+1
		for (int i = 1; i <= n + 1; i++) {
			runner = runner.next;

		}

		// move runner to the end maintaining the gap
		while (runner != null) {
			runner = runner.next;
			walker = walker.next;
		}

		// delet n-th node from the end(walker is current at the n-1 node)
		walker.next = walker.next.next;
		return dummy.next;

	}

}
