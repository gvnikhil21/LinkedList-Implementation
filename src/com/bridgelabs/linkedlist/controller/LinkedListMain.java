package com.bridgelabs.linkedlist.controller;

public class LinkedListMain {
	public static <E> void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// calls add first method to add element in front of the linked-list
		linkedList.addFirst(70);
		linkedList.addFirst(30);
		linkedList.addFirst(56);

		// calls the method to list
		linkedList.printList();
	}
}
