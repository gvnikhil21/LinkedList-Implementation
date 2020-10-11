package com.bridgelabs.linkedlist.provider;

import com.bridgelabs.linkedlist.model.Node;

public interface ILinkedList<E> {
	void add(E data);

	void remove();

	void remove(int position);

	void remove(Node<E> node);

	void removeLast();

	void checkNullPointerException(Node<E> node);

	void checkIndexOutOFBoundsException(int index);

	void checkNoSuchElementException();

	boolean search(E data);

	int indexOf(E data);

	int size();

	boolean isEmpty();

	void printList();

}