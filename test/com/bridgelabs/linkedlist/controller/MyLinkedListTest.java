package com.bridgelabs.linkedlist.controller;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void givenInteger_WhenPresentInLinkedList_ShouldReturnTrue() {
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.add(56);
		linkedList.add(70);
		linkedList.add(1, 30);
		assertTrue(linkedList.search(30));
	}

	@Test
	public void givenInteger_WhenAddedAfterAnInteger_ShouldAddAfterThatInteger() {
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.add(56);
		linkedList.add(30);
		linkedList.add(70);
		linkedList.add(linkedList.getNode(30), new Node<Integer>(40));

		boolean result = linkedList.getNode(30).next.data == 40;
		assertTrue(result);
	}

	@Test
	public void givenNodeData_WhenDeletedAndSearched_ShouldReturnFalse() {
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.add(56);
		linkedList.add(70);
		linkedList.add(1, 30);
		linkedList.add(linkedList.getNode(30), new Node<Integer>(40));

		linkedList.remove(linkedList.getNode(40));
		assertFalse((linkedList.search(40)));
	}

}
