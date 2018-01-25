/*
 * This is Person class
 */

public class Person 
{
	private String name,address,phoneNumber,emailAddress;

	//constructor
	public Person()
	{
		name = "Candy Gallegos";
		address = "185 Thompson Drive,San Francisco,California, CA 94107";
		phoneNumber = "510-478-0763";
		emailAddress = "CandyTGallegos@armyspy.com";
	}
	public Person(String name,String address,String number,String email)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = number;
		this.emailAddress = email;

	}

	//setter
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setNumber(String number)
	{
		this.phoneNumber = number;
	}
	public void setEmail(String email)
	{
		this.emailAddress = email;
	}

	//getter
	public String getName()
	{
		return this.name;
	}
	public String getAddress()
	{
		return this.address;
	}
	public String getNumber()
	{
		return this.phoneNumber;
	}
	public String getEmail()
	{
		return this.emailAddress;
	}

	public String toString()
	{
		String statement = "\nClass Name : " + this.getClass().getName() + "\nName : " + this.name + "\nAddress : " + this.address
				+ "\nPhone Number : " + this.phoneNumber + "\nEmail : " + this.emailAddress;
		return statement;
	}

}
