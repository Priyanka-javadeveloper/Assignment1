package com.FirstProject;

public class CashBackUpdater   {
double currentBalance;

 CashBackUpdater(double initialBalance) {
	this.currentBalance=initialBalance;
}

	 public void applyCashBack(double percent) {
		 double cashBackAmount = currentBalance+(percent/100);
		 System.out.println("Cash back applied :"+cashBackAmount);
		 System.out.println("New Balance:"+currentBalance);
	 }


}
