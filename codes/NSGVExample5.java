package day1.basicprogram;

public class NSGVExample5 {
	 int empId=1001;
	 double salary;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int age=15;
		System.out.println("Local variable age: "+age);
		NSGVExample5 n1 = new NSGVExample5();
		System.out.println("NSGV empId: "+n1.empId);
		System.out.println("NSGV salary: "+n1.salary);
		System.out.println("******Updated NSGV*************");
		n1.empId = 2001;
		n1.salary = 45000.68;
		System.out.println("NSGV empId: "+n1.empId);
		System.out.println("NSGV salary: "+n1.salary);
		System.out.println("********New Object NSGV****************");
		NSGVExample5 n2 = new NSGVExample5();
		System.out.println("n2 NSGV empId: "+n2.empId);
		System.out.println("n2 NSGV salary: "+n2.salary);
		System.out.println("Program ends");
	}

}
