import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		Doctor doctor = new Doctor();
		Scanner in = new Scanner(System.in);
		System.out.print("������������");
		doctor.name = in.next();
		System.out.print("�������Ա�");
		doctor.sex = in.next();
		System.out.print("���������䣺");
		doctor.age=in.nextInt();
		//in.next();
		doctor.paySalary(10000);
		doctor.payTuition(7800);
		
		
		System.out.print("��Ӧ����˰�");
		System.out.println(doctor.getTaxMoney());
	}
}
