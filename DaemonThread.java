package com.treads;
class Turn extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
		System.out.println("Daemon thread");
	}else {
		System.out.println("child thread");
	}
	}
}
public class DaemonThread{
	public static void main(String[] args) {
		//Thread.currentThread().setDaemon(true);
		System.out.println("main thread");
		Turn t = new Turn();
	    t.setDaemon(true);
		t.start();
		//System.out.println(Thread.currentThread().isAlive());
		//System.out.println(t.isAlive());
		//System.out.println(t.isDaemon());

	}
}
//main thread can never be turned in to a daemon thread
