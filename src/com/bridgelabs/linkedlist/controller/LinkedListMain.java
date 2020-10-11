package com.bridgelabs.linkedlist.controller;

public class LinkedListMain {
	public static <E> void main(String[] args) {

		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();

		// calls add method to add element in the specified position of the linked-list
		linkedList.add(56);
		linkedList.add(70);
		linkedList.add(1, 30);
		linkedList.add(linkedList.search(30), new Node<Integer>(40));

		// searches for given element in linked-list
		Node<Integer> node = linkedList.search(30);
		if (node != null)
			System.out.println("Element is present in linked list");
		else
			System.out.println("Element is not present in linked list");
		linkedList.printList();
	}
}
