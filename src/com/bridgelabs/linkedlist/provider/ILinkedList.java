package com.bridgelabs.linkedlist.provider;

import com.bridgelabs.linkedlist.model.Node;

public interface ILinkedList<E> {
	void add(E data);

	E remove();

	E remove(int position);

	E remove(Node<E> node);

	E removeLast();

	void checkNullPointerException(Node<E> node);

	void checkIndexOutOFBoundsException(int index);

	void checkNoSuchElementException();

	boolean search(E data);

	int indexOf(E data);

	int size();

	boolean isEmpty();

	void printList();

}