package com.bridgelabs.linkedlist.controller;

public class MyLinkedList<E> {
	private Node<E> head;
	private int size;

	// adds data to front of linked list
	public void addFirst(E data) {
		Node<E> temp = new Node<E>(data);
		temp.next = head;
		head = temp;
		size++;
	}

	// adds data to end of linked list
	public void addLast(E data) {
		Node<E> temp = new Node<E>(data);
		if (head == null) {
			head = temp;
			size++;
			return;
		}
		Node<E> curr = head;
		while (curr.next != null)
			curr = curr.next;
		curr.next = temp;
		size++;
	}

	// add method adds data to the end
	public void add(E data) {
		addLast(data);
	}

	// overloading add method to add data at specified position
	public void add(int position, E data) throws IndexOutOfBoundsException {
		if (position < 0 || position > size)
			throw new IndexOutOfBoundsException("Index: " + position + " Size: " + size);
		if (position == 0) {
			addFirst(data);
			return;
		}
		Node<E> temp = new Node<E>(data);
		Node<E> curr = head;
		for (int index = 0; index <= position - 2; index++)
			curr = curr.next;
		temp.next = curr.next;
		curr.next = temp;
		size++;
	}

	// returns size of the linked list
	public int size() {
		return size;
	}

	// prints linked list
	public void printList() {
		Node<E> temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			if (temp.next != null)
				System.out.print("->");
			temp = temp.next;
		}
	}
}
