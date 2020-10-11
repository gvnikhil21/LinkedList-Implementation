package com.bridgelabs.linkedlist.controller;

public class LinkedListMain {
	public static <E> void main(String[] args) {

		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();

		// calls add method to add element in the specified position of the linked-list
		linkedList.add(56);
		linkedList.add(70);
		linkedList.add(1, 30);
		linkedList.printList();
		linkedList.removeLast();
		linkedList.printList();
	}
}
