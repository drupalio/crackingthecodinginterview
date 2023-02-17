package com.crackingthecodinginterview;

class UniqueCharactersOnString {

	public boolean findUniqueCharacters(String line) {
		int counter = 0;
		return aCoolRecursiveMethod(line, counter);
	}

	private boolean aCoolRecursiveMethod(String line, int counter) {
		boolean result =true;
		if (counter < line.length()-1) {
			if(line.charAt(counter)!=line.charAt(++counter)) {
				result=aCoolRecursiveMethod(line, counter);
			}
			else {
				result=false;
			}
		}
		return result;
	}
}
