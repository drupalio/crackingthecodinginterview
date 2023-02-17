package com.crackingthecodinginterview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SummingTest {
	
	@InjectMocks
	private Summing summing;
	
	@Test
	void smallTest() {
		Integer[] elements= new Integer[]{2,4,8};
		assertEquals(14, summing.sum(elements));
	}
	
	@Test
	void midTest() {
		Integer[] elements= new Integer[]{1,2,3,4,10,11};
		assertEquals(31, summing.sum(elements));
	}
	
	
	@Test
	void LargeTest() {
		Integer[] elements= new Integer[]{68,54,51,93,61,75,65,66,34,20,76,33,40,3,79,7,96,28,42,45,17,90,99,44,62,32,52,72,30,31,24,71,9,6,67,1,85,16,95,25,14,59,73,2,88,58,55,84,78,35,48,43,11,19,98,49,89,97,29,57,77,53,13,4,10,69,12,80,22,47,83,87,21,86,23,60,50,15,41,36,56,5,94,81,91,46,26,82,37,27,92,38,8,74,18,39,100,70,63,64};
		assertEquals(5050, summing.sum(elements));
	}
}
