package com.coderscampus.Lesson_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	// Test-Driven Development Methodology
	// Step 1 - Write a failing test
	// Step 2 - Write the business logic to make the test pass
	// Step 3 - Refactor your code 

	@Test
	void should_add_one_item_to_list() {
		// Three A's
		// Arrange, Act, Assert
		
		// Arrange
		// sut : system under test
		CustomList<Integer> sut = new CustomArrayList<>();
		
		// Act
		sut.add(10);
		Integer expectedResult = sut.get(0);
		Integer expectedSize = sut.getSize();
		
		// Assert
		// What would we expect to happen?
		// I expect there to be an integer with a value of 10 stored in the first 
		// Index in my customList
		assertEquals(10, expectedResult);
		assertEquals(1, expectedSize);
//		assertEquals()
	}
	
	@Test
	void should_add_11_items_to_list() {
		// Arrange
		// sut : system under test
		CustomList<Integer> sut = new CustomArrayList<>();
		
		// Act
		for (int i = 1; i <= 11; i++) {
			sut.add(i);
		}
		
		// Assert
		
		for (int i = 0; i < 10; i++) {
			assertEquals(i+1, sut.get(i));
		}
		assertEquals(11, sut.getSize());
		
	}
	
	@Test 
	void should_add_21_items_to_list() {
		CustomList<Integer> sut = new CustomArrayList<>();
		// Test add
		for (int i = 1; i <= 21; i++) {
			sut.add(i);
		}
		// Test get
		for (int i = 0; i < 21; i++) {
			assertEquals(i+1, sut.get(i));
		}
		// Test size
		assertEquals(21, sut.getSize());
		
	}
	


}
