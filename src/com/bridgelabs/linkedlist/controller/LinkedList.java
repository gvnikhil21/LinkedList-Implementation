package com.bridgelabs.linkedlist.controller;

public class LinkedList<E> {
	private Node<E> head;

	// adds data to front of linked list
	public void addFirst(E data) {
		Node<E> temp = new Node<E>(data);
		temp.next = head;
		head = temp;
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
