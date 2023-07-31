package day1.basicprogram;

public class SNSGVExample6 {
	static int empId=1005;
	double salary=45000;
	int pinCode;

	public static void main(String[] args) {
		System.out.println("Program starts");
		int age =25;
		System.out.println("Local variable age: "+age);
		System.out.println("SGV empId: "+empId);
		System.out.println("SGV empId with std: "+SNSGVExample6.empId);
		SNSGVExample6 g1 = new SNSGVExample6();
		System.out.println("NSGV salary with g1: "+g1.salary);
		g1.salary=65000.45;
		System.out.println("NSGV salary updated with g1: "+g1.salary);
		empId=3001;
		System.out.println("SGV updated empId: "+empId);

		SNSGVExample6 g2 = new SNSGVExample6();
		System.out.println("NSGV salary with g2: "+g2.salary);
		System.out.println("Program ends");

	}

}
