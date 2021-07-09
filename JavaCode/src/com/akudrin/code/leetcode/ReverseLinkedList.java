package com.akudrin.code.leetcode;

public class ReverseLinkedList {

	private static ListNode head;

	public ListNode reverseList(ListNode head) {
		ListNode prev_node = null;
		ListNode next_node = null;

		while (head != null) {
			next_node = head.next;
			head.next = prev_node;
			prev_node = head;
			head = next_node;
		}

		return prev_node;

	}

	public void createLinkedList() {
		// Create Linked list
		// 10->8->1->11->null
		// 10 is head node of linked list
		head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);

		// attach them together to form a list
		head.next = second; // 10->8
		second.next = third;// 10->8->1
		third.next = fourth; // 10->8->1->11

	}

	public void display(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		ReverseLinkedList sll = new ReverseLinkedList();
		sll.createLinkedList();
		sll.display(head);
		ListNode reversedListHead = sll.reverseList(head);
		System.out.println();
		sll.display(reversedListHead);

	}

}

class ListNode {
	int val;
	ListNode next;

	public ListNode(int x) {
		val = x;
		this.next = null;
	}
}