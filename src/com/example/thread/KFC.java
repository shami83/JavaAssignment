package com.example.thread;

public class KFC {
	
	private static KFC kfc = new KFC(10);
	
	public static KFC getInstance()
	{
		return kfc;
	}
	
	
	private int orderAmount;
	boolean processed=false;
	private KFC()
	{
		
	}
	private KFC(int amnt)
	{
		this.orderAmount=amnt;
	}
	
	public synchronized void processKFC(int i) throws InterruptedException
	{
		
			
				if(!processed)
				{
					System.out.println("Take out KFC piece " + "KFC"+i);				
					System.out.println("put it in Hot chamber for 2 miniutes "+ "KFC"+i);
					System.out.println("Decorate "+ "KFC"+i);
					System.out.println("******************");
					processed=true;
					notify();
				}
				else
				{
					wait();
					System.out.println("Wating for customer confirmation he has finshed " + "KFC");	
				}
				
			
		
	}
	
	public synchronized void serveKFC(int i) throws InterruptedException
	{
		
		
		
			if(!processed)
			{
				wait();
				System.out.println("Wating eagerly for " + "KFC"+i);	
			}
			System.out.println("Serve" + "KFC"+i);				
			System.out.println("eat"+ "KFC"+i);
			System.out.println("wating for next "+ "KFC");
			System.out.println("****************************");
			processed=false;
			notify();
			
	}
		
	
	
	
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public static void main(String[] args) {
		
			
		Thread processor =new Thread(){
			
			public void run()
			{
				try {
					for(int i =0 ; i<KFC.getInstance().getOrderAmount();i++)
					{
						KFC.getInstance().processKFC(i);
						Thread.sleep(1000);
					}
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
Thread customer =new Thread(){
			
			public void run()
			{
				try {
					for(int i =0 ; i<KFC.getInstance().getOrderAmount();i++)
					{
						KFC.getInstance().serveKFC(i);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		processor.start();
		customer.start();
		
	}

}
