package com.finalusages.java;
class main{
	 void run() {
		System.out.println("running");
	}
}
public class FinalMethod extends main{
  void run() {
	//we cannot ovverride it if we kept final in method
	System.out.println("running safely");
}
}
