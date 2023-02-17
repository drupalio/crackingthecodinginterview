package com.crackingthecodinginterview;

import java.util.stream.Stream;

class Summing {
	Integer result=0;
	public Integer sum(Integer[] elements) {
		Stream.of(elements).forEach(e->{
			{result+=e;}
		});
		return result;
	}
	
	
}
