package homeworks;
class Person{
	public Person(){
		
	}
	private int n=32;
	void setValue(int num) {
		n = num;
	}
	int getValue() {
		return n;
	}
}
class Student extends Person{
	
}
class Teacher extends Person{
	
}
public class SuperClassHW extends Person{

	public static void main(String[] args) {
		Person s = new Person();
		s.setValue(33);
		System.out.println(s.getValue());
		
	}

}

