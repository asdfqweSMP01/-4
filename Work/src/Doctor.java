
public class Doctor implements StudentIn, TeacherIn {

	public String name;
	public String sex;
	public int age;
	public double tuition;
	public double salary;
	
	public static final double tax=0.2;
	
	@Override
	public boolean paySalary(double money) {
		// TODO Auto-generated method stub
		salary = money;
		return true;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public boolean payTuition(double money) {
		// TODO Auto-generated method stub
		tuition = money;
		return true;
	}

	@Override
	public double getTuition() {
		// TODO Auto-generated method stub
		return tuition;
	}

	public double getTaxMoney() {
		return (salary-tuition)*12*tax;
	}
}
