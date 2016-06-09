package com.example.thread;

public class DebitCard implements Runnable{

	Account acc;
	int withdrawAmount=0;
	
	public int getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(int withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public DebitCard(Account acc )
	{
		this.acc =acc;
	}
	
	public void run() {
		
		int balance = acc.checkBalance();
		System.out.println(Thread.currentThread().getName()+ " Current balance is " + balance);
		boolean b = acc.verifyBalance(this.getWithdrawAmount());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(b)
		{
			acc.withdraw(this.getWithdrawAmount());
		}
		
		
		System.out.println(Thread.currentThread().getName()+ " After withdraw Current balance is " + acc.checkBalance());
		
		
			}
	
	
	public static void main(String[] args) {
		
		Account acc = new Account(10000);
		DebitCard dc=new DebitCard(acc);
		DebitCard dc1=new DebitCard(acc);
		Thread th = new Thread(dc);
		dc.setWithdrawAmount(6000);
		th.setName("Shamik");
		th.start();
		

		Thread th1 = new Thread(dc1);
		dc1.setWithdrawAmount(8000);
		th1.setName("Swastika");		
		th1.start();
		
	}

}
