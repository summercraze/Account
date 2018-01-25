/*
 * This is Staff class which inherit Employee
 */

public class Staff extends Employee
{
   private String title;
   
   //constructor
   Staff()
   {
	   super();
	   this.title = "Engineer";
   }
   Staff(String title)
   {
	   super();
	   this.title = title;
   }
   Staff(String title,String office,double salary,MyDate date,
			String name,String address,String number,String email)
   {
	   super(office,salary,date,name,address,number,email);
	   this.title = title;
   }
   
   //setter
   public void setTitle(String title)
   {
	   this.title = title;
   }
   
   //getter
   public String getTitle()
   {
	   return this.title;
   }
   
   @Override
	public String toString()
	{
		String statement = super.toString() + "\nTitle : " + this.title;
		return statement;
	}
}
