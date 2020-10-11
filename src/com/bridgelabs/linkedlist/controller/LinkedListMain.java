package com.bridgelabs.linkedlist.controller;

public class LinkedListMain {
	public static <E> void main(String[] args) {

		MySortedLinkedList<Integer> linkedList = new MySortedLinkedList<Integer>();

		// calls add method to add element in the linked-list
		linkedList.add(70);
		linkedList.add(56);
		// linkedList.add(1, 30);

		linkedList.add(40);
		linkedList.add(30);

		// prints linked-list and it's size
		System.out.println("Size: " + linkedList.size());
		linkedList.printList();

		// removes element from linked-list when given node
		linkedList.remove(linkedList.getNode(40));

		System.out.println("Size: " + linkedList.size());
		linkedList.printList();

	}
}
