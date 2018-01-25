import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class Account 
{

	private String mName;
	private int mId;
	private double mBalance;
	protected double mAnnualInterestRate; // AnnualInterestRate is percentage.
	private Date mDateCreated;
	private ArrayList<Transaction> transactions;


	public Account() 
	{
		this.mName = "Jane Dailey";
		this.mId = 308360;
		this.mBalance = 719194;
		this.mDateCreated = new Date();
		this.transactions = new ArrayList<Transaction>();

	}

	public Account(int id, double balance,String name) 
	{
		this.mName = name;
		this.mBalance = balance;
		this.mId = id;
		this.mDateCreated = new Date();
		this.transactions = new ArrayList<Transaction>();
	}


	public int getId() 
	{
		return mId;
	}

	public void setId(int id) 
	{
		mId = id;
	}

	public double getBalance()
	{
		return mBalance;
	}
    public String getName()
    {
    	return this.mName;
    }
    public ArrayList<Transaction> getTrasaction()
    {
    	return this.transactions;
    }
	public void setBalance(double balance) 
	{
		mBalance = balance;
	}

	public double getAnnualInterestRate() 
	{
		return mAnnualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) 
	{
		mAnnualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() 
	{
		return mDateCreated;
	}

	public double getMonthlyInterestRate() 
	{
		return mBalance * (mAnnualInterestRate / 12) / 100;
	}

	public void withdraw(double amount) 
	{
		mBalance -= amount;
		this.transactions.add(new Transaction(this.mDateCreated,'W',amount,this.mBalance,"Withdraw"));

	}

	public void deposit(double amount) 
	{
		mBalance += amount;
		this.transactions.add(new Transaction(this.mDateCreated,'D',amount,this.mBalance,"Deposit"));
		
	}



}