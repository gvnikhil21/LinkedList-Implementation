package com.bridgelabs.linkedlist.controller;

import java.util.NoSuchElementException;

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
	public void add(int position, E data) {
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

	// overloading add method to add data after specified node
	public void add(Node<E> node, Node<E> nodeToAdd) {
		nodeToAdd.next = node.next;
		node.next = nodeToAdd;
	}

	// removes first element from the linked-list
	public void remove() {
		checkNoSuchElementException();
		head = head.next;
		size--;
	}

	// removes last element from the linked-list
	public void removeLast() {
		checkNoSuchElementException();
		Node<E> curr = head;
		while (curr.next != null && curr.next.next != null)
			curr = curr.next;
		curr.next = null;
		size--;
	}

	// checks for element exists or not
	public void checkNoSuchElementException() {
		if (size == 0)
			throw new NoSuchElementException("You are trying to remove from empty list!");
	}

	// searches for a element in linked list
	public Node<E> search(E data) {
		Node<E> curr = head;
		while (curr != null) {
			if (curr.data == data)
				return curr;
			curr = curr.next;
		}
		return null;
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
		System.out.println();
	}
}
