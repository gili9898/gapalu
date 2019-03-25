package com.happu;

import java.util.concurrent.Callable;

public class SS implements Callable<String>{

	static int count = 0;
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		count++;
	 return "hello from Bikash.."+ count;
	}
	
	
	

}
