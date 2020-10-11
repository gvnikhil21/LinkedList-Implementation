package com.bridgelabs.linkedlist.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {

	MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();

	@Test
	public void givenInteger_WhenPresentInLinkedList_ShouldReturnTrue() {
		linkedList.add(56);
		linkedList.add(70);
		linkedList.add(1, 30);
		assertTrue(linkedList.search(30));
	}

}
