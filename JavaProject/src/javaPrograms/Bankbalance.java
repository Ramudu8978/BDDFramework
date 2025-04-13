package javaPrograms;

 class Bankbalance {
	
	private double balance;//hiding data
	
	public Bankbalance(double intialbal)
	{
		this.balance=intialbal; //constuctor
	}
	
	public double getAmount()
	{
		return balance;
	}
	public double deposit(double amount)
	{
		return balance=balance+amount;
	}


 public static void main(String[] args)
 {
	 Bankbalance b=new Bankbalance(5000);
	 b.deposit(1000);
	 System.out.println(b.getAmount());
	 
 }
 }
