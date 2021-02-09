package hw5_2;

public class Person {
	String name;
	String address;
	String SSN;
	Salary sal;
	public int  gain(Project proj)
	{
		int money = proj.giveSalary(sal);
		return money;
	}
}
