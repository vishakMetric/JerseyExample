package com.java.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorRunnable {
	
	public static void main(String[]args) throws InterruptedException, ExecutionException {
		try {
			ExecutorService ex = Executors.newFixedThreadPool(10);
			RunExecutor runEx = new RunExecutor();
			RunOddExecutor rOdd = new RunOddExecutor();
			Future<?> future = null;
			future = ex.submit(runEx);
			//System.out.println(future.get());
			future= ex.submit(rOdd);
			//ex.execute(runEx);
			//Thread t = new Thread(runEx);
			//t.start();
			System.out.println(future.get());
			
			ex.shutdown();
		} catch(InterruptedException | ExecutionException ie) {
			ie.printStackTrace();
		}	
	}
	
	

}

class RunExecutor implements Runnable {
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("ExecutorRunnable:::"+i);
			try {
				Thread.sleep(10000);
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
	
}

class RunOddExecutor implements Runnable {
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			if(i %2 != 0) {
				System.out.println("RunOddExecutor:::"+i);
				try {
					Thread.sleep(1000);
				} catch(InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		}
	}
}
