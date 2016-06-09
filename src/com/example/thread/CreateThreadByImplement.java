package com.example.thread;

public class CreateThreadByImplement implements Runnable{

	public void run() {
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName() + i);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		CreateThreadByImplement runnable = new CreateThreadByImplement();
		
		Thread th = new Thread(runnable);
		th.setName("Thread First");
		
		Thread th1 = new Thread(runnable);
		th1.setName("Thread Second");
		
		th.start();
		th1.start();
		
	}

}
