import java.util.Date;

public class Transaction {
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;

	public Transaction()
	{
		this.date = new Date();
		this.type = 'W';
		this.amount = 100;
		this.balance = 20034;
		this.description = "For birthday";
	}
	public Transaction(Date date,char type,double amount,double balance,String description)
	{
		this.date = date;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}
	public void setType(char type)
	{
		this.type = type;
	}
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}

	public Date getDate()
	{
		return this.date;
	}
	public char getType()
	{
		return this.type;
	}
	public double getAmount()
	{
		return this.amount;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public String getDescription()
	{
		return this.description;
	}
}
