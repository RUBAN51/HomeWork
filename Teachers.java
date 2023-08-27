//Creating a Class with name School where teacher can see all the info bu student can't

package homeworks;
class School{
	String name;
	String history;
	String branch;
	private int fees;
	int getValue() {
		return fees;
	}
	
}
public class Teachers extends School{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teachers t = new Teachers();
		t.name="Velammal";
		t.history="sixyears";
		t.branch="chennai";
		System.out.println(t.getValue());
	}

}
