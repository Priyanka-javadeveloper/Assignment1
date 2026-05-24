package com.treads;
//class MyNewFirstThread extends Thread{
//	public void run() {
//		System.out.println("This is my new thread");
//	}
//}
//public class CreatingNewThread {
//public static void main(String[] args) {
//	MyNewFirstThread mt = new MyNewFirstThread();
//	mt.start();
//}
//}//by extending thread

class MyNewFirstThread implements Runnable{
	public void run() {
		System.out.println("This is my new thread");
	}
}
public class CreatingNewThread {
public static void main(String[] args) {
	MyNewFirstThread mt = new MyNewFirstThread();
	Thread t = new Thread(mt);
	t.start();
}
}//By implements runnable interface