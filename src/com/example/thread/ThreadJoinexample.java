package com.example.thread;

public class ThreadJoinexample {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("Current thread is " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName() + " : I am going to wait for Thread shamik");
		Thread t = new Thread()
		{
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread().getName() + " :Executing and Counting " + i);
				}
			}
		};
		
		t.setName("Shamik");
		
		
		t.start();
		t.join();
		System.out.println(Thread.currentThread().getName()+  " :resume now");
	}

}
