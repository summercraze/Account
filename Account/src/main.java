/*
 * This is a code that practice with ArrayList
 * It print out the deposit and withdraw
 */
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class main 
{
	public static void main(String[] args)
	{
		//create a new account
	   Account acct1 = new Account(1122, 1000,"George");
	   acct1.mAnnualInterestRate = 1.5;
	   
	   //make several deposit and withdraw with the new account
	   acct1.deposit(30);
	   acct1.deposit(40);
	   acct1.deposit(50);
	   acct1.withdraw(5);
	   acct1.withdraw(4);
	   acct1.withdraw(2);
	   
	   //this is the account and deposit and withdraw
	   System.out.println("Account Holder Name : " + acct1.getName() );
	   System.out.println("Interest rate : " + acct1.mAnnualInterestRate + "%" );
	   System.out.println("Balance : " + acct1.getBalance());
	   System.out.format("%10s%12s%15s%15s%15s", "Date","Type", 
				" Amount","Balance","Description");
	   for(int i = 0 ;i < acct1.getTrasaction().size();i++)
		{
		    Date date = acct1.getTrasaction().get(i).getDate();
		    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			System.out.format("\n%12s", localDate.getDayOfMonth() + "/" + localDate.getMonthValue() 
			+ "/" + localDate.getYear());
			System.out.format("%9s",acct1.getTrasaction().get(i).getType());
			System.out.format("%15s","$" + acct1.getTrasaction().get(i).getAmount());
			System.out.format("%16s","$" + acct1.getTrasaction().get(i).getBalance());
			System.out.format("%14s",acct1.getTrasaction().get(i).getDescription());
		};
		
	}
}
