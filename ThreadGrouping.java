package com.treads;
class UserGroup implements Runnable{

	
	public void run() {
		System.out.println("User group");
		
	}
	
}
public class ThreadGrouping {
public static void main(String[] args) {
	UserGroup ug = new UserGroup();
	ThreadGroup User_group =  new ThreadGroup("User Group");
	Thread t1 = new Thread(User_group,ug,"User_abc");
	t1.start();
	Thread t2 = new Thread(User_group,ug,"user_pqr");
	t2.start();
	Thread t3 = new Thread(User_group,ug,"user_xyz");
	t3.start();
	User_group.list();
	
	System.out.println(User_group.getMaxPriority());
	System.out.println(".........group count.................");
	System.out.println(User_group.activeGroupCount());
	System.out.println(".......group name..................");
	System.out.println(User_group.getName());
	
}
}
