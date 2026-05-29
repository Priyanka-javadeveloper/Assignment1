package com.FirstProject;
 class Demo implements Runnable{

	
	public void run() {
		while(true) {
			System.out.println("Cash updated!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			     e.printStackTrace();
			     break;//exit loop only if the thread is interrupted
			    }
		   //break; no break if you want to repeat
		}
		
	}
	
	}

public  class  CashUpdater{
public static void main(String[] args) {
	
	CashBackUpdater cbu = new CashBackUpdater(10);
	cbu.applyCashBack(5);
	
	Thread t = new Thread(new Demo());
	t.start();
}
}
