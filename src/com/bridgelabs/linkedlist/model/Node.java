package com.bridgelabs.linkedlist.model;

public class Node<E> {
	public E data;
	public Node<E> next;

	// constructor
	public Node(E data) {
		this.data = data;
	}
}