//abstract class

package homeworks;

import java.util.Scanner;

abstract class Shapes{
	abstract void calculateArea(double r);
}

public class Circles extends Shapes{
	void calculateArea(double r) {
		double area = 3.14*(r*r);
		System.out.println("The area of circle: "+area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		double r = s.nextDouble();
		Shapes c = new Circles();
		c.calculateArea(r);
		
	}

}
