package homeworks;
class Employee{
	public String EmpName;
	public int EmpID;
	public int EmpXp;
}


public class Fresher extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fresher f = new Fresher();
		f.EmpID=01;
		f.EmpName="Ruban";
		f.EmpXp=2;
		System.out.println(f.EmpID);
		System.out.println(f.EmpName);
		System.out.println(f.EmpXp);

		
	}

}
