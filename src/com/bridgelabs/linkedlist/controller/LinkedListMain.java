package com.bridgelabs.linkedlist.controller;

public class LinkedListMain {
	public static <E> void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// calls add last method to add element in the end of the linked-list
		linkedList.addLast(56);
		linkedList.addLast(30);
		linkedList.addLast(70);

		// calls the method to print list
		linkedList.printList();
	}
}
