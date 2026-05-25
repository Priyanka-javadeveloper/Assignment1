package com.treads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolusage {
public static void main(String[] args) {
	ExecutorService executor = Executors.newFixedThreadPool(2);
	
	for(int i=0;i<4;i++) {
		executor.execute(()->{
			System.out.println("Task"+Thread.currentThread().getName());
		});
	}
	executor.shutdown();

}
}
