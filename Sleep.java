package com.treads;
//
//public class Sleep {
// 
//	    public static void main(String[] args) {  
//	        System.out.println("Start");  
//	        try {  
//	            Thread.sleep(2000); // Pause for 2000 milliseconds (2 seconds)  
//	        } catch (InterruptedException e) {  
//	            System.out.println("Thread interrupted");  
//	        }  
//	        System.out.println("End");  
//	    }  
//	}  

//class Sleep extends Thread{    
//	 public void run(){    
//	  for(int i=1;i<5;i++){   
//	  // the thread will sleep for the 500 milli seconds   
//	    try{
//	    	Thread.sleep(500);
//	    	}catch(InterruptedException e){
//	    		System.out.println(e);
//	    		}    
//	    System.out.println(i);    
//	  }    
//	 }    
//	 public static void main(String args[]){    
//	  Sleep t1=new Sleep();    
//	  Sleep t2=new Sleep();    
//	     
//	  t1.start();    
//	  t2.start();    
//	 }    
//	}    

class Sleep extends Thread{
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}//sleeping main method for 1 sec