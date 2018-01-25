/*
 * Faculty class inherit Employee
 */

public class Faculty extends Employee
{
	public final static String LECTURER = "Lecturer";
	public final static String ASSISTANT_PROFESSOR = "Assistant Professor";
	public final static String ASSOCIATE_PROFESSOR = "Associate Professor";
	public final static String PROFESSOR = "Professor";
	private String officehour,rank;
	
	//constructor
	Faculty()
	{
		super();
		this.rank = LECTURER;
		this.officehour = "8:00 AM - 12:00 PM";
	}
	Faculty(String officeHour,String rank)
	{
		super();
		this.rank = rank;
		this.officehour = officeHour;
	}
	Faculty(String officeHour,String rank,String office,double salary,MyDate date,
			String name,String address,String number,String email)
	{
		super(office,salary,date,name,address,number,email);
		this.rank = rank;
		this.officehour = officeHour;
	}
	
	//setter
	public void setRank(String rank)
	{
		this.rank = rank;
	}
	public void setOfficehour(String officeHour)
	{
		this.officehour = officeHour;
	}
	
	//getter
	public String getRank()
	{
		return this.rank;
	}
	public String getOfficehour()
	{
		return this.officehour;
	}
	
	@Override
	public String toString()
	{
		String statement = super.toString() + "\nRank : " + this.rank + "\nOffice Hour : " + this.officehour;
		return statement;
	}
	
}
