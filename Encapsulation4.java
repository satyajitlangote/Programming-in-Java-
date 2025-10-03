//Encapsulation 
/* Consider the class Employee given below for representing employees of an organization. It has 5 different instance variables and a method to calculate the total salary based on the jobLevel.

Salary is calculated in the calculateSalary() method.

Make necessary changes to the class by making all the attributes private and by adding necessary accessor and mutator methods thus bringing in Encapsulation.

Download the Java project from here to solve this exercise in Eclipse.*/



class Employee {

	String employeeId;
	String employeeName;
	int salary;
	int bonus;
	int jobLevel;

	public void calculateSalary() {
		if (this.jobLevel >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		this.salary += this.bonus;
	}
}

class Tester {

	public static void main(String args[]) {

		Employee employee = new Employee();
		employee.employeeId = "C101";
		employee.employeeName = "Steve";
		employee.salary = 650;
		employee.jobLevel = 4;

		employee.calculateSalary();

		System.out.println("Employee Details");
		System.out.println("Employee Id: " + employee.employeeId);
		System.out.println("Employee Name: " + employee.employeeName);
		System.out.println("Salary: " + employee.salary);

	}
}
