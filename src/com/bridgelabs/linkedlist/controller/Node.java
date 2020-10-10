package com.bridgelabs.linkedlist.controller;

public class Node<E> {
	E data;
	Node<E> next;

	// constructor
	public Node(E data) {
		this.data = data;
	}
}
