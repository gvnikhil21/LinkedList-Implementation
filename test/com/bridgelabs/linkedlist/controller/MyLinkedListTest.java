package com.bridgelabs.linkedlist.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void givenInteger_WhenPresentInLinkedList_ShouldReturnTrue() {
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.add(56);
		linkedList.add(70);
		linkedList.add(1, 30);
		assertEquals(Integer.valueOf(30), linkedList.search(30).data);
	}

	@Test
	public void givenInteger_WhenAddedAfterAnInteger_ShouldAddAfterThatInteger() {
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.add(56);
		linkedList.add(30);
		linkedList.add(70);
		linkedList.add(linkedList.search(30), new Node<Integer>(40));

		boolean result = linkedList.search(30).next.data == 40;
		assertTrue(result);
	}

	@Test
	public void givenNodeData_WhenDeleted_ShouldReturnNull() {
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.add(56);
		linkedList.add(70);
		linkedList.add(1, 30);
		linkedList.add(linkedList.search(30), new Node<Integer>(40));

		linkedList.remove(linkedList.search(40));
		assertNull(linkedList.search(40));
	}

}
