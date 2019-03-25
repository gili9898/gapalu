package com.happu;

public class TestingResouce {
	
	public static void main(String[] args) {
		
		try(ResouceClass r = new ResouceClass()) {
		
			System.out.println("hello i have done Autoclosable ..");
		}
		
	}

}
