/*
 * This is Employee class which inherit the Person's class
 */

public class Employee extends Person
{
	private String office;
	private double salary;
	private MyDate date;

	//constructor
	public Employee()
	{
		super();
		this.office = "Gaming supervisor";
		this.salary = 200000.00;
		this.date = new MyDate(1998,3,28);
	}
	public Employee(String office,double salary,MyDate date)
	{
		super();
		this.office = office;
		this.salary = salary;
		this.date = date;
	}
	public Employee(String office,double salary,MyDate date,
			String name,String address,String number,String email)
	{
		super(name,address,number,email);
		this.office = office;
		this.salary = salary;
		this.date = date;
	}

	//setter
	public void setOffice(String office)
	{
		this.office = office;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public void setDate(MyDate date)
	{
		this.date = date;
	}

	//getter
	public String getOffice()
	{
		return this.office;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public String getDate()
	{
		String date = this.date.getDay() + "/" + this.date.getMonth() + "/" + this.date.getYear();
		
		return date;
	}

	@Override
	public String toString()
	{
		String statement = super.toString() + "\nOffice : " + this.office + "\nSalary : $" 
				+ this.salary + "\nDate : " + this.date.getDay() + "/" + this.date.getMonth() + "/" + this.date.getYear();
		return statement;
	}
}
