package day1.basicprogram;

public class SgvExample3 {
	static int empId=1001;
	static double salary;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int age=15;
		System.out.println("Local variable age: "+age);
		System.out.println("SGV empId: "+empId);
		System.out.println("SGV salary: "+salary);
		System.out.println("********************************");
		System.out.println("SGV std empId: "+SgvExample3.empId);
		System.out.println("SGV std salary: "+SgvExample3.salary);
		System.out.println("*****updated SGV***************************");
		empId=1002;
		salary=25000.26;
		System.out.println("SGV std empId: "+SgvExample3.empId);
		System.out.println("SGV std salary: "+SgvExample3.salary);
		System.out.println("Program ends");
	}

}
