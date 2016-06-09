package com.example.thread.deadlock;


public class ResourceB{
	
	
	public synchronized void messageA()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.getClass() + " Hello This is accuire by Thread D2");
	}
	
	public synchronized void messageB()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.getClass() + " Hello This is accuire by Thread D1");
	}


}