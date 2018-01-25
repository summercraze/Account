/*
 * This is a code that help to understand the inheritance
 * This is the main class that test out all the  other classes
 * The first is Person class which contain name,address,phone number,email address
 * The second is Student class with status
 * The third is Employee class with name,address,phone number,and email address
 * The forth is Faculty class with office hour and rank
 * The fifth is Staff class with title
 */

public class main 
{
	public static void main(String[] args)
	{
		//variable MyDate for Employee and all inherited class
		MyDate date = new MyDate(2000,5,30);
		
		//this is the testing for Person class
		System.out.println("Test Person class's default constructor:");
		Person person1 = new Person();
		System.out.println(person1.toString());

		System.out.println("\nTest Person class's constructor with parameter :");
		Person person2 = new Person("John Black","3498 Feathers Hooves Drive,Huntington,New York,NY 11743"
				,"(453)-123-4596","hello@hetmail.com");
		System.out.println(person2.toString());

		System.out.println("\nTest Person class's method:");
		person2.setName("Allen Smith");
		System.out.println("\nNew Name : " + person2.getName());
		person2.setAddress("71 Pilgrim Avenue,Chevy Chase,Maryland,MD 20815");
		System.out.println("New Address : " + person2.getAddress());
		person2.setNumber("614-255-8877");
		System.out.println("New Phone Number : " + person2.getNumber());
		person2.setEmail("aSmith@helmail.com");
		System.out.println("New Email : " + person2.getEmail());

		//this is the testing for Student class
		System.out.println("\n**Begin testing Student's class:");
		System.out.println("Test default constructor:");
		Student student1 = new Student();
		System.out.println(student1.toString());

		System.out.println("\nTest Student's class constructor with parameter :");
		Student student2 = new Student(Student.FRESHMAN);
		System.out.println(student2.toString());
		Student student3 = new Student(Student.JUNIOR,"James John",
				"2108 Corpening Drive,Westland,Michigan,MI 48185","248-361-9867","JamesJJohn@rhyta.com");
		System.out.println(student3.toString());

		System.out.println("\nTest some Student's class method:");
		student3.setName("Kelly Flores");
		System.out.println("\nNew Name : " + student3.getName());
		student3.setStatus(Student.SOPHOMORE);
		System.out.println("New Class Status : " + student3.getStatus());
		student3.setAddress("3617 Maple Lane,Birmingham,Alabama,AL 35203");
		System.out.println("New Address : " + student3.getAddress());
		student3.setNumber("256-470-5122");
		System.out.println("New Phone Number : " + student3.getNumber());
		student3.setEmail("KellyDFlores@armyspy.com");
		System.out.println("New Email : " + student3.getEmail());

		//this is the testing for Employee class
		System.out.println("\n**Begin testing Employee's class:");				
		System.out.println("Test Employee's default constructor:");
		Employee employ1 = new Employee();
		System.out.println(employ1.toString());

		System.out.println("\nTest Employee's constructor with parameter :");
		Employee employ2 = new Employee("Gynecologist",500000.00,date);
		System.out.println(employ2.toString());
		date.setDay(23);
		date.setMonth(12);
		date.setYear(1998);
		Employee employ3 = new Employee("Computer technology trainer",10502733,date,
				"Rita Frank","1673 Simpson Square,Pike City,Oklahoma, OK 73438",
				"580-673-4352","RitaSFrank@teleworm.us");
		System.out.println(employ3.toString());

		System.out.println("\nTest Employee's method:");
		employ3.setName("Bradford Locker");
		System.out.println("\nNew Name : " + employ3.getName());
		employ3.setOffice("Chemical equipment operator");
		System.out.println("New Office : " + employ3.getOffice());
		employ3.setSalary(9458060);
		System.out.println("New Salary : $" + employ3.getSalary());
		date.setDay(30);
		date.setMonth(3);
		date.setYear(1988);
		employ3.setDate(date);
		System.out.println("New Date : " + employ3.getDate());
		employ3.setAddress("396 Michigan Avenue,Gibsonia,Pennsylvania, PA 15044");
		System.out.println("New Address : " + employ3.getAddress());
		employ3.setNumber("724-717-6480");
		System.out.println("New Phone Number : " + employ3.getNumber());
		employ3.setEmail("BradfordELocker@rhyta.com");
		System.out.println("New Email : " + employ3.getEmail());

		//this is the testing the Faculty class
		System.out.println("\n**Begin testing Faculty class:");				
		System.out.println("Test Faculty's default constructor:");
		Faculty faculty1 = new Faculty();
		System.out.println(faculty1.toString());

		System.out.println("\nTest Faculty's constructor with parameter :");
		Faculty faculty2 = new Faculty("12:00 PM - 2:00 PM",Faculty.ASSOCIATE_PROFESSOR);
		System.out.println(faculty2.toString());
		date.setDay(19);
		date.setMonth(8);
		date.setYear(1980);
		Faculty faculty3 = new Faculty("3:00 PM - 5:00 PM",Faculty.PROFESSOR,"Economic",63639,date,
				"Dan Lee","2817 Granville Lane,Newark,New Jersey,NJ 07102","973-440-4289","DanMLee@rhyta.com");
		System.out.println(faculty3.toString());

		System.out.println("\nTest Faculty's method:");
		faculty3.setName("Terry G. Mosley");
		System.out.println("New Name : " + faculty3.getName());
		faculty3.setOfficehour("12:30 PM - 1:30 PM");
		System.out.println("New Office Hour : " + faculty3.getOfficehour());
		faculty3.setRank(Faculty.LECTURER);
		System.out.println("New Rank : " + faculty3.getRank());
		faculty3.setOffice("Pharmaceutical");
		System.out.println("New Office : " + faculty3.getOffice());
		faculty3.setSalary(9208);
		System.out.println("New Salary : $" + faculty3.getSalary());
		date.setDay(15);
		date.setMonth(4);
		date.setYear(2013);
		faculty3.setDate(date);
		System.out.println("New Date : " + faculty3.getDate());
		faculty3.setAddress("3638 Sycamore Lake Road,Green Bay,Wisconsin, WI 54301");
		System.out.println("New Address : " + faculty3.getAddress());
		faculty3.setNumber("920-471-1830");
		System.out.println("New Phone Number : " + faculty3.getNumber());
		faculty3.setEmail("NellDDumont@dayrep.com");
		System.out.println("New Email : " + faculty3.getEmail());

		//this is the testing for Staff's class
		System.out.println("\n**Begin testing Staff's class:");				
		System.out.println("Test default constructor:");
		Staff staff1 = new Staff();
		System.out.println(staff1.toString());

		System.out.println("\nTest Staff's constructor with parameter :");
		Staff staff2 = new Staff("Officer");
		System.out.println(staff2.toString());
		date.setDay(8);
		date.setMonth(5);
		date.setYear(1989);
		Staff staff3 = new Staff("Anesthesiologist","Builders Emporium",732978,date,
				"Phillip Alvarado","32 Gerald L. Bates Drive, Woburn, Massachusetts,MA 01801","617-767-0643","PhillipTAlvarado@dayrep.com");
		System.out.println(staff3.toString());

		System.out.println("\nTest Staff's method:");
		staff3.setName("Martha Wilson");
		System.out.println("New Name : " + staff3.getName());
		staff3.setTitle("Cutter");
		System.out.println("New Title : " + staff3.getTitle());
		staff3.setOffice("Service Merchandise");
		System.out.println("New Office : " + staff3.getOffice());
		staff3.setSalary(6158);
		System.out.println("New Salary : $" + staff3.getSalary());
		date.setDay(9);
		date.setMonth(11);
		date.setYear(2014);
		staff3.setDate(date);
		System.out.println("New Date : " + staff3.getDate());
		staff3.setAddress("34381 Pennsylvania Avenue,Freehold,New Jersey, NJ 07728");
		System.out.println("New Address : " + staff3.getAddress());
		staff3.setNumber("732-294-1594");
		System.out.println("New Phone Number : " + staff3.getNumber());
		staff3.setEmail("NormanSGuillory@armyspy.com");
		System.out.println("New Email : " + staff3.getEmail());
	}
}
