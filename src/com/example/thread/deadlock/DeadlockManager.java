package com.example.thread.deadlock;

public class DeadlockManager {
	
	public static void main(String[] args) {
		final ResourceA a =new ResourceA();
		final ResourceB b =new ResourceB();
		
		 Thread t1 = new Thread(){
			 
			 public void run()
			 {
				 a.messageA();
				
				 b.messageB();
			 }
			 
		 };
		 t1.setName("D1");
		 
 Thread t2 = new Thread(){
			 
			 public void run()
			 {
				 b.messageA();
				
				 a.messageB();
			 }
			 
		 };
		 t2.setName("D2");
		 System.out.println("Deadlock......");
		 t1.start();
		 t2.start();
		 System.out.println("Deadlock");
		 
		 
		 
		 
	}

}
