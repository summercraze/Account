/*
 * This is Student class which inherit the Person's class
 */

public class Student extends Person
{
	public final static String FRESHMAN = "Freshmen";
	public final static String SOPHOMORE = "Sophomore";
	public final static String JUNIOR = "Junior";
	public final static String SENIOR = "Senior";

	private String classStatus;

	//constructor
	public Student()
	{
		super();
		this.classStatus = JUNIOR;
	}
	public Student(String status)
	{
		super();
		this.classStatus = status;
	}
	public Student(String status,String name,String address,String number,String email)
	{
		super(name,address,number,email);
		this.classStatus = status;
	}

	//setter
	public void setStatus(String status)
	{
		this.classStatus = status;
	}

	//getter
	public String getStatus()
	{
		return this.classStatus;
	}

	@Override
	public String toString()
	{
		String statement = super.toString() + "\nClass Status : " + this.classStatus;
		return statement;
	}
}
