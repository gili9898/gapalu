package com.happu;

public class ResouceClass implements AutoCloseable {

	@Override
	public void close() {
		System.out.println("yes its closed..");
		
	}

}
