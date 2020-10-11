package com.bridgelabs.linkedlist.model;

import java.util.NoSuchElementException;

import com.bridgelabs.linkedlist.provider.ILinkedList;

public class MyLinkedList<E> implements ILinkedList<E> {
	private Node<E> head;
	private int size;

	// creates an empty list
	public MyLinkedList() {
	}

	// adds data to front of linked list
	public void addFirst(E data) {
		Node<E> temp = new Node<E>(data);
		temp.next = head;
		head = temp;
		size++;
	}

	// adds data to end of linked list
	public void addLast(E data) {
		Node<E> temp = new Node<E>(data);
		if (head == null) {
			head = temp;
			size++;
			return;
		}
		Node<E> curr = head;
		while (curr.next != null)
			curr = curr.next;
		curr.next = temp;
		size++;
	}

	// add method adds data to the end
	public void add(E data) {
		addLast(data);
	}

	// overloading add method to add data at specified position
	public void add(int position, E data) {
		checkIndexOutOFBoundsException(position);
		if (position == 0) {
			addFirst(data);
			return;
		}
		Node<E> temp = new Node<E>(data);
		Node<E> curr = head;
		for (int index = 0; index <= position - 2; index++)
			curr = curr.next;
		temp.next = curr.next;
		curr.next = temp;
		size++;
	}

	// overloading add method to add data after specified node
	public void add(Node<E> node, Node<E> nodeToAdd) {
		checkNullPointerException(node);
		nodeToAdd.next = node.next;
		node.next = nodeToAdd;
		size++;
	}

	// removes first element from the linked-list
	public void remove() {
		checkNoSuchElementException();
		head = head.next;
		size--;
	}

	// overloading remove method to remove element at specific position
	public void remove(int position) {
		checkIndexOutOFBoundsException(position);
		Node<E> curr = head;
		for (int index = 0; index <= position - 2; index++)
			curr = curr.next;
		Node<E> temp = curr.next;
		curr.next = temp.next;
		size--;
	}

	// overloading remove method to remove element from linked-list when given node
	public void remove(Node<E> node) {
		checkNullPointerException(node);
		Node<E> curr = head;
		while (curr.next != node && curr.next != null)
			curr = curr.next;
		curr.next = node.next;
		size--;
	}

	// removes last element from the linked-list
	public void removeLast() {
		checkNoSuchElementException();
		Node<E> curr = head;
		while (curr.next != null && curr.next.next != null)
			curr = curr.next;
		curr.next = null;
		size--;
	}

	// checks for null
	public void checkNullPointerException(Node<E> node) {
		if (node == null)
			throw new NullPointerException("Can't perform operation on null");
	}

	// checks for Index is out of bound or not
	public void checkIndexOutOFBoundsException(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
	}

	// checks for element exists or not
	public void checkNoSuchElementException() {
		if (size == 0)
			throw new NoSuchElementException("You are trying to remove from empty list!");
	}

	// searches for a element in linked list
	public boolean search(E data) {
		if (getNode(data) != null)
			return true;
		return false;
	}

	// returns the first node having specified data
	public Node<E> getNode(E data) {
		Node<E> curr = head;
		while (curr != null) {
			if (curr.data == data)
				return curr;
			curr = curr.next;
		}
		return null;
	}

	// returns the index of the first occurrence of the specified element
	public int indexOf(E data) {
		Node<E> curr = head;
		int index = 0;
		while (curr != null) {
			if (curr.data == data)
				return index;
			curr = curr.next;
			index++;
		}
		return -1;
	}

	// returns size of the linked list
	public int size() {
		return size;
	}

	// checks whether linked-list is empty
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	// prints linked list
	public void printList() {
		Node<E> temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			if (temp.next != null)
				System.out.print("->");
			temp = temp.next;
		}
		System.out.println();
	}
}
