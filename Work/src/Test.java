import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		Doctor doctor = new Doctor();
		Scanner in = new Scanner(System.in);
		System.out.print("请输入姓名：");
		doctor.name = in.next();
		System.out.print("请输入性别：");
		doctor.sex = in.next();
		System.out.print("请输入年龄：");
		doctor.age=in.nextInt();
		//in.next();
		doctor.paySalary(10000);
		doctor.payTuition(7800);
		
		
		System.out.print("年应缴纳税额：");
		System.out.println(doctor.getTaxMoney());
	}
}
