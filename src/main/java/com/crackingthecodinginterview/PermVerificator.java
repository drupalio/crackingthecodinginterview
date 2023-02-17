package com.crackingthecodinginterview;

class PermVerificator {
	public boolean isPermutation(String s1,String s2) {
		String sortedS1=sort(s1);
		String sortedS2=sort(s2);
		return sortedS1.equals(sortedS2)?true:false;
	}

	private String sort(String s) {
		return s.chars()
				.sorted()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			     .toString();
	}
}
