package com.example.thread;

public class Account {
	
	public Account(int balance)
	{
		this.balance = balance;
	}
	
	public int balance;
	
	public int checkBalance()
	{
		return balance;
	}
	
	public boolean verifyBalance(int withdrawlAmount)
	{
		return withdrawlAmount<=balance;
	}
	
	public void withdraw(int amnt)
	{
		
			balance = balance -amnt;
			System.out.println("new Balance is " + balance);
			return;
		
		
		
	}
	
	
	public synchronized void doDebitOperation(int amnt)
	{
		int balance = this.checkBalance();
		System.out.println(Thread.currentThread().getName()+ " Current balance is " + balance);
		boolean b = this.verifyBalance(amnt);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(b)
		{
			this.withdraw(amnt);
		}
		
		
		System.out.println(Thread.currentThread().getName()+ " After withdraw Current balance is " + this.checkBalance());
		
		
		
	}
	
	
	public void credit(int amnt)
	{
		
			balance = balance + amnt;	
		
	}


	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
