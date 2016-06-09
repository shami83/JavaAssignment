package com.example.thread;

public class SynchDebitCard implements Runnable{
	Account acc;
	int withdrawAmount=0;
	
	public int getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(int withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public SynchDebitCard(Account acc )
	{
		this.acc =acc;
	}
	
	
	public void run() {
		
		acc.doDebitOperation(this.getWithdrawAmount());
		
			}
	
	
	public static void main(String[] args) {
		
		Account acc = new Account(10000);
		SynchDebitCard dc=new SynchDebitCard(acc);
		SynchDebitCard dc1=new SynchDebitCard(acc);
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
