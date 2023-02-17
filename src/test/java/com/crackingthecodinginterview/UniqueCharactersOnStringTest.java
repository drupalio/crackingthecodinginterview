package com.crackingthecodinginterview;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UniqueCharactersOnStringTest {

	@InjectMocks
	private UniqueCharactersOnString uniqueUniqueCharactersOnString;
	
	@Test
	void uniqueCharactersTest() {
		assertTrue(uniqueUniqueCharactersOnString.findUniqueCharacters("asdfghjklñ"));
	}
	
	@Test
	void noUniqueCharactersTerst() {
		assertFalse(uniqueUniqueCharactersOnString.findUniqueCharacters("abfgggghjklñ"));
		assertFalse(uniqueUniqueCharactersOnString.findUniqueCharacters("aaasdfghjklñ"));
		assertFalse(uniqueUniqueCharactersOnString.findUniqueCharacters("abfgggghjkññññ"));
	}
}
                   