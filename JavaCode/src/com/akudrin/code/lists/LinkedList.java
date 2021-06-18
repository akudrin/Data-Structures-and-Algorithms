package com.akudrin.code.lists;

public class LinkedList<E> {

	private Node<E> head, tail;
	// O(1) to count how many elements in the list
	private int currentSize;

	public LinkedList() {
		head = tail = null;
		currentSize = 0;
	}

	// inner class to restrict access
	class Node<E> {
		E data;
		Node<E> next;

		public Node(E obj) {
			data = obj;
			next = null;
		}

	}

	public void addFirst(E obj) {
		Node<E> node = new Node<E>(obj);
		node.next = head;
		head = tail = node;
		currentSize++;
	}

//	// O(n) time complexity
//	public void addLast(E obj) {
//		Node<E> node = new Node<E>(obj);
//		if (head == null) {
//			head = node;
//			currentSize++;
//			return;
//		}
//		Node<E> tmp = head;
//		while (tmp.next != null) {
//			tmp = tmp.next;
//		}
//		tmp.next = node;
//		currentSize++;
//	}

	// O(1) time complexity
	public void addLast(E obj) {
		Node<E> node = new Node<E>(obj);
		if (head == null) {
			head = tail = node;
			currentSize++;
			return;
		}
		tail.next = node;
		tail = node;
		currentSize++;
	}

	public E removeFirst() {

		if (head == null) {
			return null;
		}
		E temp = head.data;

		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
		}
		currentSize--;
		return temp;

	}

	public E removeLast() {
		if (head == null) {
			return null;
		}
		if (head == tail) {
			return removeFirst();
		}
		Node<E> current = head, previous = null;
		while (current != tail) {
			previous = current;
			current = current.next;
		}

		previous.next = null;
		tail = previous;
		currentSize--;
		return current.data;

	}

}
