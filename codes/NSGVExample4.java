package day1.basicprogram;

public class NSGVExample4 {
	 int empId=1001;
	 double salary;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int age=15;
		System.out.println("Local variable age: "+age);
		NSGVExample4 n1 = new NSGVExample4();
		System.out.println("NSGV empId: "+n1.empId);
		System.out.println("NSGV salary: "+n1.salary);
		System.out.println("******Updated NSGV*************");
		n1.empId = 2001;
		n1.salary = 45000.68;
		System.out.println("NSGV empId: "+n1.empId);
		System.out.println("NSGV salary: "+n1.salary);
		System.out.println("Program ends");
	}

}
