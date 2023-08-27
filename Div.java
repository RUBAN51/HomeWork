//arithmetic operations using method overriding and overloading

package homeworks;
 
import java.util.Scanner;
class add{
	void calculation(int x, int y) {
		int c=x+y;
		System.out.println("Addition: "+c);
	}
void calculation(float x, float y) {
	float c=x+y;
	System.out.println("Addition: "+c);
}}
class sub extends add{
	
	void calculation(int x, int y) {
		super.calculation(x, y);
		int c=x-y;
		System.out.println("Subtraction: "+c);
	}
	void calculation(float x, float y) {
		super.calculation(x, y);
		float c=x-y;
		System.out.println("Subtraction: "+c);
	}}
class mul extends sub{
	
	void calculation(int x, int y) {	
		super.calculation(x, y);
		int c=x*y;
		System.out.println("Multiplication: "+c);
	}
	void calculation(float x, float y) {	
		super.calculation(x, y);
		float c=x*y;
		System.out.println("Multiplication: "+c);
	}
	}

public class Div extends mul{
	void calculation(int x, int y) {
		super.calculation(x, y);
		int c=x/y;
		System.out.println("Divison: "+c);
	}
	void calculation(float x, float y) {
		super.calculation(x, y);
		float c=x/y;
		System.out.println("Divison: "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number in both integer and float:");
		int n1=s.nextInt();
		float n11=s.nextFloat();
		System.out.println("Enter the second number in both integer and float:");
		int n2=s.nextInt();
		float n22=s.nextFloat();
		Div d = new Div();
		System.out.println("-----Integer Value-----");
		d.calculation(n1, n2);
		System.out.println("-----Float Value-----");
		d.calculation(n11, n22);
		

	}

}
