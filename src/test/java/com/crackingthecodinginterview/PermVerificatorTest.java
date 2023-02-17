package com.crackingthecodinginterview;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PermVerificatorTest {
	
	@InjectMocks
	private PermVerificator permVerificator;
	
	@Test
	void isPerm() {
		String s1= "ABC";
		String s2= "BCA";
		String s3= "CBA";
		String s4= "BAC";
		assertTrue(permVerificator.isPermutation(s1, s2));
		assertTrue(permVerificator.isPermutation(s1, s3));
		assertTrue(permVerificator.isPermutation(s1, s4));
	}
	
	@Test
	void isNotPerm() {
		String s1= "ABC";
		String s2= "BCD";
		assertFalse(permVerificator.isPermutation(s1, s2));
	}
}
