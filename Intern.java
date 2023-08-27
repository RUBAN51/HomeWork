//accessing variables of another class with instance

package homeworks;

public class Intern extends Employee{
	public static void main (String[] args) {
		Intern i = new Intern();
		i.EmpID=02;
		i.EmpName="Kishore";
		i.EmpXp=3;
		System.out.println(i.EmpID);
		System.out.println(i.EmpName);
		System.out.println(i.EmpXp);

	}
}
