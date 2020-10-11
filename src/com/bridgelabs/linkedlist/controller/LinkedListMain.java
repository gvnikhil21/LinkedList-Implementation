package com.bridgelabs.linkedlist.controller;

public class LinkedListMain {
	public static <E> void main(String[] args) {

		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();

		// calls add method to add element in the linked-list
		linkedList.add(56);
		linkedList.add(70);
		linkedList.add(1, 30);
		linkedList.add(linkedList.search(30), new Node<Integer>(40));

		// prints linked-list and it's size
		System.out.println("Size: " + linkedList.size());
		linkedList.printList();

		// removes element from linked-list when given node
		linkedList.remove(linkedList.search(40));

		System.out.println("Size: " + linkedList.size());
		linkedList.printList();
	}
}
