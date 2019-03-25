package com.happu;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exectttto {

	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService e = Executors.newFixedThreadPool(10);
		List<Future<String>> f = new ArrayList<Future<String>>();  
		
		
		for(int i = 0;i<5;i++) {
		 Future<String> future = e.submit(new SS());
		 f.add(future);
		}
		
		for(Future<String> s : f) {
			String ss = s.get();
			System.out.println(ss);
		}
	}
}
