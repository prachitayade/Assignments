package Core_Java.Intermidiate_OOPS.Emp;

public class Labour extends Employee {

	public void totalSal(int sal,int overTime,int t) {
		System.out.println((sal*t)+((sal*1.5)*overTime));
	}
}
