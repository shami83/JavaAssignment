package com.example.thread;

public class CreateThreadbyExtend  extends Thread{
	
	
@Override
public void run()
{
	System.out.println("Execute the Thread " + Thread.currentThread().getName());
}

public static void main(String[] args) {
	
	System.out.println("Execute " + Thread.currentThread().getName());
	
	Thread thread = new CreateThreadbyExtend();
	thread.setName("My Custom thread");
	thread.start();
	
}
	
	
}
